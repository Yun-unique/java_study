package com.lesson04;

import javax.swing.*;

//Swing
public class JframeDemon {
    //init();初始化
    public void init(){
        JFrame jf = new JFrame("这是一个Jframe窗口");
        jf.setVisible(true);
        jf.setBounds(100,100,200,200);

        //设置文字：JLabel
        JLabel label = new JLabel("哈哈");
        jf.add(label);

        //关闭事件
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        //建立一个窗口
        new JframeDemon().init();
    }
}
