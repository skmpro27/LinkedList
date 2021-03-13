package com.linkedlist;

public class LinkedList<K> {
    public Node<K> head;
    public Node<K> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Node<K> newNode) {
        if (head == null)
            head = newNode;

        if (tail == null)
            tail = newNode;
        else {
            Node<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(Node<K> newNode) {
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(Node<K> node, Node<K> newNode) {
        Node<K> tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public Node<K> pop() {
        Node tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void popLast() {
        Node<K> tempNode = this.head;
        while (!tempNode.getNext().equals(this.tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode.setNext(null);
    }

    public int search(K key) {
        Node<K> tempNode = this.head;
        int position = 1;
        while (tempNode != null ) {
            if (tempNode.getKey().equals(key))
                return position;
            position++;
            tempNode = tempNode.getNext();
        }
        return 0;
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
