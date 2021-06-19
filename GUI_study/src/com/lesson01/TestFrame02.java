package com.lesson01;

import java.awt.*;

//设置多个窗口
public class TestFrame02 {
    public static void main(String[] args) {
        new MyFrame(100,100,200,200,Color.blue);
        new MyFrame(300,100,200,200,Color.red);
        new MyFrame(100,300,200,200,Color.green);
        new MyFrame(300,300,200,200,Color.black);
    }
}

class MyFrame extends Frame{
    static int id = 0;//要设置多个窗口，需要一个计数器

    public MyFrame(int x,int y,int w,int h,Color color){//构造器
        super("MyFrame+"+(++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);
        setResizable(false);
    }
}

