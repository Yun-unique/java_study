package com.集合.增强for循环;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//集合使用for-each
public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("钢铁侠");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        //使用下标方式（只针对有下标的集合）
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        
        //使用for-each
        for (String s: stringList) {//因为泛型使用的是String类型
            System.out.println(s);
        }

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
