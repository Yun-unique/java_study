package com.集合.Collection.Set;

import java.util.HashSet;
import java.util.Set;

/*
HashSet集合：
    无序不可重复
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        //演示一下HashSet集合特点
        Set<String> stringSet = new HashSet<>();
        //添加元素
        stringSet.add("hello3");
        stringSet.add("hello4");
        stringSet.add("hello1");
        stringSet.add("hello2");
        stringSet.add("hello3");
        stringSet.add("hello3");
        stringSet.add("hello3");
        //遍历
        for (String s:stringSet){
            System.out.println(s);
        }
    }
}
