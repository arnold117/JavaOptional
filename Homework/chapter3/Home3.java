/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Home3.java
 * Date: 18/10/2020, 22:31
 */

package homework.chapter3;

/**
 * Home3 鸡兔同笼,已知鸡兔共有 50 只,共有 140 只脚,编程求解鸡有几只?兔子几只?
 */
public class Home3 {

    public static void main(String[] args) {
        Prog3 cal3 = new Prog3(50, 140);
        System.out.println("You get " + cal3.getChiNum() + " chickens and " + cal3.getRabNum() + " rabbits.");
    }
}

/**
 * Prog3
 */
class Prog3 {

    int chi_num;
    int rab_num;

    public void calFoot(int total_num, int total_foot) {
        /**
         * 由方程组： { chi_num + rab_num = total_num; chi_num * 2 + rab_num *4 = total_foot}
         * 可得： chi_num = total_num * 2 - total_foot / 2;
         */
        chi_num = total_num * 2 - total_foot / 2;
        rab_num = total_num - chi_num;
    }

    public Prog3(int total_num, int total_foot) {
        calFoot(total_num, total_foot);
    }

    public int getChiNum() {
        return chi_num;
    }

    public int getRabNum() {
        return rab_num;
    }
}