/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: GetFilename.java
 * Date: 09/11/2020, 13:16
 */

package classeg.chapter7.exp2;

/**
 * 从一个代表带有路径的文件名中分离出文件名
 */
public class GetFilename {
    // 以下方法获取文件名,文件名是最后一个分隔字符 \ 后面的子串
    public static String pickFile(String fullPath) {
        int pos = fullPath.lastIndexOf('\\');
        if (pos == -1) {
            return fullPath;
        }
        return fullPath.substring(pos + 1);
    }

    public static void main(String[] args) {
        String filename = pickFile("C:\\AAAAA_LEARN\\Java\\Example2_4.java");
        System.out.println("filename=" + filename);
    }
}
