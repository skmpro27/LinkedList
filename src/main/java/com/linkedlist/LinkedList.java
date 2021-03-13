package com.linkedlist;

public class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Node newNode) {
        if (head == null)
            head = newNode;

        if (tail == null)
            tail = newNode;
        else {
            Node tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(Node newNode) {
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(Node node, Node newNode) {
        Node tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public Node pop() {
        Node tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void printNode() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.getKey());
            System.out.print((tempNode.getNext() == null) ? "" : " -> " );
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }

}
