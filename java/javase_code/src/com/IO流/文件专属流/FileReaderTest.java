package com.IO流.文件专属流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader:
    文件字符输入流，只能读取普通文本
    读取文本内容时，比较方便，快捷
* */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            //创建一个文件字符输入流对象
            reader = new FileReader("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileReader\\myReader");

            /*//准备一个char数组
            char[] chars = new char[4];
            //往char数组中读
            reader.read(chars);
            for (char c:chars){
                System.out.print(c);
            }*/

            //开始读
            char[] chars = new char[4];//一次读取四个字符
            int readCount = 0;
            while((readCount = reader.read(chars))!=-1){
                System.out.print(new String(chars,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
