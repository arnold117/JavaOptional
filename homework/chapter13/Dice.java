/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: Dice.java
 * Date: 20/12/2020, 21:21
 */

package homework.chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dice extends JFrame {
    int val = 4;
    Panel dice = new Panel();

    void draw(Graphics graphics, int val, int x, int y) {
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, y, 34, 34);

        if (val%2 == 1)
            graphics.fillOval(x+13, y+13, 9, 9);
        if (val == 6)
            graphics.fillOval(x+23, y+13, 9, 9);
        if (val > 3)
            graphics.fillOval(x+3, y+23, 9, 9);
        if (val >1)
            graphics.fillOval(x+23, y+23, 9, 9);
    }

    class Panel extends JPanel {
        public void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            draw(graphics, val, 40, 40);
        }
    }

    /**
     * Constructs a new frame that is initially invisible.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @see JComponent#getDefaultLocale
     */
    public Dice() throws HeadlessException {
        dice.setBackground(Color.pink);
        dice.setBorder(BorderFactory.createTitledBorder("Dice Panel"));
        setContentPane(dice);
        setSize(300, 200);
        setVisible(true);
        dice.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                val = (int)(Math.random()*6) + 1;
                dice.repaint();
            }
        });
    }

    public static void main(String[] args) {
        Dice dice1 = new Dice();
    }
}


