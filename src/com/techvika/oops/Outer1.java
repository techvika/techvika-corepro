package com.techvika.oops;

public class Outer1 {

    class Inner1 {
        void display() {
            System.out.println("This is a non-static inner class.");
        }
    }

    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.Inner1 inner = outer.new Inner1();
        inner.display();
    }
}
