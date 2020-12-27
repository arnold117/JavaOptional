/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Program.java
 * Date: 06/11/2020, 14:33
 */

/*
将一批单词存入一个字符串数组中，例如：{"good","word","work","mean","thank","me","you","or","and"}
进行如下处理：
1) 统计含有子字符串or的单词个数；
2) 统计以字符m开头的单词个数。
 */

package homework.chapter7.home1;

public class Program {
    public static void main(String[] args) {
        String[] strings = {"good","word","work","mean","thank","me","you","or","and"};
        StrFunc strFunc = new StrFunc(strings);
        System.out.println(strFunc.toString());
    }
}

class StrFunc {
    private int orContains;
    private int mStarts;

    // 统计含有字符串 or 的单词的个数
    public void calOrContains(String[] strings){
        for (String str :
                strings) {
            if (str.contains("or")) {
                orContains++;
            }
        }
    }

    // 统计字符 m 开头的单词的个数
    public void cal_mStarts(String[] strings) {
        for (String str :
                strings) {
            if (str.startsWith("m")){
                mStarts++;
            }
        }
    }

    @Override
    public String toString() {
        return "此字符串数组包含: " +
                "字符含有or的单词" + orContains +
                "个, m字符开头单词" + mStarts +
                "个.";
    }

    public StrFunc(String[] strings) {
        this.cal_mStarts(strings);
        this.calOrContains(strings);
    }
}