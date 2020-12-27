/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Program.java
 * Date: 06/11/2020, 15:24
 */

/*
将一批英文单词存入一个字符串数组中，例如： {"we","who","word","these","do","what","new","the","hello"}
求所有单词的平均长度,输出结果精确到小数点后2位。
 */

package homework.chapter7.home2;

public class Program {
    public static void main(String[] args) {
        String[] strings = {"we","who","word","these","do","what","new","the","hello"};
        StrFunc strFunc = new StrFunc(strings);
        System.out.printf("%.2f", strFunc.getAve());
    }
}

class StrFunc {
    private double ave;

    public double getAve() {
        return ave;
    }

    // 计算平均长度
    private void calAve(String[] strings) {
        double count = 0;

        for (String str :
                strings) {
            count += str.length();
        }

        this.ave = (double)(count/strings.length);
    }

    public StrFunc(String[] strings) {
        this.calAve(strings);
    }
}
