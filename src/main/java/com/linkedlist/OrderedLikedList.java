package com.linkedlist;

public class OrderedLikedList<K extends Comparable<K>> {
    public Node<K> head;
    public Node<K> tail;

    public OrderedLikedList() {
        this.head = null;
        this .tail = null;
    }

    public void insert(Node<K> node, Node<K> newNode) {
        Node<K> tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public Node<K> search(K key) {
        Node<K> tempNode = head;
        while (tempNode != null ) {
            if (key.compareTo(tempNode.getNext().getKey()) < 0 && tempNode.getNext() != null)
                return tempNode;
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void addInOrder(Node<K> newNode) {
        if (head == null){
            head = newNode;
            tail = newNode;
        } else if (head.getKey().compareTo(newNode.getKey()) > 0) {
            Node<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        } else if (tail.getKey().compareTo(newNode.getKey()) < 0) {
            this.tail.setNext(newNode);
            this.tail = newNode;
        } else {
            Node<K> node = search(newNode.getKey());
            insert(node, newNode);
        }
    }

    public void printNode() {
        Node<K> tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.getKey());
            System.out.print((tempNode.getNext() == null) ? "" : " -> " );
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }
}
