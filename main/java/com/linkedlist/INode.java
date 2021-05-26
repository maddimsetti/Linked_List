package com.linkedlist;
/**
 * @description create Class for Defining the INode
 */
public interface INode<K> {
    //Creating Getter and setter for implementing
    K getKey();
    void setKey(K key);

    INode getNext();
    void setNext(INode next);

}
