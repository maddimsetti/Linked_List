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
}
