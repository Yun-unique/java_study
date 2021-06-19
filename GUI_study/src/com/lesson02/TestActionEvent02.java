package com.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent02 {
    public static void main(String[] args) {
        //两个按钮，实现同一个监听
        //开始    停止
        Frame frame = new Frame();
        Button button1 = new Button("Start");
        Button button2 = new Button("Stop");

        //可以显示的定义触发会返回的命令，如果不显示定义，则会走默认的值！
        //可以写多个按钮只写一个监听类
        button2.setActionCommand("button2-stop");//command:命令、指令

        MyMonitor myMonitor = new MyMonitor();

        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

class MyMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //获取按钮的信息
        System.out.println("按钮被点击了：msg"+actionEvent.getActionCommand());
    }
}
