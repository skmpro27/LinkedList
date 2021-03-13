package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void givenNumbersCreateSimpleLinkedListTest() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        //to connect the node link in a list
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        //to test the test the list
        boolean result = firstNode.getNext().equals(secondNode) &&
                         secondNode.getNext().equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNumbersToAddInLinkedListTest() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        //to connect the node link in a list
        LinkedList linkedList = new LinkedList();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        linkedList.printNode();
        //to test the test the list
        boolean result = linkedList.head.equals(thirdNode) &&
                         linkedList.head.getNext().equals(secondNode) &&
                         linkedList.tail.equals(firstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNumbersToAppendInLinkedListTest() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        //to connect the node link in a list
        LinkedList linkedList = new LinkedList();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNode();
        //check for the proper implementation of the same
        boolean result = linkedList.head.equals(firstNode) &&
                         linkedList.head.getNext().equals(secondNode) &&
                         linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }
}
