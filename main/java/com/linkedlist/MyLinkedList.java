package com.linkedlist;

/**
 * @description create Class for Defining the Linked List Problem
 *
 */
public class MyLinkedList<K> {
    public INode head;
    public INode tail;

    /**
     * @description create Constructor for Initializing the Objects
     *
     */
    public MyLinkedList () {
        this.head = null;
        this.tail = null;
    }

    /**
     * @description create Method for Adding the Nodes to List
     * param: Tail become Constant and adding head to tail
     *
     */
    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    /**
     * @description create Method for Appending the Nodes to List
     * param: Here Head Created first and then append the tail to head and create the list
     *
     */
    public void append (INode myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail != null) {
            this.tail.setNext(myNode);
        }
        this.tail = myNode;
    }

    /**
     * @description create Method for Printing the Linked List
     *
     */
    public void printMyNode () {
        StringBuffer myNodes = new StringBuffer(" My Nodes: ");
        INode tempNode = head;
        while( tempNode.getNext() != null ) {
            myNodes.append(tempNode.getKey());       //Appending the key to myNodes
            if(!(tempNode).equals(tail)) myNodes.append(" -> ");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());             //Appending the key to myNodes
        System.out.println(myNodes);
    }
}
