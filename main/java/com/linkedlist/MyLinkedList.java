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
    public void append (INode<K> myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    /**
     * @description create Method for Inserting the Nodes InBetween the List
     * param: Here FirstNode Created first and then append the ThirdNode and then Insert the SecondNode
     *        In between FirstNode and ThirdNode and create the list
     *
     */
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    /**
     * @description create Method for Deleting the FirstElement in Linked List
     * param: First Creating the Sequence and then Delete the First Element in List Using pop method
     */
    public INode pop () {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    /**
     * @description create Method for Deleting the LastElement in Linked List
     * param: First Creating the Sequence and then Traverse the list and Delete the Last Element in List
     *        Using pop method
     */
    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode.setNext(null);
        return tempNode;
    }

    /**
     * @description create Method for Searching the Element in Linked List
     * param: First Creating the Sequence and then by Traversing the list search the Element in List
     */
    public boolean search (INode myNode) {
        INode tempNode = head;
        while(tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(myNode.getKey())) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    /**
     * @description create Method for Deleting the LastElement in Linked List
     * param: First Creating the Sequence and then Traverse the list and Delete the Element what we want in the List
     *        Using pop method
     */
    public void popNode(INode myNode) {
        INode tempNode = head;
        INode previousNode = null;
        while ( tempNode != null && tempNode.getKey() != myNode.getKey() ) {
            previousNode = tempNode;
            tempNode = tempNode.getNext();
        }
        previousNode.setNext(tempNode.getNext());
    }

    /**
     * @description create Method for Finding the Size of the Elements in Linked List
     * param: First Creating the Sequence and then by Traversing the list to count the Element in List
     */
    public int size() {
        int count = 0;
        INode tempNode = head;
        while(tempNode != null) {
            count++;               //counting the Elements
            tempNode = tempNode.getNext();
        }
        return count;
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
    /**
     * @description create Method for Searching the Key
     */
    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
    //Printing the Node
    public void printMyNodes() {
        System.out.println("MyNodes: " +head);
    }

    @Override
    public String toString() {
        return "MyLinkedListNodes{" +head+ '}';
    }
}
