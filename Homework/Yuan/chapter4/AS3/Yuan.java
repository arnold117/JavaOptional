package homework.Yuan.chapter4.AS3;

import java.util.Scanner;

public class Yuan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[20];
        int sum = 0, count = 0;
        double aver = 0;

        System.out.println("请输入20个整数");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
        }
        scan.close();

        aver = (double) (sum / 20.0);
        System.out.println("平均数: " + aver);

        for (int i : a) {
            if (i > aver) {
                count++;
            }
        }
        System.out.println("有" + count + "个数高于平均数。");
    }
}
