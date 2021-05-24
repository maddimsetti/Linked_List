package com.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description create Class for Defining the Testing Stack List
 *
 */
public class StackTest {
    /**
     * @description create method to Create a Stack of Sequence 56->30->70
     *    Here So 70 will be added first then 30 and then 56 to make 56 on top of the Stack
     */
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode(70);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer> myThirdNode = new MyNode(56);
        Stack stack = new Stack();
        stack.push(myFirstNode);     //Adding FirstNode to the list Using Stack
        stack.push(mySecondNode);    ////Adding SecondNode to the list Using stack
        stack.push(myThirdNode);     //Adding ThirdNode to the list Using stack
        stack.printStack();          //Printing the Stack
        INode peek = stack.peek();
        Assertions.assertEquals(myThirdNode,peek);   //Testing the Peek Point
    }
}

