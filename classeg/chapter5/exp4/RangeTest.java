/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: EGS
 * Filename: RangeTest.java
 * Date: 11/10/2020, 17:59
 */

package classeg.chapter5.exp4;

public class RangeTest {
    int count = 8;

    public void m(){
        for (int count = 0; count < 4; count++) {
            System.out.println(count);
        }
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        new RangeTest().m();
    }
}
