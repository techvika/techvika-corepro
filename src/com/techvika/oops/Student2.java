package com.techvika.oops;

// parameterized constructor demo
public class Student2 {
    // id, name , age
    private long id;
    private String name;
    private int age;

    public Student2(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student2 student2 = new Student2(100,"mahesh", 24);
        student2.print();
    }
}