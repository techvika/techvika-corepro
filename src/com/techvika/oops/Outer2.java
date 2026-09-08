package com.techvika.oops;

public class Outer2 {

    void show(){
        class LocalInner2{
            void display(){
                System.out.println("This is a local inner class.");
            }
        }
        LocalInner2 localInner = new LocalInner2();
        localInner.display();
    }

    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.show();
    }
}
