package com.wjahatsyed.random.practice.new_2_package;

/**
 * Created by Syed Wajahat on 8/26/2020.
 * abstract class SUV extends Car
 */
public abstract class SUV extends Car {
    public void goForward() {
        System.out.println("Going forward");
    }

    public void reverse() {
        System.out.println("Look into the rear view");
    }

    public boolean enable4wd() {
        return true;
    }

    public abstract boolean goOffRoad();
}
