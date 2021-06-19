package com.集合.Collection.Set.SortedSet;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet集合存储元素特点：
    1、无序不可重复。但是存储的元素可以自动按照大小顺序排序！
        称为：可排序集合
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("Z");
        stringSet.add("Y");
        stringSet.add("Z");
        stringSet.add("K");
        stringSet.add("M");
        for (String s:stringSet){
            System.out.println(s);
        }
    }
}
