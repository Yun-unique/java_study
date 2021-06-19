package com.集合.CollectionsTest;

import java.util.*;

/*
* java.util.Collection集合接口
* java.util.Collections集合工具类，方便集合的操作
* */
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的。
        List<String> list = new ArrayList<>();

        //变成线程安全的
        Collections.synchronizedList(list);

        //排序
        list.add("abf");
        list.add("abx");
        list.add("abc");
        list.add("abe");
        Collections.sort(list);
        for (String s:list){
            System.out.println(s);
        }

        List<WuGui2> wuGui2s = new ArrayList<>();
        wuGui2s.add(new WuGui2(1000));
        wuGui2s.add(new WuGui2(8000));
        wuGui2s.add(new WuGui2(6666));
        //注意：对List集合中元素排序，需要保证List集合中的元素实现了Comparable接口
        Collections.sort(wuGui2s);
        for (WuGui2 w:wuGui2s){
            System.out.println(w);
        }

        //对Set集合怎么排序呢？
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingSoft");
        set.add("king2");
        set.add("king1");
        //将set集合转换成List集合
        List<String> myList = new ArrayList<>(set);
        Collections.sort(myList);
        for (String string : myList){
            System.out.println(string);
        }

        //另一种排序方式：Collections.sort(List集合,比较器对象);
    }
}
class WuGui2 implements Comparable<WuGui2>{
    int age;

    public WuGui2(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟["+
                "age="+ age +
                "]";
    }

    @Override
    public int compareTo(WuGui2 wuGui2) {
        return this.age - wuGui2.age;
    }
}
