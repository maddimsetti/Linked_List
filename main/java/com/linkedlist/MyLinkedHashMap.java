package com.linkedlist;

import java.util.ArrayList;

/**
 * @description create Class for Defining the HashMap
 */
public class MyLinkedHashMap<K,V> {
    //Variables
    private final int noOfBuckets;
    ArrayList<MyLinkedList<K>> myBucketArray;
    /**
     * @description create Constructor for Initializing the Variables
     */
    public MyLinkedHashMap() {
        this.noOfBuckets = 10;
        this.myBucketArray = new ArrayList<>(noOfBuckets);
        //Create Empty LinkedList
        for(int i = 0; i < noOfBuckets; i++) {
            this.myBucketArray.add(null);
        }
    }

    //This implements hash function to find index for a key
    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % noOfBuckets;
        return index;
    }
    //This Implements getting the Word in the paragraph
    public V get(K key) {
        int index = this.getBucketIndex(key);
        MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if(myLinkedList == null) return null;
        MyMapNode<K,V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
        return (myMapNode == null ) ? null : myMapNode.getValue();
    }
    /**
     * @description create Method for Adding the Key and value to the Linked list
     */
    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if(myLinkedList == null) {
            myLinkedList = new MyLinkedList<>();
            this.myBucketArray.set(index,myLinkedList);
        }
        MyMapNode<K,V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
        if(myMapNode == null) {
            myMapNode = new MyMapNode<>(key,value);
            myLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyLinkedHashMap{" + myBucketArray +  '}';
    }
}
