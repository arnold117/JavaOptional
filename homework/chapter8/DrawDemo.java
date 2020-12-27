/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: DrawDemo.java
 * Date: 20/11/2020, 01:23
 */

package homework.chapter8;

import javax.swing.*;
import java.awt.*;

/**
 * This class demonstrate how to draw a rectangle
 * with length of 100, width of 80 and filled with color of Red.
 * A oval filled with color of blue will be drew inside the rectangle.
 */
public class DrawDemo extends JFrame {

    public void init() {
        this.setTitle("Java DrawDemo");
        this.setSize(300, 300);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graph) {
        super.paint(graph);
        int width = 100;
        int height = 80;

        graph.setColor(Color.RED);
        graph.fillRect(50, 50, width, height);
        graph.setColor(Color.BLUE);
        graph.fillOval(50, 50, width, height);
        graph.setColor(Color.WHITE);
        graph.drawString("你好", 50+width/2, 50+height/2);
    }

    public static void main(String[] args) {
        DrawDemo drawDemo = new DrawDemo();
        drawDemo.init();
    }
}
