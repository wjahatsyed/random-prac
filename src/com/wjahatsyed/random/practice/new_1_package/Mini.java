package com.wjahatsyed.random.practice.new_1_package;

/**
 * Created by Syed Wajahat on 8/26/2020.
 * Mini concrete class
 */
public class Mini extends Car {
    public void goUpHill() {
        System.out.println("I am overridden in Mini class");
    }

    public static void main(String[] args) {
        //an object in memory can be accessed thru a reference of the same type
        //a reference of the parent class or an interface that is implemented by the class
        Car c = new Mini();
        c.setType("Hatchback");
        c.doCarThings();
        c.goUpHill();
        System.out.println(c.getType());
    }
}
