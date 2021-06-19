package com.IO流.文件专属流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 文件字节输出流，负责写。
* 从内存到硬盘。
*
* */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //myfile文件不存在的时候会自动新建！
            //这种方式谨慎使用，会将原文件内容清空，然后重新写入数据
            //fos = new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\JavaIOtest\\FileOutputStream\\myfile.txt");

            //FileOutputStream构造方法，以追加的方式在文件的末尾写入，不会清空原文件内容
            fos = new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileOutputStream\\myfile.txt",true);
            //开始写
            //fos.write(97);//写出一个字节a
            byte[] bytes = {97,98,99,100};
            fos.write(bytes);

            String s = "我是中国人，我骄傲！";
            //将字符串转换成byte[]数组
            byte[] sBytes = s.getBytes();
            fos.write(sBytes);
            //写完之后，最后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
