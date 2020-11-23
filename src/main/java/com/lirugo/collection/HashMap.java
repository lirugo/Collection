package com.lirugo.collection;

import java.util.Objects;

public class HashMap<K, V> implements Map<K, V> {
    private Node<K, V>[] table = new Node[16];
    private int index = 0;

    @Override
    public int size() {
       return index;
    }

    @Override
    public void isEmpty() {
        throw new IllegalArgumentException("Not implemented yet..."); //TODO
    }

    @Override
    public void remove(V v) {
        throw new IllegalArgumentException("Not implemented yet..."); //TODO
    }

    @Override
    public void add(K k, V v) {
        table[index] = new Node(k, v, hash(k), null);
        index++;
    }

    @Override
    public V get(K key)  {
        throw new IllegalArgumentException("Not implemented yet..."); //TODO
    }

    private Node getNode(K key)  {
        throw new IllegalArgumentException("Not implemented yet..."); //TODO
    }

    static int hash(Object key) {
        return key == null ? 0 : key.hashCode();
    }

    static class Node<K, V>{
        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        Node(K key, V value, int hash, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }

        public final K getKey() {
            return this.key;
        }
        public final V getValue() {
            return this.value;
        }
        public final V setValue(V newValue) {
            V oldValue = this.value;
            this.value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this) {
                return true;
            } else {
                if (o instanceof java.util.Map.Entry) {
                    java.util.Map.Entry<?, ?> e = (java.util.Map.Entry)o;
                    if (Objects.equals(this.key, e.getKey()) && Objects.equals(this.value, e.getValue())) {
                        return true;
                    }
                }

                return false;
            }
        }

        public final int hashCode() {
            return Objects.hashCode(this.key) ^ Objects.hashCode(this.value);
        }

        public final String toString() {
            return this.key + "=" + this.value;
        }
    }
}
