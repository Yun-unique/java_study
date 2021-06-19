package com.IO流.标准输出流.日志工具;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 日志工具
* */
public class Logger {
    /*
    * 记录日志的方法
    * */
    public static void log(String msg){
        try {
            //标准字节输出指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\PrintStream\\log.txt",true));
            //修改输出方向
            System.setOut(out);
            //获取系统当前时间
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
            String strTime = sdf.format(nowTime);
            System.out.println(strTime+"："+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
