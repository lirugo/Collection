package com.lirugo.collection;

public interface Map<K, V> {
    int size();
    void isEmpty();
    void remove(V v);
    void put(K k, V v);
    V get(K k);
}
