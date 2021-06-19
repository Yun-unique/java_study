package com.lesson06;

import com.lesson02.TestCalculator2;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

//列表框
public class TestComboboxDemon02 extends JFrame {
    public TestComboboxDemon02(){
        Container container = this.getContentPane();
        
        //生成列表的内容
        //String[] contents = {"1","2","3"};//静态数据

        Vector contents = new Vector();//生成动态数据

        //列表中需要放入内容
        JList jList = new JList(contents);

        contents.add("张三");
        contents.add("李四");
        contents.add("王二");

        container.add(jList);

        this.setVisible(true);
        this.setSize(200,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboboxDemon02();
    }
}
