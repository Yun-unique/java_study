package com.集合.Map.SortedMap;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
* SortedMap是个接口,继承Map接口
* TreeMap实现了SortedMap接口
* 1、TreeSet集合底层实际上是一个TreeMap
* 2、TreeMap集合底层是一个二叉树。
* 3、放到TreeSet集合中的元素，等同于放到TreeMap集合的key部分了
* 4、TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序。称为：可排序集合。
*
* */
public class TreeSetTest02 {
    public static void main(String[] args) {
        //创建一个TreeSet集合（演示TreeSet对String是可排序的）
        TreeSet<String> treeSet = new TreeSet<>();
        //添加String
        treeSet.add("zhangsan");
        treeSet.add("lisi");
        treeSet.add("wangwu");
        treeSet.add("zhangsi");
        treeSet.add("wangliu");
        for (String string:treeSet){
            //按照字典顺序，升序！
            System.out.println(string);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(200);
        ts2.add(900);
        ts2.add(800);
        ts2.add(600);
        ts2.add(10);
        for (Integer element : ts2){
            //升序
            System.out.println(element);
        }
    }
}
