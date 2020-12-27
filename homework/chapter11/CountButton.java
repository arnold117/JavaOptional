/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: CountButton.java
 * Date: 08/12/2020, 09:25
 */

package homework.chapter11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountButton extends Button implements Runnable, ActionListener {

    int count = 100;
    boolean flag = true;

    /**
     * Constructs a button with an empty string for its label.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true
     * @see GraphicsEnvironment#isHeadless
     */
    public CountButton() throws HeadlessException {
        super();
        addActionListener(this);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        flag = false;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while (flag){
            try {
                this.setLabel(""+count++);
                Thread.sleep((int)(1000*Math.random()));
            } catch (Exception ignored) { }
        }
    }
}

class CountFrame extends Frame{
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
    public CountFrame() throws HeadlessException {
        setLayout(null);
        CountButton button1 = new CountButton();
        button1.setBounds(30, 50, 80, 40);
        add(button1);

        CountButton button2 = new CountButton();
        button2.setBounds(130, 50, 80 ,40);
        add(button2);

        (new Thread(button1)).start();
        (new Thread(button2)).start();
    }

    public static void main(String[] args) {
        Frame frame = new CountFrame();
        frame.setSize(250, 150);
        frame.setVisible(true);
    }
}
