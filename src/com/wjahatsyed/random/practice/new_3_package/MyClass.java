package com.wjahatsyed.random.practice.new_3_package;

/**
 * Created by Syed Wajahat on 8/26/2020.
 * A synchronized method can only be accessed by one thread at a time
 * Ths keyword can only be applied to methods and it works with all types of modifiers.
 *
 * Argument is defined within the method parentheses while Parameter is the value passed to the method
 * while invoking that specific method
 */
public class MyClass {
    public synchronized void myPublicSynchronizedMethod() {
        System.out.println("public synchronized method");
    }
}
