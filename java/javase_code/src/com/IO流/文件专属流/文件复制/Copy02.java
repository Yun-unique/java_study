package com.IO流.文件专属流.文件复制;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* 使用FileWriter进行拷贝的话，只能拷贝“普通文本文件”
*
* */
public class Copy02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            //读
            in = new FileReader("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileReader\\myReader");
            //写
            out = new FileWriter("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileWriter\\myReader");

            //一边读，一边写
            char[] chars = new char[1024*512];//1MB(1个字符=2个字节)
            int readCount = 0;
            while ((readCount = in.read(chars))!=-1){
                out.write(chars,0,readCount);
            }

            //刷新
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
