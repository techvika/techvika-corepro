package com.techvika.oops;

public class Outer {

    static class Inner{
        void display() {
            System.out.println("This is a static inner class.");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.display();
    }
}
