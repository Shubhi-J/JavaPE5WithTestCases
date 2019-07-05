package com.stackroute.javape5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortNamesUsingSet {

    public String sortNamesUsingSet(Set<String> inputSet){
        String output="";
        // check if input set size is less than zero return null
        if(inputSet.size()<=0){
            output=null;
        } else {
            // pass the unsorted set to tree set, because tree set always returns the sorted values
            TreeSet<String> outputSet=new TreeSet<>(inputSet);
            output=output+"Sorted set: "+outputSet+"\n";

            // pass the sorted values of set to an array list
            ArrayList<String> outputList=new ArrayList<>();
            // iterate over all element of sorted set
            for (String setElement : outputSet)
                // add elements to array list
                outputList.add(setElement);
            output=output+"Array list from set: "+outputList;
        }
        // return output
        return output;
    }
}
