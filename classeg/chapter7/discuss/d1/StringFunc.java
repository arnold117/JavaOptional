/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: StringFunc.java
 * Date: 11/11/2020, 00:39
 */

package classeg.chapter7.discuss.d1;

import java.util.Scanner;

public class StringFunc {
    // 递归反转字符串
    public static String reverseStr(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverseStr(s.substring(1)) + s.charAt(0);
    }

    // 判断是否是回文数
    public static boolean isPalindrome(String str) {
        return str.equals(reverseStr(str));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg;

        System.out.println("Please enter a String: ");
        String str = scanner.next();
        scanner.close();

        if (isPalindrome(str)) {
            msg = str + " is a palindrome.";
        } else {
            msg = str + " is not a palindrome.";
        }

        System.out.println(msg);
    }
}
