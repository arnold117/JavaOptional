/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Stu3.java
 * Date: 29/10/2020, 12:57
 */

package homework.chapter4.home2_co;

public class Stu3 {
    public static void main(String[] args) {
        int i,j;
        int s=1;
        int n = 0;
        boolean flag=true;
        int a[] = new int[50];

        for(i = 3; i <= 50; i++)
        {
            flag = true;

            for(j = 2; j < i; j++)
            {
                if(i%j == 0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag == true)
            {
                a[n] = i;
                n++;
            }

        }

        System.out.println("3-50之间的孪生素数如下：");

        for(i = 0; i < n-1; i++)
        {
            if(a[i+1]-a[i] == 2)
            { System.out.print("第"+s+"组：");
                System.out.print(a[i]+" ");
                System.out.print(a[i+1]+" ");
                System.out.print("\n");
                s++;
            }
        }
    }
}
