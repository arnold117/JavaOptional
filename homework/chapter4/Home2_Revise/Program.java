/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Program.java
 * Date: 20/10/2020, 14:00
 */

/*
 * 编写一个判断方法用来判断一个整数是否为素数,方法的返回结果为布尔类型,
 * 利用该方法,找出3-50之间的所有双胞胎素数对,双胞胎素数是指相邻的2个奇数均为素数.
 */

package homework.chapter4.Home2_Revise;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Prime prime = new Prime();

        // 循环寻找双胞胎素数对
        for (int i = 3; i < 50; i++) {
            // 判断是否是双胞胎素数对
            if (prime.isPrime(i) && prime.isPrime(i + 2)) {
                // 是，保存数据至数组
                prime.setA(i, i + 2);
            }
        }
        // 打印表格
        prime.printTableOfA();
    }
}

class Prime {
    ArrayList<Unit> unitArrayList = new ArrayList<>();

    // 判断是否是素数
    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 保存数据至数组
    public void setA(int Int1, int Int2) {
        Unit temp = new Unit(Int1, Int2);
        unitArrayList.add(temp);
    }

    // 打印表格
    public void printTableOfA() {
        System.out.println("双胞胎素数对:");
        for (Unit unit : unitArrayList) {
            System.out.println(unit.toString());
        }
    }
}

// 数据结构
class Unit{
    int anInt;
    int anotherInt;

    @Override
    public String toString() {
        return "{ " +
                anInt +
                ", " + anotherInt +
                " }";
    }

    public Unit(int anInt, int anotherInt) {
        this.anInt = anInt;
        this.anotherInt = anotherInt;
    }
}
