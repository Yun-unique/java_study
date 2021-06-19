package com.IO流.对象专属流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
* ObjectInputStream:
*   反序列化
* */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        //开始反序列化，读
        Object object = ois.readObject();
        System.out.println(object);
        ois.close();
    }
}
