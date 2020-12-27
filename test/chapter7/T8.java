/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: T8.java
 * Date: 06/11/2020, 12:36
 */

package test.chapter7;

public class T8 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        if(s1 == s2){
            System.out.print(1);
        } else {
            System.out.print(2);
        }
        if(s1.equals(s2)) {
            System.out.print(3);
        } else {
            System.out.print(4);
        }
    }
}
