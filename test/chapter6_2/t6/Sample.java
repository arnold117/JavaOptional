/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Sample.java
 * Date: 21/10/2020, 21:45
 */

package test.chapter6_2.t6;

public class Sample{
    long length;
    public Sample(long x){ length = x; }
    public static void main(String arg[ ]){
        Sample s1, s2, s3;
        s1 = new Sample(21L);
        s2 = new Sample(21L);
        s3 = s2;
        long m = 21L;

        System.out.println(new Sample(m) == s1);
        System.out.println(s1.equals(m));
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }
}
