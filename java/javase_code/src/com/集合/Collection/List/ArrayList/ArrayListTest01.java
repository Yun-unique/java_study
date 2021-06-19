package com.集合.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合：
    1、默认初始化容量为10(底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量为10)
    2、集合底层是一个Object[]数组
    3、构造方法：
        new ArrayList();
        new ArrayList(20);
    4、ArrayList集合的扩容：
        增长到原容量的1.5倍。
        ArrayList集合底层是数组，怎么优化？
            尽可能少的扩容。因为数组扩容效率比较低，建议在使用ArrayList集合的时候
            预估计元素的个数，给定一个合适的初始化容量
    5、数组优点：
        检索效率比较高。（每个元素占用空间相同，内存地址是连续的，知道首元素内存地，
        然后知道下标，通过数学表达式计算出元素的内存地址，所以检索效率高）
    6、数组缺点：
        随机增删元素效率比较低
        另外数组无法存储大数据量（很难在内存中找到一块非常巨大的连续的内存空间）
    7、向数组末尾添加元素，效率很高，不受影响。
    8、面试常问？
        这么多的集合，使用最多的是哪个集合？
        答：ArrayList集合
        因为往数组末尾添加元素，效率不受影响，检索/查找某个元素的操作比较多。

 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量为10
        List list1 = new ArrayList();
        //集合的size()方法是获取当前集合中元素的个数。不是获取集合的容量
        System.out.println(list1.size());//0

        //指定初始化容量
        List list2 = new ArrayList(20);
    }
}
