package com.lesson06;

import javax.swing.*;
import java.awt.*;
//密码框
public class TestTextDemon02 extends JFrame {
    public TestTextDemon02(){
        Container container = this.getContentPane();

        JPasswordField jPasswordField = new JPasswordField();//******
        jPasswordField.setEchoChar('*');

        container.add(jPasswordField);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemon02();
    }
}
