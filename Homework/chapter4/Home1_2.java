/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Home1_2.java
 * Date: 18/10/2020, 22:32
 */

package homework.chapter4;

import java.util.ArrayList;
import java.util.Random;

/**
 * 利用随机函数产生整数给含100个元素数组赋值, 输出该数组,按每行5个元素的形式安排输出, 统计能被3或7整除的元素的个数并输出统计结果
 */

public class Home1_2 {
    public static void main(String[] args) {
        int a[] = new int[100];
        int count = 0;
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt();
        }

        for (int i = 0; i < a.length; i += 5) {
            for (int j = i; j < i + 5; j++) {
                System.out.print(a[j] + "    ");
            }
            System.out.println();
        }

        for (int i : a) {
            if (i % 3 == 0 || i % 7 == 0) {
                count++;
                list.add(i);
            }
        }

        System.out.println("There are " + count + " numbers can be divied by 3 or by 7");
        System.out.println("These numbers are:");
        count = 0;
        for (int i : list) {
            if (count == 4) {
                System.out.println();
                count = 0;
            }
            System.out.print(i+"    ");
            count++;
        }
    }
}