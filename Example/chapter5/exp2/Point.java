/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: EGS
 * Filename: Point.java
 * Date: 11/10/2020, 11:37
 */

package classeg.chapter5.exp2;

public class Point {
    int x, y;

    {
        // 初始化块
    }

    public Point(int x, int y) {
        // 有参数的构造方法
        this.x = x;
        this.y = y;
    }

    public Point() {
        // 无参数构造方法
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(1,2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
