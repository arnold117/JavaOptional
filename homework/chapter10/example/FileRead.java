/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: FileRead.java
 * Date: 29/11/2020, 11:45
 */

package homework.chapter10.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileRead {
    public static void main(String[] args) {
        final String NEWLINE = "\r\n";//换行符

        /*
         * txt文件名称
         */
        String inTxtName = "";
        String outTxtName = "";
        if(args.length > 0) {
            inTxtName = args[0];
            outTxtName = args[1];
        }else {
            inTxtName = "D:\\Student.txt";
            outTxtName = "D:\\StudentTj.txt";
        }
        File studentFile = new File(inTxtName);

        BufferedReader in = null;//输入流
        PrintWriter out = null;//输出流
        List<Student> stus = null;//存放学生集合
        Student student ;//学生对象


        Map<String, List<Student>> classMap = new HashMap<String, List<Student>>();

        /*
         * 读取文件并将结果解析保存到以班级名称为key的Map集合中。
         */
        try {
            String row = "";
            in = new BufferedReader(new FileReader(studentFile));
            while ((row = in.readLine()) != null) {
                String[] cols = row.split(",");
                if(classMap.containsKey(cols[2])) {
                    stus = classMap.get(cols[2]);
                }else {
                    stus = new ArrayList<Student>();
                    classMap.put(cols[2], stus);
                }
                stus.add(new Student(cols[0], cols[1], cols[2], Float.valueOf(cols[3])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*
         * 计算
         */
        int size = 0;//分数
        String className = "";
        float totalScore = 0;//总分数
        StringBuilder result = new StringBuilder(); //StringBuilder不赘述
        DecimalFormat format = new DecimalFormat("#.0");//float格式化，分数可以用整型int

        for (Map.Entry<String, List<Student>> entry : classMap.entrySet()) {
            className = entry.getKey();
            result.append(className).append("班学生成绩").append(NEWLINE);
            stus = entry.getValue();
            size = stus.size();
            if(stus != null && stus.size() > 0) {
                totalScore = 0;
                Collections.sort(stus);
                for (Student stu : stus) {
                    result.append("姓名：").append(stu.getName()).append("，成绩：").append(stu.getScore()).append(NEWLINE);
                    totalScore += stu.getScore();
                }
                result.append(className).append("班的平均分为：").append(format.format(totalScore / size)).append(NEWLINE);

                student = stus.get(0);
                result.append("最低分为：").append(student.getName()).append(", ").append(student.getScore()).append(NEWLINE);

                student = stus.get(size - 1);
                result.append("最高分为：").append(student.getName()).append(", ").append(student.getScore()).append(NEWLINE);

            }else {
                result.append(className).append("班没有分数").append(NEWLINE);
            }
            result.append(NEWLINE);
        }

        System.out.println(result);
        try {
            studentFile = new File(outTxtName);
            out = new PrintWriter(studentFile);
            out.write(new String(result));
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            out.close();
        }
    }
}
/*
 * 实现Comparable用于分数排序
 */
class Student implements Comparable<Student>{
    private String name;
    private String dept;
    private String className;
    private float score;
    public Student(String name, String dept, String className, float score) {
        this.name = name;
        this.dept = dept;
        this.className = className;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    @Override
    public int compareTo(Student o) {
        if(this.score > o.getScore())
            return 1;
        return -1;
    }
}
