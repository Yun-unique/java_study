package com.集合.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合中的contains方法：
    boolean contains(Object o)
    判断集合中是否包含某个对象o，包含返回true，否则返回false

    contains方法是用来判断集合中是否包含某个元素的方法，它在底层调用了equals方法进行比较
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        String s1 = new String("abc");
        c.add(s1);

        String s2 = new String("def");
        c.add(s2);

        //集合中元素的个数
        System.out.println("c集合元素个数"+c.size());

        String x = new String("abc");

        //ArrayList中的方法contains中使用了equals方法比较对象是否相同，有相同则说明包含
        System.out.println(c.contains(x));//true
    }
}
