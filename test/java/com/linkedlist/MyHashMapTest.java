package com.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * @description create Class for Defining the HashMap Test for a line
 */
public class MyHashMapTest {
    /**
     * @description create Method for testing to find the frequency of the sentence
     */
    @Test
    public void given4Sentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split("");
        for(String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null) value =1;
            else value = value + 1;
            myHashMap.add(word,value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
        Assertions.assertEquals(2,frequency);
    }
}
