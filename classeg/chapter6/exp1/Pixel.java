/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Pixel.java
 * Date: 28/10/2020, 21:13
 */

package classeg.chapter6.exp1;

import java.awt.*;

public class Pixel extends Point {
    Color c;

    public Pixel(int x, int y, Color c) {
        super(x, y);
        this.c = c;
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "c=" + c +
                '}';
    }

    public static void main(String[] args) {
        Pixel x = new Pixel(3, 24, Color.blue);
        System.out.println(x);
    }
}
