package com.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description create Class for Defining the Testing Queue List
 *
 */
public class QueueTest {
    /**
     * @description create Method for Queue list in a sequence of 56->30->70
     * Here 56 will be added first then 30 and then 70 to make 56 on top of the Stack
     */
    @Test
    public void given3NumbersWhenAddedToQueueShouldHaveFirstAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer> myThirdNode = new MyNode(70);
        Queue queue = new Queue();
        queue.enqueue(myFirstNode);    //Adding First Node to list
        queue.enqueue(mySecondNode);   //Adding Second Node to list
        queue.enqueue(myThirdNode);    //Adding Third Node to list
        queue.printQueue();            //Printing the list
        INode peek = queue.peek();
        Assertions.assertEquals(myFirstNode,peek);    //Testing the Queue list
    }

    /**
     * @description create Method for Deleting the element in Queue list as a sequence of 56->30->70
     * After Dequeue, the Sequence is 30->70
     */
    @Test
    public void given3NumbersInStackWhenPoppedShouldMatchWithLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer> myThirdNode = new MyNode(70);
        Queue queue = new Queue();
        queue.enqueue(myFirstNode);    //Adding First Node to list
        queue.enqueue(mySecondNode);   //Adding Second Node to list
        queue.enqueue(myThirdNode);    //Adding Third Node to list
        INode pop = queue.pop();
        queue.printQueue();            //Printing the list
        INode peek = queue.peek();
        Assertions.assertEquals(myFirstNode,pop);    //Testing the Popped Queue list
        Assertions.assertEquals(mySecondNode,peek);  //Testing the Peek Queue List
    }
}
