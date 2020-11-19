package com.wjahatsyed.random.practice;

/**
 * Created by Syed Wajahat on 8/26/2020.
 * var-args are the last argument in a method.
 * We can use [] or ellipsis (...) for this
 * There could be only one var-args in the method.
 */
public class VarArgs {
    public static void main(String... args) {

    }

    public static void main(int a, String[] args) {
        //overloaded. not called by JVM
    }

    public void myMethod(String... args) {

    }

    public void myMethod2(String args[]) {

    }

    //illegal
    /*public void myMethod3(String args...) {

    }*/
}
