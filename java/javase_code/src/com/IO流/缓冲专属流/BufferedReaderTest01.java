package com.IO流.缓冲专属流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* BufferedReader：
*   带有缓冲区的字符输入流。
*   使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲。
* */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\86187\\Desktop\\Java\\java\\javase_code\\src\\com\\IO流\\缓冲专属流\\BufferedReaderTest01.java");
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
        //外部负责包装的这个流叫做：包装流，或者叫做：处理流
        //像当前这个程序来说：FileReader就是一个节点流，BufferedReader就是一个处理流/包装流
        BufferedReader br = new BufferedReader(fileReader);

        //BufferedReader中读一行的方法：String readLine()
        /*String firstLine = br.readLine();
        System.out.println(firstLine);
        String secondLine = br.readLine();
        System.out.println(secondLine);
        String threeLine = br.readLine();
        System.out.println(threeLine);*/

        //br.readLine()方法读取一个文本行，但不带换行符。
        String s = null;
        while((s = br.readLine())!=null){
            System.out.println(s);
        }
        //关闭流
        //对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关闭。（可以从源代码进行分析）
        br.close();
    }
}
