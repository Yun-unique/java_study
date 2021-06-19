package com.IO流.对象专属流;

import java.io.*;
import java.util.List;

/*
* 反序列化集合
* */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users"));
        List<User> userList = (List<User>)ois.readObject();//向下转型
        for (User user:userList){
            System.out.println(user);
        }
        ois.close();
    }
}
