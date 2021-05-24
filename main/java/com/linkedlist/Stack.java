package com.linkedlist;

/**
 * @description create Class for Defining the Stack File in Data Structure
 *
 */
public class Stack {
    //Variables
    private final MyLinkedList myLinkedList;

    /**
     * @description create Constructor for Initializing the Variables. Reuse the myLinkedList for Constructor
     *
     */
    public Stack() {
        this.myLinkedList = new MyLinkedList();
    }

    /**
     * @description create method for pushing the Nodes into the list Reusing LinkedList Add method
     *
     */
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    /**
     * @description create method for printing the Nodes from the list Reusing LinkedList Printing MyNode method
     *
     */
    public void printStack() {
        myLinkedList.printMyNode();
    }
    /**
     * @description create method for Peeking the Nodes from the list, Reusing LinkedList Peeking MyNode method
     *
     */
    public INode peek() {
        return myLinkedList.head;
    }
    /**
     * @description create method for Deleting the Nodes from the list, Reusing LinkedList Printing MyNode method
     *
     */
    public INode pop() {
        return myLinkedList.pop();
    }
}
