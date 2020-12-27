/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: A.java
 * Date: 28/10/2020, 23:19
 */

package classeg.chapter6.exp3;

public class A {
    void test (int x) {
        System.out.println("test(int):"+x);
    }

    void test (long x) {
        System.out.println("test(long):"+x);
    }

    void test (double x) {
        System.out.println("test(double):"+x);
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.test(5.0);
        a1.test(5);;
    }
}
