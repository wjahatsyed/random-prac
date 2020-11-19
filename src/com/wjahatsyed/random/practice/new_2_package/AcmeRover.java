package com.wjahatsyed.random.practice.new_2_package;

/**
 * Created by Syed Wajahat on 8/26/2020.
 * Concrete class AcmreRover having SUV abstract superclass
 */
public class AcmeRover extends SUV {
    public void turn(int whichWay) {
        System.out.println("This way " + whichWay);
    }

    public boolean goOffRoad() {
        return true;
    }
}
