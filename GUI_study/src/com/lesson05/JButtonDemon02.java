package com.lesson05;

import javax.swing.*;
import java.awt.*;

//单选按钮
public class JButtonDemon02 extends JFrame {

    public JButtonDemon02(){
        Container container = this.getContentPane();

        //单选框
        JRadioButton radioButton1 = new JRadioButton("JRadioButton1");
        JRadioButton radioButton2 = new JRadioButton("JRadioButton2");
        JRadioButton radioButton3 = new JRadioButton("JRadioButton3");

        //由于单选框只能选择一个，分组，一个组中只能选择一个,不分组就可以都选上
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        container.add(radioButton1,BorderLayout.NORTH);
        container.add(radioButton2,BorderLayout.CENTER);
        container.add(radioButton3,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonDemon02();
    }
}
