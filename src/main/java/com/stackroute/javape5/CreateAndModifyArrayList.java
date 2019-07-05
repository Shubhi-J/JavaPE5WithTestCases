package com.stackroute.javape5;
import java.util.ArrayList;

public class CreateAndModifyArrayList {

    // method to modify array list
    public String ModifyAndDisplayArrayList(int indexToBeChanged,String listElement) {

        String outputList="";
        // Create new ArrayList
        ArrayList<String> inputList= new ArrayList<>();
        // add elements to array list
        inputList.add("apple");
        inputList.add("grape");
        inputList.add("melon");
        inputList.add("berry");
        // print input list
        outputList="input list is : "+inputList+" \n";

        // update array list
        inputList.set(indexToBeChanged,listElement);

        // print list after update
        outputList=outputList+"updated list is : "+inputList+" \n";

        // remove all elements from list
        inputList.clear();

        // print list after removing all elements
        outputList=outputList+"input list after removing all elements "+inputList;

        // return output
        return outputList;
    }
}
