package com.techvika.oops;

public class Student {

    // State(data/properties) of the class
    private String name;
    private int age;
    private int rollNumber;

    //behavior(methods) of the class
    public void study() {
        System.out.println(name + " is studying.");
    }

    public void writeExam() {
        System.out.println(name + " is writing the exam.");
    }

    public static void main(String[] args) {
        // Creating first Object
        Student s1 = new Student();

        // Setting properties
        s1.name = "John";
        s1.age = 20;
        s1.rollNumber = 101;

        // Calling methods/ behaviors
        s1.study();
        s1.writeExam();

        //identifying the object
        System.out.println("Student Identity:(Memory Address) " + s1);

        //creating second Object
        Student s2 = new Student();
        s2.name = "Alice";
        s2.age = 22;
        s2.rollNumber = 102;

        // Calling methods/ behaviors
        s2.study();
        s2.writeExam();

        //identifying the object
        System.out.println("Student Identity:(Memory Address) " + s2);
    }
}
