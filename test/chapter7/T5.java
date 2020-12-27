/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: T5.java
 * Date: 06/11/2020, 12:30
 */

package test.chapter7;

public class T5 {
    public static void main(String[] args) {
        String s = "hello";
        String a = s.substring(0,1);
        System.out.println(a);
        a = "" + s.charAt(0);
        System.out.println(a);
        a = String.valueOf(s.charAt(0));
        System.out.println(a);
    }
}
