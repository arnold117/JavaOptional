/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Test1.java
 * Date: 20/12/2020, 21:53
 */

package test.finalTest.prog.Test1;

public class Test1 {
    public static void main(String args[ ]) {
        System.out.println("随机函数产生整数给含100个元素数组赋值：");
        int m=0,n=0;
        int[] score =new int[100];
        for(int k=0; k<100; k++)
        {
            score[k]=(int)(11+Math.random()*91);//随机生成点数
            if(score[k]%3==0 || score[k]%7==0)
            {
                n++;
            }
            System.out.printf("%d	",score[k]);
            m++;
            if(m%5==0)
            {
                System.out.println();
            }
        }
        System.out.printf("被3或7整除的元素的个数:%d\n",n);
    }
}
