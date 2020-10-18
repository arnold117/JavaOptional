/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Home2.java
 * Date: 18/10/2020, 22:31
 */

package homework.chapter3;

/**
 * Home2 百鸡百钱问题。公鸡每只3元，母鸡每只5元，小鸡三只一元，用100元钱买100只鸡，公鸡、母鸡、小鸡应各买多少？
 */
public class Home2 {
    public static void main(String[] args) {
        Prog2 cal2 = new Prog2();
        cal2.calNum();
    }
}

/**
 * Prog2
 */
class Prog2 {

    int cock_num, hen_num, chink_num;

    // public void calNum() {
    //     for (hen_num = 0; hen_num < 20; hen_num++) {
    //         for (cock_num = 0; cock_num < 100 - hen_num; cock_num++) {
    //             chink_num = 100 - hen_num - cock_num;

    //             if (hen_yuan * hen_num + cock_yuan * cock_num + chink_num * chink_yuan == 100.0) {
    //                 System.out.println("Cock_num: " + cock_num + ", Hen_num: " + hen_num + ", Chink_num: " + chink_num);
    //             }
    //         }
    //     }
    // }

    public void calNum() {
        for ( chink_num = 0; chink_num< 100; chink_num+=3) {
            for ( hen_num = 0; hen_num < 100 - chink_num; hen_num++) {
                cock_num = 100 - hen_num - chink_num;
                if (chink_num/3 + hen_num*5 + cock_num*3 == 100.0) {
                    System.out.println("Cock_num: " + cock_num + ", Hen_num: " + hen_num + ", Chink_num: " + chink_num);
                }
            }
        }
    }
}