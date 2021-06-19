package com.集合.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap集合：
    1、HashMap集合底层是哈希表/散列表的数据结构
    2、哈希表是一个怎样的数据结构呢？
        哈希表是一个数组和单向链表的结合体
        数组：在查询方面效率很高，随机增删方面效率很低。
        单向链表：在随机增删方面效率很高，在查询方面效率很低。
        哈希表将以上的两种数据结构融合在一起，充分发挥它们各自的优点。
    3、HashMap集合底层的源代码：
        public class HashMap{
        //HashMap底层实际上就是一个数组（一维数组）
        Node<K,V>[] table;
        //静态的内部类HashMap.Node
        static class Node<K,N>{
            final int hash;//哈希值（哈希值是key的hashCode()方法的执行结果。hash值通过哈希函数/算法，可以转换存储成数组的下标。）
            final K key;    //存储到Map集合中的那个key
            V value;    //存储到Map集合中的那个value
            Node<K,V> next; //下一个节点的内存地址
         }
       }
        哈希表/散列表：一维数组。这个数组中每一个元素都是一个单向链表。（数组和链表的结合体）
     4、最主要掌握的是：
        map.put(k,v)
        v = map.get(k)
        以上这两个方法的实现原理必须要掌握
     5、HashMap集合的key部分特点：
        无序，不可重复。
        为什么无序？因为不一定挂到哪个单向链表上
        不可重复是怎么保证的？equals方法保证HashMap集合的key不可重复
        如果key重复了，value会覆盖

        放到HashMap集合key部分的元素其实就是放到HashSet集合中了。
        所以HashSet集合中的元素也需要同时重写hashCode()和equals()方法
      6、哈希表HashMap使用不当时无法发挥性能
        假设将所有的hashCode()方法返回值固定为某个值，那么会导致哈希表变成了
        纯单向链表。这种清空我们称为：散列分布不均匀。
        什么是散列分布均匀？
            假设有100个元素，10个单向链表，那么每个单向链表上有10个节点，这是最好的，是散列分布均匀的。
            假设将所有的hashCode()方法返回值都设定为不一样的值有什么问题？
                这样的话导致底层哈希表就成为一维数组了，没有链表的概念了，也是散列分布不均匀。
         想要做到散列分布均匀需要重写hashCode()方法时有一定的技巧。
      7、重点：放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写hashCode和equals方法
      8、HashMap集合的默认初始化容量是16，默认加载因子是0.75
        这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容

        重点：记住：HashMap集合初始化容量必须是2的倍数，这是官方推荐的
        这是因为达到散列均匀，为了提高HashMap集合的存取效率所必须的

      9、
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //测试hashMap集合key部分的元素特点
        //Integer是key，它的hashCode和equals都重写了
        Map<Integer,String> map = new HashMap<>();
        map.put(1111,"张三");
        map.put(6666,"李四");
        map.put(7777,"王五");
        map.put(2222,"赵六");
        map.put(2222,"钢铁侠");//key重复的时候value会自动覆盖
        System.out.println(map.size());//4
        //遍历map集合
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> m:entries){
            //验证结果：HashMap集合key部分元素（放到HashSet集合中了），无序不可重复
            System.out.println(m.getKey()+"-->"+m.getValue());
        }
    }
}
