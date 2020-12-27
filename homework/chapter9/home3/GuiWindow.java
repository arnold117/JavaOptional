/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: GuiWindow.java
 * Date: 29/11/2020, 11:24
 */

package homework.chapter9.home3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *  编写窗体应用，窗体中安排2个按钮，
 *  按钮上面的标签分别为“改背景”、“关闭”，
 *  点击“改背景”按钮，用随机产生的颜色更改窗体的背景，
 *  点击“关闭”按钮可关闭窗体。
 */
public class GuiWindow extends Frame implements ActionListener {

    public void initial(){
        setSize(400, 200);
        setVisible(true);
    }

    public void function(){
        Button button1 = new Button("改背景");
        Button button2 = new Button("关闭");
        Font font = new Font("宋体", Font.BOLD, 28);

        button1.setFont(font);
        button2.setFont(font);
        setLayout(new FlowLayout());

        add(button1);
        add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
    }
    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("改背景")){
            int R=(int)(Math.random()*256);
            int G=(int)(Math.random()*256);
            int B=(int)(Math.random()*256);
            setBackground(new Color(R,G,B));
        }
        if(e.getActionCommand().equals("关闭")){
            dispose();
        }
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
    public GuiWindow() throws HeadlessException {
        super("测试");
        this.initial();
        this.function();
    }

    public static void main(String[] args) {
        Frame frame = new GuiWindow();
    }
}
