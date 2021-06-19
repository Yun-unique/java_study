package com.oop.demon12;
//接口
public interface UserService {

    //常量~   public static final
    int AGE=99;

    //接口中的所有定义的方法其实都是抽象的 public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
