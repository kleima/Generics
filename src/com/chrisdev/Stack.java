package com.chrisdev;

class Stack<E> {

    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }
    void push(E e) {
        elements[size++] = e;
    }
    E pop() {
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }
    boolean isEmpty() {
        return size == 0;
    }
}
