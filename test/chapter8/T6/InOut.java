/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: InOut.java
 * Date: 06/11/2020, 12:53
 */

package test.chapter8.T6;

class InOut {
    String s = new String("Between");
    public void aMethod(final int iArgs){
        int iam = 5;
        iam++;

        class Bicycle{
            public void sayHello() {
                //Here
                System.out.println(s);
            }
        }
    }

    public void another(){
        int iOther;
    }
}
