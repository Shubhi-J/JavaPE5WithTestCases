package com.stackroute.javape5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CalculateNumberOfOccurrenceOfWord {

    // method to find total number of occurrences of a word in a string
    public HashMap<String,Integer> calculateNumberOfOccurrenceOfWord(String inputString) {

        // create a hashmap for output
        HashMap<String, Integer> output = new HashMap<>();
        // if input is null, return null only
        if (inputString == null) {
            output = null;
        } else {
            // convert input string to word array and replace all punctuations
            String[] wordArray = inputString.replaceAll("[^a-zA-Z0-9 ]", " ").split("\\s+");
            // run a loop over the words of the word array
            for (String word : wordArray) {
                // if hashmap does not contains the key, then add it to hashmap with count of key as 1
                if (!output.containsKey(word)) {
                    output.put(word, 1);
                    // if hashmap contains the key, then add it to hashmap with count of key as count+1
                } else {
                    output.put(word, output.get(word) + 1);
                }
            }
         }
        // return output hashmap
        return output;
    }
}
