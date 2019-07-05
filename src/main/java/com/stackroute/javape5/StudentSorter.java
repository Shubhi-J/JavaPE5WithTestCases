package com.stackroute.javape5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {

        // for comparison
        // compare names
        int NameCompare = student2.getName().compareTo(student1.getName());
        // compare age
        int AgeCompare = student2.getAge()-student1.getAge();
        // compare id
        int IdCompare = student2.getId()-student1.getId();

        // 3-level comparison using if-else block

        // if age is not same for all students, sort by age
        if (AgeCompare == 0) {
            // if age is same for all students, check whether name of all students are same
            if(NameCompare==0){
                // if name of students are same, then sort by Id
                return IdCompare;
            } else {
                return NameCompare;
            }
          } else {
            return AgeCompare;
        }
    }
}
