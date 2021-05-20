package com.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description create Class for Defining the Testing Linked LiSt
 *
 */
public class MyLinkedListTest {
    /**
     * @description create Method for Testing the Linked List Creation
     *
     */
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);                    //Making Relation between FirstNode and SecondNode
        mySecondNode.setNext(myThirdNode);                    //Making Relation between SecondNode and ThirdNode
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                         mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);                                //Testing for Creation of LinkedList
    }
    /**
     * @description create Method for Testing the Linked List Creation
     *
     */
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedAtTop () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.add(myThirdNode);     //Adding ThirdNode first to list
        mylinkedlist.add(mySecondNode);    //Adding SecondNode before the ThirdNode to list
        mylinkedlist.add(myFirstNode);     //Adding FirstNode before the SecondNode to list
        mylinkedlist.printMyNode();        //Printing the List
        boolean result = mylinkedlist.head.equals(myFirstNode) &&
                         mylinkedlist.head.getNext().equals(mySecondNode) &&
                         mylinkedlist.tail.equals(myThirdNode);
        Assertions.assertTrue(result);        //Testing the Adding Node Sequence
    }
}
