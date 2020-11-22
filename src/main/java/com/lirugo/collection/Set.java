package com.lirugo.collection;

public interface Set<E> extends Collection<E>{
    int size();
    boolean isEmpty();
    boolean remove(E e);
    boolean add(E e);
}
