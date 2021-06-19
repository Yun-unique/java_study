package com.IO流.数据流专属;

import java.io.*;

/*
* java.io.DataOutputStream:数据专属字节输出流
* 这个流可以将数据连同数据的类型一并写入文件。
* 注意：这个文件不是普通文本文档。（这个文件使用记事本打不开。）
*
*   可以用来加密文件
* */
public class DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建数据专属的字节输出流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\DataOutputStream\\data"));
        //写数据
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 3.0F;
        double d = 3.14;
        boolean sex = false;
        char c = 'a';
        //写入文件
        dos.writeByte(b);//把数据以及数据的类型一并写入到文件当中
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);

        //刷新流
        dos.flush();
        //关闭流
        dos.close();
    }
}
