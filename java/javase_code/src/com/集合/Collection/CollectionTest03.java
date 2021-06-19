package com.集合.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
关于集合的迭代/遍历
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象，ArrayList集合，有序可重复
        Collection c1 = new ArrayList();//List接口下的实现类都是有序可重复的
        //添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);
        //迭代集合
        Iterator it = c1.iterator();
        while (it.hasNext()){
            //取出来的数据都要转换成Object数据类型
            Object obj = it.next();
            /*if (obj instanceof Iterator){
                System.out.println("Iterator类型数据");
            }*/
            //只不过输出的时候会转换成字符串，调用toString()方法
            System.out.println(obj);
        }

        //HashSet集合:无序不可重复
        //无序：存进去和取出的顺序不一定相同
        //创建HashSet集合对象
        Collection c2 = new HashSet();
        c2.add(100);
        c2.add(90);
        c2.add(50);
        c2.add(888);
        c2.add(200);
        c2.add(666);
        c2.add(100);
        Iterator it2 = c2.iterator();
        while(it2.hasNext()){
            Object obj2 = it2.next();
            System.out.println(obj2);
        }
    }
}
