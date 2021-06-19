package com.lesson04;

import javax.swing.*;
import java.awt.*;

//图标标签，需要实现类，Frame继承
public class IconDemon extends JFrame implements Icon {
    private int width;
    private int height;

    public IconDemon(){}

    public IconDemon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init(){
        IconDemon iconDemon = new IconDemon(15,15);
        //图标放在标签上，也可以放在按钮上
        JLabel label = new JLabel("icontest",iconDemon,SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IconDemon().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
