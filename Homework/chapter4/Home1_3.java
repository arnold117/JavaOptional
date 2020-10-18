/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Home1_3.java
 * Date: 18/10/2020, 22:32
 */

package homework.chapter4;

import java.util.Scanner;

/**
 * 利用扫描器从键盘输入20个整数, 计算这些数的平均值, 统计大于平均值的元素个数.
 */
public class Home1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[20];
        int sum = 0, count = 0;
        double aver = 0;

        System.out.println("Please enter 20 INTERGERs:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
        }
        scan.close();

        aver = (double) (sum / 20.0);
        System.out.println("Average: " + aver);

        for (int i : a) {
            if (i > aver) {
                count++;
            }
        }
        System.out.println("There are " + count + " numbers bigger than average");
    }
}
