package com.lesson05;

import javax.swing.*;
import java.awt.*;
//scroll:滚动
public class JScrollDemon extends JFrame {
    public JScrollDemon(){
        Container container = this.getContentPane();

        //文本域
        JTextArea textArea = new JTextArea(20,50);
        textArea.setText("欢迎学习狂神说java");

        //JScroll面板
        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,300,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemon();
    }
}
