package com.stackroute.javape5;

import java.util.HashMap;

public class FindMoreThanTwoOccurrenceOfStringInArray {

    // method to find more two occurrence of a given string in array, if it comes more than two times return true
    // else return false

    public HashMap<String,Boolean> findOccurrenceOfStringInArray(String[] inputArray){
        HashMap<String, Boolean> output= new HashMap<>();
        // if input is null, return null only
        if (inputArray==null) {
            output = null;
        } else {
            // convert input string to word array and replace all punctuations
            for(String key:inputArray){
                if(!output.containsKey(key)){
                    output.put(key,false);
                } else {
                    output.put(key,true);
                }
            }
        }
        return output;
        }

    }

