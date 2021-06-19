package com.IO流.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* File类的常用方法
* */
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\86187\\Desktop\\Java\\java\\javase_code\\src\\com\\IO流\\File\\FileTest02.java");

        //获取文件名
        System.out.println("文件名："+f1.getName());

        //判断是否是一个目录
        System.out.println(f1.isDirectory());

        //判断是否是一个文件
        System.out.println(f1.isFile());

        //获取文件最后一次修改时间。（毫秒）
        long haoMiao = f1.lastModified();//这个毫米是从1970年到现在的总毫米数
        Date time = new Date(haoMiao);//将毫秒数转换成日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        //获取文件的大小(字节)
        System.out.println(f1.length());

    }
}
