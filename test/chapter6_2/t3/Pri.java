/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Pri.java
 * Date: 21/10/2020, 21:41
 */

package test.chapter6_2.t3;

public class Pri extends Base{

    static int i = 200;

    public static void main(String argv[]){

        Pri p = new Pri();

        System.out.println(i);

    }

}

class Base{

    Base(){

        int i = 100;

        System.out.println(i);

    }

}