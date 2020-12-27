/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: ArrayTest.java
 * Date: 08/11/2020, 14:55
 */

package classeg.chapter7.exp1;

/**
 * 从命令行读取字符串，统计有多少数字字符，多少英文字母
 */
public class Test {
    public static void main(String[] args) {
        String a = args[0];
        int n = 0, c = 0;

        for (int k = 0; k < a.length(); k++) {
            char x = a.charAt(k);
            if ((x>='a' && x <='z') || (x>='A' && x<='Z')){
                c++;
            }
            if (x >= '0' && x<='9') {
                n++;
            }
        }
        System.out.println(c + " ," + n);
    }
}
