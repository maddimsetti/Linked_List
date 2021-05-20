package com.linkedlist;

/**
 * @description create SubClass for Defining the Variables
 *
 */
public class MyNode<K> {
    //variables
    private K key;
    private MyNode next;

    /**
     * @description create Constructor for Initializing Objects
     *
     */
    public MyNode(K key) {
        this.key = null;
        this.next = null;
    }
    /**
     * @description Creating Getter and setter method
     *
     */
    public MyNode getNext() {
        return next;
    }
    public void setNext(MyNode next) {
        this.next = next;
    }
}
