package com.反射机制.c资源绑定器;

import java.util.ResourceBundle;

/*
* 资源绑定器：（只限用于属性配置文件）
*   java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容。
*   使用以下这种方式的时候，属性配置文件xxx.properties必须放到类路径下。
* */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器，只能绑定xxx.properties文件，并且这个文件必须在类（src根路径下为起点）路径下。
        //文件扩展名也必须是properties，并且在写路径的时候，路径后面的扩展名不能写。
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");

        String className = bundle.getString("className");
        System.out.println(className);
    }
}
