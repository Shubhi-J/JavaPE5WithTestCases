package com.stackroute.javape5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maintest {

    public String sortStudents(Student student1,Student student2,Student student3,Student student4,Student student5){
        String output="";

        // create an arrayList of student type to store student data as a list
        ArrayList<Student> inputList=new ArrayList<>();

        // add student objects to list
        inputList.add(student1);
        inputList.add(student2);
        inputList.add(student3);
        inputList.add(student4);
        inputList.add(student5);

    // sorting using Collections.sort(inputList, comparator);
        Collections.sort(inputList, new StudentSorter());

    // after Sorting arrayList: iterate using enhanced for-loop
        for(Student stu : inputList) {
            output=output+stu;
    }
        return output;
}
}
