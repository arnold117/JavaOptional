/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Base.java
 * Date: 20/11/2020, 01:01
 */

package test.chapter9;

public class Base {
    public void amethod(int i) {}


}

class Scope extends Base{
    public static void main(String[] args) {

    }
    // Method here

//    public void amethod(String  i) { }
//
//    public void amethod(int i)  { }
//
// {Don't Work!}   public void amethod(int i) throws Exception {}
//
//    public void amethod(long i)  { }
}
