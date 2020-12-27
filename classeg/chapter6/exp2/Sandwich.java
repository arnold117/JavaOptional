/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Sandwich.java
 * Date: 28/10/2020, 21:19
 */

package classeg.chapter6.exp2;

public class Sandwich extends Lunch{
    private Bread b = new Bread();

    public Sandwich(){
        System.out.println("S");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}

class Meal{
    public Meal() {
        System.out.println("M");
    }
}

class Bread {
    public Bread() {
        System.out.println("B");
    }
}

class Lunch extends Meal {
    public Lunch() {
        System.out.println("L");
    }
}