package com.集合.Map;

import java.util.Collection;
        import java.util.HashMap;
        import java.util.Map;

/*
java.util.Map接口中常用方法：
    1、Map和Collection没有继承关系
    2、Map集合以Key和value的方式存储数据：键值对
        key和value都是引用数据类型
        key和value都是存储对象的内存地址
        key起到主导的地位，value是key的一个附属品
    3、Map中常用方法
        V put(K key,V value)    向Map集合中添加键值对
        V get(Object key)   通过key获取value
        int size()  获取Map集合中键值对的个数
        V remove(Object key)    通过key删除键值对
        void clear()    清空Map集合
        boolean containsKey(Object key) 判断Map集合是否包含某个key
        boolean containsValue(Object value) 判断Map集合是否包含某个value
        boolean isEmpty()   判断Map集合中元素个数是否为0

        Collection<V> values()  获取Map集合中所有的value，返回一个Collection
        Set<K> keySet() 获取Map集合中所有的key（所有的键是一个Set集合）

        Set<Map.Entry<K,V>> entrySet()  Map.Entry是一个类名
            将Map集合转换成Set集合
            假设现在有一个Map集合，如下所示：
            map1集合对象
            key             value
            ----------------------------
            1               zhangsan
            2               lisi
            3               wangwu
            4               zhaoliu

            Set set = map1.entrySet();
            set集合对象
            1=zhangsan
            2=lisi
            3=wangwu
            4=zhaoliu
 */
public class MapTest01 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer,String> map = new HashMap<>();
        //1.V put(K key,V value)    向Mao集合添加键值对
        map.put(1,"张三");//1在这里自动装箱
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");

        //2.V get(Object key)通过key获取value
        String value1 = map.get(1);//张三
        System.out.println(value1);

        //3.int size()获取键值对的数量
        System.out.println("键值对的数量为："+map.size());//4

        //4.V remove(Object key)    通过key删除键值对
        String value3 = map.remove(4);
        //System.out.println("删除的value为："+value3);
        System.out.println("键值对的数量为："+map.size());//3

        //5.判断是否包含某个key
        //contains方法底层调用的都是equals进行比较的，所以自定义的类型都需要重写equals方法
        System.out.println(map.containsKey(1));//true
        System.out.println(map.containsKey(4));//false

        //6.判断是否包含某个value
        System.out.println(map.containsValue("张三"));//true
        System.out.println(map.containsValue("赵六"));//false

        //7.Collection<V> values()  获取Map集合中所有的value，返回一个Collection
        Collection<String> values = map.values();
        for (String s:values){
            System.out.println(s);
        }

        //8. void clear()清空map集合
        map.clear();
        System.out.println("键值对的数量为："+map.size());

        //9.boolean isEmpty()   判断Map集合中元素个数是否为0判断是否为空
        System.out.println(map.isEmpty()?"map集合为空":"map集合不为空");

        //10.
    }
}
