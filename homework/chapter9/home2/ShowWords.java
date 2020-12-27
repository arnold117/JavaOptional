/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: ShowWords.java
 * Date: 29/11/2020, 10:56
 */

package homework.chapter9.home2;

import java.awt.*;

/**
 * 编写数字的英文单词显示程序，窗体中安排一个文本框、一个按钮和一个标签，
 * 从文本框输入一个数字（0～9），
 * 点击按钮将其对应的英文单词(如：zero、one、two等)显示在标签中。
 */
public class ShowWords extends Frame {

    public void windowInit(){
        this.setVisible(true);
        this.setSize(400, 400);
        this.setLocation(400, 400);
    }

    public void function() {
        TextField textField = new TextField();
        Button button = new Button("Search");
        Label label = new Label("", Label.CENTER);

        setLayout(new BorderLayout());
        add(button, BorderLayout.SOUTH);
        add(label, BorderLayout.CENTER);
        add(textField, BorderLayout.NORTH);

        button.addActionListener(e -> {
            String str = textField.getText();
            switch (str) {
                case "0":
                    label.setText("Nein");
                    break;
                case "1":
                    label.setText("Eine");
                    break;
                case "2":
                    label.setText("Zwei");
                    break;
                case "3":
                    label.setText("Drei");
                    break;
                case "4":
                    label.setText("Vier");
                    break;
                case "5":
                    label.setText("Hell");
                    break;
                case "6":
                    label.setText("Sechs");
                    break;
                case "7":
                    label.setText("Sieben");
                    break;
                case "8":
                    label.setText("Acht");
                    break;
                case "9":
                    label.setText("Neue");
                    break;
                default:
                    label.setText("请输入0-9内数字!");
            }
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
    public ShowWords() throws HeadlessException {
        this.windowInit();
        this.function();
    }

    public static void main(String[] args) {
        Frame frame = new ShowWords();
    }
}
