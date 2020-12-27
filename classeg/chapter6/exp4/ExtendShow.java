/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: ExtendShow.java
 * Date: 31/10/2020, 00:04
 */

package classeg.chapter6.exp4;

class SuperShow {
    int y = 8;
    int m = 2;

    void show() {
        System.out.println("sup.show,y="+y);
    }
}

public class ExtendShow extends SuperShow {
    int y = 20;
    int z =1;

    void show() {
        System.out.println("ext.show, y=" + y);
    }

    public static void main(String[] args) {
        ExtendShow b = new ExtendShow();
        SuperShow a = b;
        System.out.println("sup.y=" + a.y);
        System.out.println("ext.y" + b.y);

        b.show();
        a.show();
        System.out.println("z="+b.z+",m="+b.m);
    }
}