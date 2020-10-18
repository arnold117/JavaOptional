/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Home2.java
 * Date: 18/10/2020, 22:32
 */

package homework.chapter4;

/**
 * 编写一个判断方法用来判断一个整数是否为素数,方法的返回结果为布尔类型,
 * 
 * 利用该方法,找出3-50之间的所有双胞胎素数对,双胞胎素数是指相邻的2个奇数均为素数.
 * 
 * 
 */

public class Home2 {

    public static void main(String[] args) {
        Prime prime = new Prime();
        int count = 0;

        // 循环寻找双胞胎素数对
        for (int i = 3; i < 50; i++) {
            // 判断是否是双胞胎素数对
            if (prime.isPrime(i) && prime.isPrime(i + 2)) {
                // 是，保存数据至二维数组
                prime.setA(count, i, i + 2);
                count++;
            }
        }
        // 打印表格
        prime.printTableofA();
    }
}

/**
 * Prime
 */
class Prime {

    int a[][] = new int[50][2];

    // 判断是否是素数
    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 保存数据至二维数组
    public void setA(int x, int z1, int z2) {
        this.a[x][0] = z1;
        this.a[x][1] = z2;
    }

    // 打印表格
    public void printTableofA() {
        System.out.println("双胞胎素数对:");
        for (int[] is : this.a) {
            if (is[0] == 0) {
                break;
            }

            System.out.print("{");

            for (int i : is) {
                System.out.print(" " + i);
            }

            System.out.println(" }");
        }
    }
}