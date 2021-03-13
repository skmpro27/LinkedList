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
        Node<K> tempNode = this.head;
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

    public Node<K> search(K key) {
        Node<K> tempNode = this.head;
        while (tempNode != null ) {
            if (tempNode.getKey().equals(key))
                return tempNode;
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void insertAfterNode(Node<K> insertNode, K key) {
        Node<K> node = search(key);
        if(node != null) {
            insert(node, insertNode);
        } else
            System.out.println("No such node found");
    }


    public void searchDelete(K key) {
        Node<K> node = search(key);
        Node<K> tempNode = this.head;
        while (!tempNode.getNext().equals(node)) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(node.getNext());
        node.setNext(null);
    }

    public void size() {
        Node<K> tempNode = head;
        int count = 0;
        while (tempNode != null) {
            count++;
            tempNode = tempNode.getNext();
        }
        System.out.println(count);
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
