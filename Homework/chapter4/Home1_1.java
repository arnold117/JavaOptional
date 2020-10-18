/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Home1_1.java
 * Date: 18/10/2020, 22:31
 */

package homework.chapter4;

import java.util.Random;

/**
 * 编写自动投掷色子的程序，用数组统计1000次投掷后，各点值的出现次数。
 * 
 * 提示: 色子的值共有1,2,3,4,5,6种情况,可以用一个6个元素的数组来进行统计.
 */
public class Home1_1 {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int count[] = new int[6];

        for (int i = 0, j = 0; i < 1000; i++) {
            dice.roll();
            j = dice.getResult();
            switch (j) {
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                case 4:
                    count[3]++;
                    break;
                case 5:
                    count[4]++;
                    break;
                case 6:
                    count[5]++;
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.printf("%dpoint appears %d times.\r\n", i + 1, count[i]);
        }
    }
}

/**
 * Dice
 */
class Dice {

    private int result;

    public void roll() {
        Random rand = new Random();
        result = rand.nextInt(7);
    }

    public int getResult() {
        return result;
    }
}