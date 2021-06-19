package com.IO流.文件专属流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream最终版:需要掌握
* */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //fis = new FileInputStream("C:\Users\86187\Desktop\Java\java\JavaIOFile\FileInputStream\\temp1.txt");
            fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java实训\\代码\\day12\\Wuli.java");
            //准备一个byte[]数组
            byte[] bytes = new byte[4];
            /*while (true){
                int readCount = fis.read(bytes);
                if (readCount==-1){
                    break;
                }
                //把byte数组转换成字符串，读到多少个转换多少个。
                System.out.print(new String(bytes,0,readCount));
            }*/
            int readCount = 0;
            while ((readCount = fis.read(bytes))!=-1){
                System.out.print(new String(bytes,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
