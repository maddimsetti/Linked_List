package com.linkedlist;
/**
 * @description create Class for Defining the Queue List
 *
 */
public class Queue {
    //Variable
    private  final MyLinkedList myLinkedList;

    /**
     * @description create Constructor for Initializing the Queue List Variable
     *
     */
    public Queue() {
        this.myLinkedList = new MyLinkedList();
    }

    /**
     * @description create method for Appending the Nodes into the list
     *              Reusing LinkedList Append method
     */
    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }

    /**
     * @description create method for printing the Nodes from the list
     *              Reusing LinkedList Printing MyNode method
     *
     */
    public void printQueue() {
        myLinkedList.printMyNode();
    }

    /**
     * @description create method for Peeking the Nodes from the list,
     *               By Reusing LinkedList Peeking MyNode method
     *
     */
    public INode peek() {
        return myLinkedList.head;
    }

    /**
     * @description create method for Deleting the Nodes from the list,
     *               By Reusing LinkedList Printing MyNode method
     */
    public INode pop() {
        return myLinkedList.pop();
    }
}
