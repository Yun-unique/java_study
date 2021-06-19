package com.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//panel:面板  可以看成是一个空间，但是不能单独存在，需要在Frame上面
public class TestPanel {
    public static void main(String[] args) {

        Frame frame = new Frame();

        //布局(layout)的概念
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(40,161,35));

        //panel设置坐标，相对于frame
        panel.setBounds(50,50,200,200);
        panel.setBackground(new Color(193,15,60));

        //frame.add(panel)
        frame.add(panel);
        frame.setVisible(true);

        //监听事件，监听窗口关闭事件     System.exit(0)
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
