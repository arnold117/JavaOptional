/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: ArrayTest.java
 * Date: 18/10/2020, 22:41
 */

package classeg.chapter6.discuss.d2;

public class Test {
    static void method(long x) {
        System.out.println("r1=" +x);
    }

    static void method(int  x,int y) {
        System.out.println("r2=" +(x+y));
    }

    static void method(Object x) {
        System.out.println("r3=" +x);
    }

    public static void main (String args[]) {
        method("hello!");
        method(3 , 5);
        method(8);

    }
}
