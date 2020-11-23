package com.lirugo.collection;

public interface Map<K, V> {
    int size();
    boolean isEmpty();
    void remove(K key);
    void put(K key, V value);
    V get(K key);
}
