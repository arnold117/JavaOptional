/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Point.java
 * Date: 20/12/2020, 21:57
 */

package test.finalTest.prog.Test2;

public class Point{
    int x,y;     // 点的x,y坐标

    public Point ( int x, int y) {   //有参构造方法
        this.x=x;
        this.y=y;
    }

    public  Point( ) {    //无参构造方法创建的点在(0,0)位置
        new Point(0,0);      //调有参构造方法
    }

    public String toString() {
        return "("+x+","+y+")";
    }

    public static double distance(Point a ,Point b) {

        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));

    }

    public static void main(String args[]) {
        Point a = new Point ( );
        Point b = new Point(20,30);

        double d = distance(a, b);
        System.out.println(a+"和"+b+"之间的距离="+d);
    }
}
