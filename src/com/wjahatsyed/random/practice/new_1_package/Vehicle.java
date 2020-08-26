package com.wjahatsyed.random.practice.new_1_package;

/**
 * Created by Syed Wajahat on 8/26/2020.
 * Vehicle abstract class
 */
public abstract class Vehicle {
    private String type;

    public abstract void goUpHill();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
