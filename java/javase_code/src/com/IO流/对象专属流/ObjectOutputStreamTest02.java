package com.IO流.对象专属流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
* 如何一次序列化多个对象
*   可以将对象放入集合当中；序列化集合
* 提示：
*   参与序列化的ArrayList集合以及集合中的元素User对象都需要实现Serializable接口
* */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws IOException {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"张三"));
        userList.add(new User(2,"李四"));
        userList.add(new User(3,"王五"));
        userList.add(new User(4,"赵六"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));
        oos.writeObject(userList);
        oos.flush();
        oos.close();
    }
}
