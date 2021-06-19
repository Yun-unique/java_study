package com.IO流.对象专属流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* ObjectOutputStream:实现java对象序列化
* ObjectInputStream：实现java对象反序列化
*
* 注意：
*   参与序列化和反序列化的对象，必须实现Serializable接口
*   通过源码发现，Serializable接口只是一个标志接口：
*   public interface Serializable{
*   }
*   这个接口当中什么代码都没有。那么它起到一个什么作用呢？
*       起到标识的作用，标志的作用，java虚拟机看到这个类实现了接口，可能会对这个类进行特殊待遇。
*       Serializable这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口之后，会为该类自动生成
*       一个序列化版本号
*   序列化版本号有什么用呢？用来区分同名的类是否相同
*       java虚拟认为统一个类有两点：1、类名 2、序列化版本号
*       自动生成序列化版本号有缺点：
*        这种自动生成的序列化版本号缺点是：一旦代码确定之后，不能进行后续的修改，
*         因为只要修改，必然会重新编译，此时生成全新的序列化版本号，这个时候java虚拟机会
*         认为这是一个全新的类。反序列就会报错。
* 最总结论：
*   凡是一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号。
*   这样，以后这个类即使代码修改了，但是版本号不变，java虚拟机会认为是同一个类。
* */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        //创建java对象
        Student student = new Student(111,"张山");
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        //序列化对象
        oos.writeObject(student);

        //刷新
        oos.flush();
        //关闭
        oos.close();
    }
}
