/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Teacher.java
 * Date: 21/10/2020, 21:18
 */

package test.chapter6.t4;

public class Teacher extends Person{
    public int b;

    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();
        int i;

        i = p.change(30);
    }
}

class Person {
    private int a;
    public int change(int m) {
        return m;
    }
}