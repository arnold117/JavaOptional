/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: EGS
 * Filename: FindPrime.java
 * Date: 11/10/2020, 17:27
 */

/*
 * 求 1 至 100 内的质数
 */
package classeg.chapter5.exp3;

public class FindPrime {
    public static boolean prime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (prime(i)){
                System.out.print(i + ",");
            }
        }
    }
}
