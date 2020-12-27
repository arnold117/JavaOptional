/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Student1.java
 * Date: 29/10/2020, 12:50
 */

package homework.chapter4.home2_co;

public class Student1 {
        public static boolean panduan(int n) {
            for (int m = 2; m < n; m++) {
                if (n % m == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println("3-50以内得双胞胎素数对为：");
            int x1 = 3;
            int x2 = 3;
            for (int i = 3; i < 50; i++) {
                boolean w = panduan(i);
                if (w == true) {
                    x2 = x1;
                    x1 = i;
                    if (x1 - x2 == 2) {
                        System.out.printf("双胞胎素数：%d	%d\n", x2, x1);
                    }
                }
            }
        }
}
