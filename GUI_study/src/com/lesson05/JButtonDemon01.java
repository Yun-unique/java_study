package com.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

//用Swing需要设置容器Container
public class JButtonDemon01 extends JFrame {

    public JButtonDemon01(){
        Container container = this.getContentPane();
        //将一个图片变为图标
        URL url = JButtonDemon01.class.getResource("tt.jpg");
        Icon icon = new ImageIcon(url);

        //把这个图标放在按钮上
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");

        container.add(button);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new JButtonDemon01();
    }
}
