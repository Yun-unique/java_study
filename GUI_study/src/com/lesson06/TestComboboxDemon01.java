package com.lesson06;

import javax.swing.*;
import java.awt.*;

//下拉框
public class TestComboboxDemon01 extends JFrame {
    public TestComboboxDemon01(){
        Container container = this.getContentPane();

        JComboBox jComboBox = new JComboBox();

        jComboBox.addItem(null);
        jComboBox.addItem("正在热映");
        jComboBox.addItem("已下架");
        jComboBox.addItem("即将上映");

        container.add(jComboBox);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboboxDemon01();
    }
}
