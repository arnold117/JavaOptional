/*
 * Copyright (c) 2019 - 2020.
 * Author: Arnold Chow
 * Project name: Java_Optional
 * Filename: MapDemo.java
 * Date: 09/12/2020, 14:05
 */

package homework.chapter12.home1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * 利用Map存储中文的星期一,...与英文的Monday,...之间的关系
 * 设计图形界面,在文本框中输入中文形式的星期,按回车键后,则在标签中显示对应英文
 */
public class MapDemo extends Frame implements ActionListener {
    Label label;
    TextField textField;

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
    public MapDemo() throws HeadlessException {
        label = new Label("显示英文");
        textField = new TextField(20);

        setLayout(new FlowLayout());
        add(label);
        add(textField);
        textField.addActionListener(this);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("星期一", "Monday");
        map.put("星期二", "Tuesday");
        map.put("星期三", "Wednesday");
        map.put("星期四", "Thursday");
        map.put("星期五", "Friday");
        map.put("星期六", "Saturday");
        map.put("星期日", "Sunday");

        String str = textField.getText();
        String eng = map.get(str);
        textField.setText(eng);
    }

    public static void main(String[] args) {
        Frame frame = new MapDemo();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
