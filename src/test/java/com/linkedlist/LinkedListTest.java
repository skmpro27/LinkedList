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
        //to add in linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
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
        //to append in linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
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

    @Test
    public void givenTwoNumbersAddThirdBetweenThemInLinkedListTest() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        //to append and insert
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(firstNode);
        linkedList.append(thirdNode);
        linkedList.printNode();
        linkedList.insert(firstNode, secondNode);
        linkedList.printNode();
        //check for the proper implementation of the same
        boolean result = linkedList.head.equals(firstNode) &&
                         linkedList.head.getNext().equals(secondNode) &&
                         linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteFirstNodeInLinkedListTest() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        //to append and pop
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNode();
        linkedList.pop();
        linkedList.printNode();
        //check for the proper implementation of the same
        boolean result = linkedList.head.equals(secondNode) &&
                         linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteLastNodeInLinkedListTest() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        //to append and pop from last
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNode();
        linkedList.popLast();
        linkedList.printNode();
        //check for the proper implementation of the same
        boolean result = linkedList.head.equals(firstNode) &&
                         linkedList.tail.equals(secondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void searchByValueInLinkedListTest() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        //to append and print
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNode();
        //check for the proper implementation of the same
        Node<Integer> result = linkedList.search(30);
        Assert.assertEquals(secondNode, result);
    }

    @Test
    public void givenNumberInsertInLinkedListTest() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        Node<Integer> insertNode = new Node<>(40);
        //to append and insert node
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNode();
        linkedList.insertAfterNode(insertNode, 30);
        linkedList.printNode();
        //to check is it inserted in between second and third node
        boolean result = secondNode.getNext().equals(insertNode) &&
                         insertNode.getNext().equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNumberDeleteFromLinkedListTest() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(40);
        Node<Integer> fourthNode = new Node<>(70);
        //to append fourth element
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.append(fourthNode);
        linkedList.printNode();
        linkedList.searchDelete(40);
        linkedList.printNode();
        linkedList.size();
        //to check is it inserted in between second and third node
        boolean result = secondNode.getNext().equals(fourthNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNumbersAddInOrderedLinkedListTest() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(40);
        Node<Integer> fourthNode = new Node<>(70);
        //to create an ordered list
        OrderedLikedList<Integer> linkedList = new OrderedLikedList<>();
        linkedList.addInOrder(firstNode);
        linkedList.addInOrder(secondNode);
        linkedList.addInOrder(thirdNode);
        linkedList.addInOrder(fourthNode);
        linkedList.printNode();
        //to check head and tail of list
        boolean result = linkedList.head.equals(secondNode) &&
                         linkedList.tail.equals(fourthNode);
        Assert.assertTrue(result);
    }
}
