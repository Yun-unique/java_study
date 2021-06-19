package com.IO流.File;

import java.io.File;

/*
* File中的listFiles方法
* */
public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles()
        //获取当前目录下的所有的子文件/子目录
        File f = new File("C:\\Users\\86187\\Desktop\\Java\\java");
        File[] files = f.listFiles();
        for (File file:files){
            //System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }
    }
}
