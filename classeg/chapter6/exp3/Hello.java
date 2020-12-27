/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Hello.java
 * Date: 29/10/2020, 00:01
 */

package classeg.chapter6.exp3;

public class Hello {
    static void print(String title) {
        System.out.println("1");
    }

    static void print(String ... message ){
        System.out.println("2");
    }

    static void print(String title, String ... message) {
        System.out.println("3");
    }

    public static void main(String[] args) {
        print("Hello");
    }
}
