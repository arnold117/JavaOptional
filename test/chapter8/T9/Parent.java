/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Parent.java
 * Date: 06/11/2020, 12:44
 */

package test.chapter8.T9;

abstract class Parent {
    int x = 20;
    abstract void dosomething();
}

class Sub extends Parent {
    int x = 30;

    public static void main(String[] args) {
        Parent x = new Sub();
        x.dosomething();
    }

    @Override
    void dosomething() {
        System.out.println("努力"+x);
    }
}
