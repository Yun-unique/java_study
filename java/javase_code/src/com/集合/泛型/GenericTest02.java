package com.集合.泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK8之后引入了：自动类型推断机制。（又被称为钻石表达式）
 */
public class GenericTest02 {
    public static void main(String[] args) {
        //ArrayList<这里的类型会自动推断>();  前提是JDK8之后才允许
        //自动类型推断，钻石表达式
        List<Animal> myList = new ArrayList<>();
        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());
        //遍历
        Iterator<Animal> iterator = myList.iterator();
        while(iterator.hasNext()){
            Animal a = iterator.next();
            a.move();
        }

        List<String> strList = new ArrayList<>();
        //strList.add(new Cat());//类型不匹配
        strList.add("http://www.baidu.com");
        strList.add("http://www.126.com");
        strList.add("http://www.bilibili.com");
        Iterator<String> iterator1 = strList.iterator();
        while(iterator1.hasNext()){
            String s = iterator1.next();
            String s1 = s.substring(7);
            System.out.println(s1);
        }
    }
}
