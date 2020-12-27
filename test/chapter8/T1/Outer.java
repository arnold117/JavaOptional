/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Outer.java
 * Date: 06/11/2020, 13:02
 */

package test.chapter8.T1;

public class Outer {
    public String name = "Outer";

    public static void main(String argv[]) {
//        Inner i = new Inner();
//        i.showName();
    }

    private class Inner{
        String name = new String("Inner");
        void showName(){
            System.out.println(name);
        }
    }
}
