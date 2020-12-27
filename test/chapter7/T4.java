/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: T4.java
 * Date: 06/11/2020, 12:20
 */

package test.chapter7;

public class T4 {
    public static void main(String[] args) {
        String s = "Java是面向对象的语言,JavaScript是脚本语言";
        int k = -1;
        k = s.indexOf( '是', k + 1);
        System.out.print(k);
    }
}
