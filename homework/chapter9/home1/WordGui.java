/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: WordGui.java
 * Date: 29/11/2020, 10:05
 */

package homework.chapter9.home1;


import javax.swing.*;
import java.awt.*;

/**
 * This class demonstrates how to use a GUI window to explore Deutsche Worts.
 * With 2 button "上一个" and "下一个" to flip backward and forward.
 *
 */
public class WordGui extends JFrame {
    int i = 0;
    String[] a = {"Eine", "Zwei", "Drei", "Vier", "Hell", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

    public void initial() {
        this.setVisible(true);
        this.setSize(400, 400);
        JButton button_up = new JButton("上一个");
        JButton button_next = new JButton("下一个");
        // displays word, the first by default, set content alignment to central
        JLabel label = new JLabel(a[0], JLabel.CENTER);
        setLayout(new BorderLayout());

        add(button_up, BorderLayout.WEST);
        add(label, BorderLayout.CENTER);
        add(button_next, BorderLayout.EAST);

        button_up.addActionListener( e -> {
            if ((i>=1) &&(i<=9)){
                i-=1;
            } else {
                i = 9;
            }
            label.setText(a[i]);
        });
        button_next.addActionListener(e -> {
            if ((i>=0) && (i<=8)){
                i+=1;
            } else {
                i = 0;
            }
            label.setText(a[i]);
        });
    }

    /**
     * Constructs a new instance of {@code Frame} that is
     * initially invisible.  The title of the {@code Frame}
     * is empty.
     *
     * @throws HeadlessException when
     *                           {@code GraphicsEnvironment.isHeadless()} returns {@code true}
     * @see GraphicsEnvironment#isHeadless()
     * @see Component#setSize
     * @see Component#setVisible(boolean)
     */
    public WordGui() throws HeadlessException {
        this.initial();
    }

    public static void main(String[] args) {
        JFrame jFrame = new WordGui();
    }
}

