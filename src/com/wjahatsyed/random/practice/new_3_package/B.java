package com.wjahatsyed.random.practice.new_3_package;

/**
 * Created by Syed Wajahat on 8/26/2020.
 */
public class B extends A {
    void foo(int i) {
        System.out.println(i);
    }

    public void foo() {
        System.out.println("Overridden");
    }
}
