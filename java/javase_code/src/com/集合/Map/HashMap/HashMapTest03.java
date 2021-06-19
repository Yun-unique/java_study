package com.集合.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
/*
了解：
* HashMap集合key部分允许null吗？
*   允许
*   但是要注意：HashMap集合的key部分，null值只有一个，多的会覆盖
* */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //HashMap集合允许key为null
        map.put(null,null);
        System.out.println(map.size());//1

        //key重复，value覆盖
        map.put(null,100);
        System.out.println(map.size());//1

        //通过key获取value
        System.out.println(map.get(null));//100
    }
}
