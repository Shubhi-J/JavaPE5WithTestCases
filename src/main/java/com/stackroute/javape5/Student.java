package com.stackroute.javape5;

public class Student {

    private int id;
    private String name;
    private int age;

    // parameterized constructor for student
    public Student(int id,String name,int age){
        // create properties of student class
        this.id=id;
        this.age=age;
        this.name=name;
    }

    // generate getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // generate toString method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
