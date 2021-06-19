package com.IO流.文件专属流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* java.io.FileInputStream:
*   1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读。
*   2、字节的方式，完成输入的操作，完成读的操作(硬盘-->内存)
*
* 注意：
* 相对路径一定是从当前所在的位置作为起点开始找！
* IDEA默认的当前路径是工程Project的根就是IDEA的默认当前路径
*
* */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        //创建文件字节输入流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileInputStream\\temp1.txt");
            //开始读
            int readData = fis.read();//这个方法的返回值是：读取到的“字节”本身
            System.out.println(readData);//97

            readData = fis.read();
            System.out.println(readData);//98

            readData = fis.read();
            System.out.println(readData);//99

            readData = fis.read();
            System.out.println(readData);//100

            readData = fis.read();
            System.out.println(readData);//101

            readData = fis.read();
            System.out.println(readData);//102

            //已经读到文件的末尾了，再读的时候读取不到任何数据，返回-1
            readData = fis.read();
            System.out.println(readData);//-1


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //在finally语句块中确保流一定关闭
            if (fis!=null){ //避免空指针异常
                //关闭流的前提是：流不是空。流是null的时候没必要关闭
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
