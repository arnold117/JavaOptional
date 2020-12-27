/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Student2.java
 * Date: 29/10/2020, 12:52
 */

package homework.chapter4.home2_co;

public class Student2 {
        public static void main(String[] args) {
            for (int i = 3; i <= 50; i++) {
                if (isPrime(i) && isPrime(i+2)) {
                    System.out.println(i + "，" + (i+2));
                }
            }
        }
        //判断是否为素数的判断方法
        static boolean isPrime(int j) {
            int k = 2;
            while (k < j) {
                if (j % k == 0){
                    return false;
                }
                k++;
            }
            return true;
        }
}
