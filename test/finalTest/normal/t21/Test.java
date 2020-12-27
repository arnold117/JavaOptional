/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Test.java
 * Date: 20/12/2020, 22:44
 */

package test.finalTest.normal.t21;

public class Test {
    public static void main(String[] args) {
        try {
            throw new E1();
        }
        catch(E1 x) { }

        String s = "hello";

        String t = "hello";

        char c[] = {'h','e','l','l','o'} ;
        System.out.println(s==t);
        System.out.println(s.equals(t));
        System.out.println(t.equals(s));
        System.out.println(t.equals(new String("hello")));
    }
}

class E1 extends Exception{}

class E2 extends E1{}