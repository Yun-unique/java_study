package com.集合.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历【非常重要】
 */
public class MapTest02 {
    public static void main(String[] args) {
        //第一种方式：Set<K> keySet() 获取Map集合中所有的key（所有的键是一个Set集合）
        // 获取所有的key，通过遍历key来遍历value
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");
        //遍历map集合
        //获取所有的key，所有的key是一个Set集合
        Set<Integer> keys = map.keySet();
        //遍历key，通过key获取value
        //迭代器方式
        /*Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            //取出其中一个key
            Integer key = it.next();
            //通过key获取value
            String value = map.get(key);
            System.out.println(key+"="+value);
        }*/
        //foreach方式
        for (Integer key:keys){
            System.out.println(key+"="+map.get(key));
        }

        //第二种方式：Set<Map.Entry<K,V>> entrySet()  Map.Entry是一个类名
        //这种方式是把Map集合直接全部转换成Set集合
        //Set集合中元素的类型是：Map.Entry
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        /*Iterator<Map.Entry<Integer, String>> it2 = entries.iterator();
        while(it2.hasNext()){
            Map.Entry<Integer, String> next = it2.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"="+value);
        }*/
        //Map.Entry是一种数据类型
        for (Map.Entry<Integer,String> me:entries){
            System.out.println(me.getKey()+"--->"+me.getValue());
        }
    }
}
