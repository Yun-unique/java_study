package com.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

//图片标签
public class ImageIconDemon extends JFrame {
    public static void main(String[] args) {
        new ImageIconDemon();
    }
    public ImageIconDemon(){
        //获取图片的地址
        JLabel label = new JLabel("ImageIcon");
        URL url = ImageIconDemon.class.getResource("tt.jpg");

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setBounds(100,100,200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
