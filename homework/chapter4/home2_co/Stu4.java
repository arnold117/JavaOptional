/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Stu4.java
 * Date: 29/10/2020, 12:59
 */

package homework.chapter4.home2_co;

public class Stu4 {
    public static boolean isPrime(int a) {
        boolean isPrime = true;
        if(a<0||a==1||a%2==0&&a!=2) {
            isPrime = false;
        }
        else {
            for(int i=3;i<=Math.sqrt(a);i+=2) {
                if(a%i==0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println("双胞胎素数对有:");
        for(int i=3;i<=50;i+=2) {
            if(isPrime(i)) {
                if(isPrime(i+2)&&i+2<50) {
                    System.out.println(i+" "+(i+2));
                }
            }
        }
    }
}
