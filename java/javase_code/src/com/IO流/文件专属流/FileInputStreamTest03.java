package com.IO流.文件专属流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
int read(byte[] b)
    一次最多读取b.length个字节
    减少硬盘和内存的交互，提高程序的执行效率
    在byte[]数组当中读

 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileInputStream\\temp1.txt");

            //开始读，采用byte数组，一次读取多个字节。最多读取“数组.length”个字节
            byte[] bytes = new byte[4];//准备一个4个长度的byte数组，一次最多读取4个字节
            //这个方法的返回值是：读取到的字节数量（不是字节本身）
            int readCount = fis.read(bytes);//第一次读到了4个字节
            System.out.println(readCount);//4
            //将字节数组全部转换成字符串
            //System.out.println(new String(bytes));//abcd
            //不应该全部转换，而是应该读取了多少个字节，将多少个字节转换成字符串
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);//第二次读到了2个字节
            System.out.println(readCount);//2
            //System.out.println(new String(bytes));//efcd
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);//第三次一个字节都读不到
            System.out.println(readCount);//-1
            //System.out.println(new String(bytes));//efcd
            //java.lang.StringIndexOutOfBoundsException: offset 0, count -1, length 4
            //System.out.println(new String(bytes,0,readCount));

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
