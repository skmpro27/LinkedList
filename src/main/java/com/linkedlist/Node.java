package com.linkedlist;

public class Node<K> {
    private K key;
    private Node<K> next;

    public Node(K key) {
        this.key = key;
        this.next = null;
    }

    //getters and setters
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public Node<K> getNext() {
        return next;
    }

    public void setNext(Node<K> next) {
        this.next = next;
    }
}
