package com.snake;

import javax.swing.*;
import java.net.URL;

//存放数据
public class GameData {
    //相对路径  直接写图片名字
    //绝对路径  / 相对于当前的项目

    //找图片
    public static URL headerURL = GameData.class.getResource("statics/header.png");
    //将图片转化成图片标签
    public static Icon header = new ImageIcon(headerURL);

    public static URL upURL = GameData.class.getResource("statics/up.png");
    public static Icon up = new ImageIcon(upURL);

    public static URL downURL = GameData.class.getResource("statics/down.png");
    public static Icon down = new ImageIcon(downURL);

    public static URL leftURL = GameData.class.getResource("statics/left.png");
    public static Icon left = new ImageIcon(leftURL);

    public static URL rightURL = GameData.class.getResource("statics/right.png");
    public static Icon right = new ImageIcon(rightURL);

    public static URL bodyURL = GameData.class.getResource("statics/body.png");
    public static Icon body = new ImageIcon(bodyURL);

    public static URL foodURL = GameData.class.getResource("statics/food.png");
    public static Icon food = new ImageIcon(foodURL);

}

