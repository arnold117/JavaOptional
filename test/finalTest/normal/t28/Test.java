/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Test.java
 * Date: 20/12/2020, 22:51
 */

package test.finalTest.normal.t28;

public class Test {
    public static void main(String args[]) {

        int x[] = { 16,8,-8,9,25 };

        try {

            System.out.print("结果=" + x[3]);

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.print("array out of range");

        }

    }
}
