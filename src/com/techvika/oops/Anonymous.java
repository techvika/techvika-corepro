package com.techvika.oops;

public class Anonymous {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous inner class.");
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
