/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: ArrayTest.java
 * Date: 28/10/2020, 23:30
 */

package classeg.chapter6.exp3;

public class Test {
    static void m(double x) {
        System.out.println("m(double:"+x);
    }

    static void m(Object obj) {
        System.out.println("m(Object):"+obj);
    }

    public static void main(String[] args) {
        m("hello");
        m(5);
    }
}
