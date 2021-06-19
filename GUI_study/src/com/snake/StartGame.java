package com.snake;

import javax.swing.*;

//游戏的主启动类
public class StartGame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("贪吃蛇");

        jFrame.setBounds(10,10,900,720);
        jFrame.setResizable(false);//窗口大小不可变
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //正常游戏界面都应该在面板上
        jFrame.add(new GamePanel());
        jFrame.setVisible(true);
    }
}
