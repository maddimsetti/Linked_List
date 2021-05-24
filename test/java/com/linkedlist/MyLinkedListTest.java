package com.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description create Class for Defining the Testing Linked LiSt
 *
 */
public class MyLinkedListTest {
    /**
     * @description create Method for Testing the Linked List Creation
     *
     */
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);                    //Making Relation between FirstNode and SecondNode
        mySecondNode.setNext(myThirdNode);                    //Making Relation between SecondNode and ThirdNode
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                         mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);                                //Testing for Creation of LinkedList
    }

    /**
     * @description create Method for Testing the Linked List by Adding the Node to The ThirdNode
     *
     */
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedAtTop () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.add(myThirdNode);     //Adding ThirdNode first to list
        mylinkedlist.add(mySecondNode);    //Adding SecondNode before the ThirdNode to list
        mylinkedlist.add(myFirstNode);     //Adding FirstNode before the SecondNode to list
        System.out.println("After Adding the Node With Data, The LinkedList Sequence");
        mylinkedlist.printMyNode();        //Printing the List
        boolean result = mylinkedlist.head.equals(myFirstNode) &&
                         mylinkedlist.head.getNext().equals(mySecondNode) &&
                         mylinkedlist.tail.equals(myThirdNode);
        Assertions.assertTrue(result);        //Testing the Adding Node Sequence
    }

    /**
     * @description create Method for Testing the Linked List After Appending the Second and ThirdNode
     *
     */
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAppendToLast () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.add(myFirstNode);        //Adding FirstNode first to list
        mylinkedlist.append(mySecondNode);    //Appending SecondNode to list
        mylinkedlist.append(myThirdNode);     //Appending ThirdNode last to list
        System.out.println("After Appending Nodes with Data, The LinkedList Sequence");
        mylinkedlist.printMyNode();        //Printing the List
        boolean result = mylinkedlist.head.equals(myFirstNode) &&
                mylinkedlist.head.getNext().equals(mySecondNode) &&
                mylinkedlist.tail.equals(myThirdNode);
        Assertions.assertTrue(result);        //Testing the Appending Node Sequence
    }

    /**
     * @description create Method for Testing the Linked List After Inserting the SecondNode Between The list
     *
     */
    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.add(myFirstNode);        //Adding FirstNode first to list
        mylinkedlist.append(myThirdNode);     //Appending ThirdNode last to list
        mylinkedlist.insert(myFirstNode,mySecondNode); //Inserting the SecondNode InBetween them
        System.out.println("After Inserting SecondNodes between them with Data, The LinkedList Sequence");
        mylinkedlist.printMyNode();        //Printing the List
        boolean result = mylinkedlist.head.equals(myFirstNode) &&
                         mylinkedlist.head.getNext().equals(mySecondNode) &&
                         mylinkedlist.tail.equals(myThirdNode);
        Assertions.assertTrue(result);        //Testing the Inserting Node Sequence
    }

    /**
     * @description create Method for Testing the Linked List After Deleting the FirstNode in the list
     *
     */
    @Test
    public void given3NumbersWhenDeletingFirstElementShouldPassLinkedListResult () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.add(myFirstNode);        //Adding FirstNode first to list
        mylinkedlist.append(myThirdNode);     //Appending ThirdNode last to list
        mylinkedlist.insert(myFirstNode,mySecondNode); //Inserting the SecondNode InBetween them
        mylinkedlist.pop();                    //Deleting the First Element in the List
        System.out.println("After Deleting FirstNodes with Data, The LinkedList Sequence");
        mylinkedlist.printMyNode();        //Printing the List
        boolean result = mylinkedlist.head.equals(mySecondNode) &&
                         mylinkedlist.tail.equals(myThirdNode);
        Assertions.assertTrue(result);        //Testing the Deleting FirstNode Sequence
    }

    /**
     * @description create Method for Testing the Linked List After Deleting the LastNode in the list
     *
     */
    @Test
    public void given3NumbersWhenDeletingLastElementShouldPassLinkedListResult () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.add(myFirstNode);        //Adding FirstNode first to list
        mylinkedlist.append(myThirdNode);     //Appending ThirdNode last to list
        mylinkedlist.insert(myFirstNode,mySecondNode); //Inserting the SecondNode InBetween them
        mylinkedlist.popLast();                    //Deleting the Last Element in the List
        System.out.println("After Deleting LastNodes with Data, The LinkedList Sequence");
        mylinkedlist.printMyNode();        //Printing the List
        boolean result = mylinkedlist.head.equals(myFirstNode) &&
                         mylinkedlist.tail.equals(mySecondNode);
        Assertions.assertTrue(result);        //Testing the Deleting LastNode Sequence
    }

    /**
     * @description create Method for Testing the Linked List After Searching the Element in the list
     * param: If search the Element found the result will be True, else the result will be false
     *
     */
    @Test
    public void given3NumbersWhenSearchingTheElementShouldPassLinkedListResult () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.add(myFirstNode);        //Adding FirstNode first to list
        mylinkedlist.append(myThirdNode);     //Appending ThirdNode last to list
        mylinkedlist.insert(myFirstNode,mySecondNode); //Inserting the SecondNode InBetween them
        mylinkedlist.printMyNode();        //Printing the List
        boolean result = mylinkedlist.search(mySecondNode);                    //Searching the Last Element in the List
        System.out.println("Searching the Nodes with Data 30, the element found: "+result);
        Assertions.assertTrue(result);        //Testing for Searching Element
    }
    /**
     * @description create Method for Testing the Linked List By searching the Element and Inserting the New Element in the List
     *
     */
    @Test
    public void given3NumbersWhenSearchingTheElementAndThenInsertAfterThatElementShouldPassLinkedListResult () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.add(myFirstNode);        //Adding FirstNode first to list
        mylinkedlist.append(mySecondNode);    //Appending SecondNode to list
        mylinkedlist.append(myThirdNode);     //Appending ThirdNode last to list
        mylinkedlist.search(mySecondNode);    //Searching The SecondNode in the List
        boolean result = mylinkedlist.search(mySecondNode);                    //Searching the SecondNode Element in the List
        Assertions.assertTrue(result);
        mylinkedlist.insert(mySecondNode,myFourthNode);  //Insert the FourthNode In Between The SecondNode and ThirdNode
        System.out.println("After Inserting FourthNode between them with Data, The LinkedList Sequence");
        mylinkedlist.printMyNode();        //Printing the List
        boolean result1 = mylinkedlist.head.equals(myFirstNode) &&
                         mylinkedlist.head.getNext().equals(mySecondNode) &&
                         mylinkedlist.head.getNext().getNext().equals(myFourthNode) &&
                         mylinkedlist.tail.equals(myThirdNode);
        Assertions.assertTrue(result1);        //Testing the Searching & Inserting Node Sequence
    }

    /**
     * @description create Method for Testing the Linked List By searching the Element and Inserting the New Element in the List
     *              and Delete the Element in the list and Check the Size of the List.
     */
    @Test
    public void given3NumbersWhenSearchingTheElementAndDeleteThatElementShouldPassLinkedListResult () {
        MyNode<Integer> myFirstNode = new MyNode<>(56);             //Creating object for Passing Nodes
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.add(myFirstNode);        //Adding FirstNode first to list
        mylinkedlist.append(mySecondNode);    //Appending SecondNode to list
        mylinkedlist.append(myThirdNode);     //Appending ThirdNode last to list
        mylinkedlist.insert(mySecondNode,myFourthNode);  //Insert the FourthNode In Between The SecondNode and ThirdNode
        mylinkedlist.printMyNode();        //Printing the List
        System.out.println("After Deleting the Key 40, The LinkedList Sequence");
        mylinkedlist.popNode(myFourthNode);   //Deleting the FourthNode
        boolean result = mylinkedlist.head.equals(myFirstNode) &&
                mylinkedlist.head.getNext().equals(mySecondNode) &&
                mylinkedlist.tail.equals(myThirdNode);
        Assertions.assertTrue(result);        //Testing the Searching & Inserting Node Sequence
        mylinkedlist.printMyNode();           //Printing the List
        int result1 = mylinkedlist.size();
        Assertions.assertEquals(3,result1);   //Testing the Size of the LinkedList
    }
}
