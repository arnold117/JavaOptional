/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Sub.java
 * Date: 21/10/2020, 20:58
 */

package classeg.chapter6.discuss.d3;

public class Sub extends Parent {
    int k = 88;

    public void doSome() {
        k -= 20;
        System.out.println("k2=" + k);
    }

    public static void main(String[] args) {
        Parent obj = new Sub();
        obj.doSome();
        System.out.println("k3=" + obj.k);
    }
}
