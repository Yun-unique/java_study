package day13jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection:接口 接口在创建对象必须使用实现类 实现类：ArrayList Collection：特点 无序： 没有直接获得元素的方法 不唯一：
 * 有重复的数据
 * 
 * @author fan
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		// int 属于基本数据类型没有继承Object
		// Object是所有类的父类
		Collection<Object> collection = new ArrayList<>();
		// 1.1.add添加规定类型
		int a = 10;
		collection.add(a);// 包装类
		collection.add("1");
		collection.add(1.0);
		collection.add(true);
		System.out.println(collection);
		// 1.2 addAll(Collection<? extends E> c)
		collection.addAll(collection);
		System.out.println(collection);
		Collection<Object> collection2 = new ArrayList<>();
		collection2.add(12);
		collection2.add(13);
		collection.addAll(collection2);
		System.out.println(collection);
		// 1.3 获得数据
		// 1.3.1 转换成数组
		Object[] objs = collection.toArray();
		System.out.println(objs[1]);
		// 1.3.2 使用迭代器
		Iterator<Object> objs2 = collection.iterator();
		Object obj = objs2.next();
		System.out.println(obj);
		// 1.4 清空
		collection.clear();
		System.out.println(collection);
		// 1.5 长度
		int size = collection.size();
		System.out.println(size);

	}

}
