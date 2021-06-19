package com.IO流.缓冲专属流;

import java.io.*;

/*
* 节点流和包装流
* 转换流：InputStreamReader
* */
public class BufferedReaderTest02 {
    public static void main(String[] args) throws IOException {
        /*//节点流
        FileInputStream fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\BufferedReader\\br");

        //通过转换字符流（InputStreamReader将字节输入流转换成字符输入流）
        //fis是节点流，inputStreamReader是包装流
        InputStreamReader inputStreamReader = new InputStreamReader(fis);

        //这个构造方法只能传一个字符流，不能传字节流
        //inputStreamReader是节点流，br是包装流
        BufferedReader br = new BufferedReader(inputStreamReader);*/

        //合并使用
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\\\Users\\\\86187\\\\Desktop\\\\Java\\\\java\\\\JavaIOFile\\\\BufferedReader\\\\br")));

        String line = null;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        //关闭流
        br.close();
    }
}
