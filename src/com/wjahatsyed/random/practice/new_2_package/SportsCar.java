package com.wjahatsyed.random.practice.new_2_package;

/**
 * Created by Syed Wajahat on 8/26/2020.
 * SportsCar concrete class extending Car abstract class
 */
public class SportsCar extends Car {
    public void goForward() {
        System.out.println("Going forward");
    }

    public void reverse() {
        System.out.println("Look into the rear view");
    }

    public void turn(int whichWay) {
        System.out.println("Turn " + whichWay);
    }

    //overriding startEngine method which is non-abstract in the abstract super class is optional

    public static void main(String[] args) {
        Car c = new SportsCar();
        c.startEngine();
    }

    //If we override the startEngine method, that would involve virtual method invocation even
    //if the reference is of the abstract class, the method from the concrete subclass shall be called
    //as it is overridden

    /*public void startEngine() {
        System.out.println("Whoom Whoom.. Mustang");
    }*/
}

