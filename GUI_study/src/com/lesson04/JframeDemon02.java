package com.lesson04;

import javax.swing.*;
import java.awt.*;

public class JframeDemon02 {
    public static void main(String[] args) {
        new MyJframe2().init();
    }
}

class MyJframe2 extends JFrame{
    public void init(){
        this.setTitle("Jframe窗口");
        this.setBounds(10,10,200,300);
        this.setVisible(true);

        JLabel label = new JLabel("哈哈哈");
        this.add(label);

        //让文本标签居中，设置水平对其
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //获得一个容器，可以对其添加颜色
        Container container = this.getContentPane();
        container.setBackground(Color.YELLOW);
    }
}

