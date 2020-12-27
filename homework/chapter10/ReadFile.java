/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: ReadFile.java
 * Date: 29/11/2020, 11:46
 */

package homework.chapter10;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    final String txtFilename = "D:\\data.txt";
    ArrayList<Student> studentArrayList = new ArrayList<Student>();;
    File studentFile = new File(txtFilename);
    BufferedReader in = null;

    public void read(){
        try {
            String row = "";
            in = new BufferedReader(new FileReader(studentFile));
            while ((row = in.readLine()) != null) {
                String[] cols = row.split(",");

                studentArrayList.add(new Student(cols[0], Double.parseDouble(cols[1])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public double calAve(){
        double sum = 0;
        for (Student stu :
                studentArrayList) {
            sum += stu.getScore();
        }
        return sum/studentArrayList.size();
    }

    public ReadFile() {
        this.read();

        System.out.println("The average is: " + this.calAve() + ".");
    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
    }
}

class Student{
    private String name;
    private double score = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, double score) {
        this.setName(name);
        this.setScore(score);
    }
}
