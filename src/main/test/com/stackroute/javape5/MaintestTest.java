package com.stackroute.javape5;

import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MaintestTest {
    Maintest objMaintest;

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Before
    public void setUp(){
        objMaintest=new Maintest();
    }

    @After
    public void tearDown(){
        objMaintest=null;
    }

    @Test
    public void givenListOf5StudentShouldReturnSortedListOfStudents() {
        // arrange

        // act
        Student student1=new Student(1,"Shubhi",22);
        Student student2=new Student(2,"Charu",26);
        Student student3=new Student(3,"Parul",25);
        Student student4=new Student(4,"Pragya",20);
        Student student5=new Student(5,"Astha",30);




        String result=objMaintest.sortStudents(student1,student2,student3,student4,student5);

        // assert
        assertEquals("Student{id=5, name='Astha', age=30}Student" + "{id=2, name='Charu', age=26}" +
                "Student{id=3, name='Parul', age=25}Student{id=1, name='Shubhi', age=22}" +
                "Student{id=4, name='Pragya', age=20}",result);
    }

    @Test
    public void givenListOf5StudentWithSameAgeShouldReturnSortedListOfStudents() {
        // arrange

        // act
        Student student1=new Student(1,"Shubhi",20);
        Student student2=new Student(2,"Charu",20);
        Student student3=new Student(3,"Parul",20);
        Student student4=new Student(4,"Pragya",20);
        Student student5=new Student(5,"Astha",20);




        String result=objMaintest.sortStudents(student1,student2,student3,student4,student5);

        // assert
        assertEquals("Student{id=1, name='Shubhi', age=20}Student{id=4, name='Pragya', age=20}" +
                "Student{id=3, name='Parul', age=20}Student{id=2, name='Charu', age=20}" +
                "Student{id=5, name='Astha', age=20}",result);
    }
    @Test
    public void givenListOf5StudentWithSameAgeSameNameShouldReturnSortedListOfStudents() {
        // arrange

        // act
        Student student1=new Student(1,"Shubhi",20);
        Student student2=new Student(4,"Shubhi",20);
        Student student3=new Student(3,"Shubhi",20);
        Student student4=new Student(2,"Shubhi",20);
        Student student5=new Student(5,"Shubhi",20);

        String result=objMaintest.sortStudents(student1,student2,student3,student4,student5);

        // assert
        assertEquals("Student{id=5, name='Shubhi', age=20}Student{id=4, name='Shubhi', age=20}" +
                "Student{id=3, name='Shubhi', age=20}Student{id=2, name='Shubhi', age=20}" +
                "Student{id=1, name='Shubhi', age=20}",result);
    }
}