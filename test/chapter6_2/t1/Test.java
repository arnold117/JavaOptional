/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: ArrayTest.java
 * Date: 21/10/2020, 21:39
 */

package test.chapter6_2.t1;

public class Test {
    int m = 5;
    public void some(int x) {
        m = x;
    }
    public static void main(String args[ ]) {
      new Demo().some(7);
    }
}
class Demo extends Test {
    int m = 8;
    public void some(int x) {
        super.some(x);
        System.out.println(m);
    }
}