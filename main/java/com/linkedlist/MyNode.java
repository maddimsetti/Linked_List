package com.linkedlist;

/**
 * @description create SubClass for Defining the Variables
 *
 */
public class MyNode<K> implements INode<K> {
    //variables
    private K key;
    private INode next;

    /**
     * @description create Constructor for Initializing Objects
     *
     */
    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    /**
     * @description Creating Getter and setter method
     *
     */
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * @description Creating Getter and setter method from INode
     *
     */
    public INode getNext() {
        return next;
    }
    @Override
    public void setNext(INode next) {
        this.next = (MyNode<K>)next;
    }

}
