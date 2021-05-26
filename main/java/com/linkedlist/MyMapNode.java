package com.linkedlist;
/**
 * @description create Class for Defining the MyMapNode to implements the INode
 */
public class MyMapNode<K, V> implements INode<K>  {
    //variables
    K key;
    V value;
    MyMapNode<K,V> next;

    /**
     * @description create Getter and setter fot implementing
     */
    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    //Override the myMapNode string
    public String toString() {
        StringBuffer myMapNodeString = new StringBuffer();
        myMapNodeString.append("MyMapNode {" + "K=").append(key)
                .append(" V=").append(value).append('}');
        if (next != null) {
            myMapNodeString.append("->").append(next);
        }
        return myMapNodeString.toString();
    }

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MyMapNode<K, V>)  next;
    }
}
