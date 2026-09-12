package com.techvika.oops;

// default constructor demo
public class Student1 {
    // id, name , age
    private long id;
    private String name;
    private int age;

    void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student1 student1= new Student1();
        student1.print();
    }

}
