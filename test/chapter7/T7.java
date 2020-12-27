/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: T7.java
 * Date: 06/11/2020, 12:34
 */

package test.chapter7;

public class T7 {
    public static void main(String[] args) {
        StringBuffer x = new StringBuffer("你好");
        myMethod(x);
        System.out.print("x=" + x);
    }

    public static void myMethod(StringBuffer s) {
        s.append(",Hi");
    }
}
