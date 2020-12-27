/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Test.java
 * Date: 20/12/2020, 22:33
 */

package test.finalTest.normal.t10;

public class Test {
    public static void main(String args[]) {

        String  str = new String("New");

        char  ch[] = {'B','e'};

        change(str,ch);

        System.out.println(str + "," + new String(ch));

    }

    public static void change(String str, char ch[]) {

        str = "Old";  ch[0] = 'H';

    }
}
