package com.linkedlist;
/**
 * @description create Class for Defining the HashMap
 */
public class MyHashMap<K extends Comparable<K>, V> {
    MyLinkedList<K> myLinkedList;
    /**
     * @description create Constructor for Initializing the variables
     */
    public MyHashMap() {
        myLinkedList = new MyLinkedList();
    }
    /**
     * @description create Method for implementing to get value of MyMapNode
     */
    public V get(K key) {
        MyMapNode<K, V> myMapNode =  (MyMapNode<K,V>) this.myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }
    /**
     * @description create Method for Adding the Key and value to Linked List
     */
    public void add(K key, V value) {
        MyMapNode<K,V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
        if(myMapNode == null) {
            myMapNode = new MyMapNode<>(key,value);
            this.myLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyHashMapNodes{" + myLinkedList + '}';
    }
}
