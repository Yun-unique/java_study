package com.lesson05;

import javax.swing.*;
import java.awt.*;
//复选按钮
public class JButtonDemon03 extends JFrame {

    public JButtonDemon03(){
        Container container = this.getContentPane();

        //多选框
        JCheckBox jCheckBox1= new JCheckBox("jCheckBox1");
        JCheckBox jCheckBox2= new JCheckBox("jCheckBox2");

        container.add(jCheckBox1,BorderLayout.NORTH);
        container.add(jCheckBox2,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemon03();
    }
}
