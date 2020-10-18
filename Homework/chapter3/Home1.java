/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Home1.java
 * Date: 18/10/2020, 22:31
 */

package homework.chapter3;

/**
 * Home1
 * 
 * X老板脾气古怪，他们公司的电话分机号都是3位数，老板规定，所有号码必须是降序排列，且不能有重复的数位。
 * 
 * 比如：510,520,321 都满足要求，而，766,918,201 就不符合要求。
 * 
 * 现在请你编程计算一下，按照这样的规定，一共有多少个可用的3位分机号码？
 */
public class Home1 {

    public static void main(String[] args) {
        Prog1 cal1 = new Prog1();
        System.out.println(cal1.getCount());
    }
}

/**
 * Prog1
 */
class Prog1 {

    int count;

    public void Count() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int j2 = 0; j2 < 10; j2++) {
                    if (i > j && j > j2) {
                        count++;
                    }
                }
            }
        }
    }

    public int getCount() {
        return count;
    }

    public Prog1() {
        this.Count();
    }
}

class Main {
 
	public static void main(String[] args) {
		int count = 0;
		for(int k=7; k>=0; --k){
			for(int j=8; j>k; --j){
				for(int i=9; i>j; --i){
					count++;
				}
			}
		}
		System.out.println(count);
	}
 
}
