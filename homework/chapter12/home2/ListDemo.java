/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: ListDemo.java
 * Date: 09/12/2020, 14:17
 */

package homework.chapter12.home2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 随机产生数值在50以下的60个整数加入到数组列表中,求其中最大元素值,
 * 输出整个列表,指出元素值频度出现2次及以上的数据有哪些?
 */
public class ListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 60; i++) {
            integerArrayList.add((int)(50*Math.random()));
        }

        System.out.println("Maximum:" + Collections.max(integerArrayList));
        System.out.println("IntegerList:" + integerArrayList);

        ArrayList<Integer> integerArrayList2 = new ArrayList<>();
        for (Integer i :
                integerArrayList) {
            if (Collections.frequency(integerArrayList, i) > 1) {
                if (!integerArrayList2.contains(i)) {
                    integerArrayList2.add(i);
                }
            }
        }

        System.out.println("Shows 2 times and above: " + integerArrayList2);
    }
}
