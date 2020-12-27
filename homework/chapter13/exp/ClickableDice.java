/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: ClickableDice.java
 * Date: 20/12/2020, 21:47
 */

package homework.chapter13.exp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class ClickableDice extends JFrame {
    int value1 = 4; //筛子的初始点数.
    MyPanel dice;
    public ClickableDice() {
        //设置面板边框风格
        dice = new MyPanel();
        dice.setBackground(Color.pink);
        dice.setBorder(BorderFactory.createTitledBorder("投掷色子面板"));
        setContentPane(dice); //设置创建的面板为内容面板
        setSize(300, 200);
        setVisible(true);
        dice.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                value1 = (int) (Math.random() * 6) + 1;
                dice.repaint();
            }
        });
    }
    public static void main(String args[]) {
        new ClickableDice();
    }
    void draw(Graphics g, int val, int x, int y) {
        g.setColor(Color.black);
        g.drawRect(x, y, 34, 34); //绘制色子边框
        //绘制色子
        if (val % 2 == 1) // 正中央
            g.fillOval(x + 13, y + 13, 9, 9);
        if (val == 6) // 中间右边的点
            g.fillOval(x + 23, y + 13, 9, 9);
        if (val > 3) // 底部左边的点
            g.fillOval(x + 3, y + 23, 9, 9);
        if (val > 1) // 底部右边的点
            g.fillOval(x + 23, y + 23, 9, 9);
    }
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            //super.paintComponent(g);
            //调用父类方法绘制背景
            draw(g, value1, 40, 40); //在40，40位置绘制筛子
        }
    }
}