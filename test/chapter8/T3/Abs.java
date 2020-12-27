/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Abs.java
 * Date: 06/11/2020, 12:59
 */

package test.chapter8.T3;

public class Abs extends Base{
    public static void main(String[] args){
        Abs a = new Abs();
        a.amethod();
    }

    public void myfunc(){
        System.out.println("My Func");
    }

    public void amethod(){
        myfunc();
    }
}

abstract class Base {
    abstract public void myfunc();

    public void another() {
        System.out.println("Another method");
    }
}
