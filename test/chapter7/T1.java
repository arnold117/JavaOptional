/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: T1.java
 * Date: 06/11/2020, 12:17
 */

package test.chapter7;

public class T1 {
    public static void main(String[] args) {
        String s = new String("hello");
        myMethod(s);
        System.out.println("S=" + s);
    }

    public static void myMethod(String s) {
        s = s + "!";
    }
}
