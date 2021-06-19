package com.IO流.缓冲专属流;

import java.io.*;

/*
* BufferedWriter:带有缓冲的字符输出流：
* */
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        //带有缓冲的字符输出流
        //BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\BufferedWriter\\bw"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\BufferedWriter\\bw2")));

        //开始写
        bw.write("hello world");
        bw.write("\n");
        bw.write("hello kitty");
        bw.write("我是一名java程序员");
        //刷新流
        bw.flush();
        //关闭流
        bw.close();
    }
}
