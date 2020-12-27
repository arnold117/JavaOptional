/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: ChangeColor.java
 * Date: 20/12/2020, 22:03
 */

package test.finalTest.prog.Test3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColor extends Frame implements ActionListener {
    int x =0;  // 0—对应红色, 1—对应绿色

    public ChangeColor(){
        Button b = new Button("变背景色");
        setLayout(new FlowLayout());
        add(b);
        b.addActionListener(this);
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChangeColor();
    }

    public void actionPerformed(ActionEvent e) {
        Color c[] = {Color.red, Color.blue};
        x = (x+1)%2;
        this.setBackground(c[x]);
    }
}
