package com.lesson01;

import java.awt.*;
//Frame:界面、框架
//GUI的第一个界面
public class TestFrame01 {
    public static void main(String[] args) {

        //Frame,JDK,看源码！
        Frame frame = new Frame("我的第一个Java图像界面窗口");

        //需要设置可见性
        frame.setVisible(true);

        //设置窗口大小    size
        frame.setSize(400,400);

        //设置背景颜色    color
        frame.setBackground(new Color(85,150,68));

        //弹出的初始位置
        frame.setLocation(200,200);

        //设置大小固定
        frame.setResizable(false);
    }
}
