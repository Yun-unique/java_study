package com.IO流.File;

import java.io.File;
import java.io.IOException;

/*
* File
*       1、File类和流的四大家族没有关系，所以File类不能完成文件的读和写
*       2、File对象代表什么？
*           文件和路径名的抽象表示形式。
*           一个File对象有可能对应的是目录，也可能是文件。
*       3、需要掌握File类中的常用方法
* */
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        //创建一个File对象
        File f1 = new File("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\File\\file");

        //判断file对象是否存在
        System.out.println(f1.exists());

        //如果C:\Users\86187\Desktop\Java\java\JavaIOFile\File\file不存在
        //以文件的形式创建出来
        /*if (!f1.exists()){
            f1.createNewFile();
        }*/

        //如果C:\Users\86187\Desktop\Java\java\JavaIOFile\File\file不存在
        //以目录的形式创建出来
        /*if (!f1.exists()){
            f1.mkdir();
        }*/
        //可以创建多重目路吗？
        File f2 = new File("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\File\\a\\b\\c");
        if (!f2.exists()){
            f2.mkdir();
        }

        //获取文件的父路径
        File f3 = new File("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\File");
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径："+parentFile.getAbsolutePath());
        File f4 = new File("copy1.java");
        System.out.println("绝对路径："+f4.getAbsolutePath());
    }
}
