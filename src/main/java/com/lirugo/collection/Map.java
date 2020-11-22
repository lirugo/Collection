package com.lirugo.collection;

public interface Map<K, V> {
    int size();
    boolean isEmpty();
    boolean remove(V v);
    boolean add(K k, V v);
}
