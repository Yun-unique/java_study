package com.IO流.文件专属流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
对上一个程序进行改进。FileInputStream循环读
分析这个程序的缺点：
    一次读取一个字节byte，这样内存和硬盘交互太频繁了，基本上时间/资源都耗费在交互上面了
    。能不能一次读取多个字节呢？

 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileInputStream\\temp1.txt");
            //读数据.循环读
           /* while (true){
                int readData = fis.read();
                if (readData==-1){
                    break;
                }
                System.out.println(readData);
            }*/
            //改进while循环
            int readData = 0;
            while ((readData = fis.read()) != -1){
                System.out.println(readData);
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
