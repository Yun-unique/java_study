package com.IO流.文件专属流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类的其它常用方法：
    int available()：返回流当中剩余的没有读到的字节数量
    long skip(long n)：跳过并丢弃n个字节的数据
* */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileInputStream\\temp1.txt");

            /*//1、int available()方法
            System.out.println("该文件总字节数量为："+fis.available());

            //读一个字节
            int readByte = fis.read();
            //还剩多少个字节
            int available = fis.available();
            System.out.println("剩下未读的字节数量为："+available);

            //这个方法有什么用？
            byte[] bytes = new byte[fis.available()];//这种方式不适合太大的文件，因为byte[]数组不能太大。
            //不需要循环了，直接读一次就行了
            int readCount = fis.read(bytes);
            System.out.println(readCount);
            System.out.println(new String(bytes));*/

            //2、long skip(long n)方法
            fis.skip(3);
            System.out.println(fis.read());//100

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
