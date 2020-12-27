/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Complex.java
 * Date: 28/10/2020, 23:33
 */

package classeg.chapter6.exp3;

import java.awt.color.CMMException;

public class Complex {
    private double x, y; // x, y分别代表复数的实部与虚部

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" +
                 x +
                ", " + y +
                "i }";
    }

    // 方法一 将复数与另一复数a相加
    public Complex add(Complex a) {
        return new Complex(x+a.x, y+a.y);
    }

    // 方法二 将复数与另一个有两实数 a, b 构成的复数相加
    public Complex add(double a, double b) {
        return new Complex(x+a, y+b);
    }

    // 方法三 将两复数a和b相加
    public static Complex add(Complex a, Complex b){
        return new Complex(a.x + b.x, a.y+b.y);
    }

    public static void main(String[] args) {
        Complex x, y, z;
        x = new Complex(4, 5);
        y = new Complex(3.4, 2.8);

        z = add(x, y);
        System.out.println("result="+z);

        z = x.add(y);
        System.out.println("result="+z);

        z = y.add(4, 5);
        System.out.println("result="+z);
    }
}
