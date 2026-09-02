package com.techvika.oops;

public class Bike {

    // Attributes of the Bike class : Fields
     String color ="red";
     String brand ="Yamaha";
     int speed = 100;


    // Constructor to initialize the Bike object
    public Bike(String color, String brand, int speed) {
        this.color = color;
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display the details of start the bike
    public void start() {
        System.out.println("The " + color + " " + brand + " bike is starting with a speed of " + speed);
    }

    // Method to display the details of stop the bike
    public void stop() {
        System.out.println("The " + color + " " + brand + " bike is stopping.");
    }

    public static void main(String[] args) {
        // Create a Bike object
        Bike obj = new Bike("Red", "Yamaha", 100);

        // Start the bike
        obj.start();

        // Stop the bike
        obj.stop();
    }
}
