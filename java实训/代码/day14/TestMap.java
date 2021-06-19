package day15.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestMap {
	public TestMap() {
		// init();
//		init2();
//		initHashMap();
//		initLinkedHashMap();
//		initTreeMap();
		initHashtable();
	}

	private void initHashtable() {
		Hashtable<Integer, String> hashtable=new Hashtable<>();
		hashtable.put(1001, "aa"); //synchronized
		
	}

	private void initTreeMap() {
		//Tree是自然排序，必须实现接口Comparable
		//key的比较
//		TreeMap<Integer, StuForm> map=new  TreeMap<>();
//		map.put(1001, new StuForm(1,"1"));
//		map.put(1002, new StuForm(1,"2"));
//		map.put(1003, new StuForm(1,"2"));
//		System.out.println(map);
		//set根据map的key实现的
		TreeMap<StuForm, Integer> map=new  TreeMap<>();
		map.put( new StuForm(1,"1"),1001);
		map.put( new StuForm(1,"2"),1002);
		map.put( new StuForm(1,"2"),1003);
		System.out.println(map);
		
		
		
	}

	private void initLinkedHashMap() {
		LinkedHashMap<Integer, String> val=new LinkedHashMap<>();
		val.put(1001, "aa");
	}

	private void initHashMap() {
		//1.8以后使用的数据结构包含：数组，列表，二叉树
		HashMap<String, StuForm> map=new HashMap<>();
		//类 看介绍确定身份
		
	}

	private void init2() {
		// 对象类型
		Map<Integer, StuForm> map=new HashMap<>();
		map.put(1001, new StuForm(1001, "a"));
		map.put(1002, new StuForm(1001, "a"));
        Set<Integer> keys=map.keySet();
        for(Integer key:keys) {
        	StuForm stuForm=map.get(key);
        	System.out.println(stuForm);
        }
         
		
		//map集合转换成对象类型
	}

	private void init() {
		// map的子类 TreeMap HashMap----LinkedHashMap
		// 1. map的接口 主要查看方法
		Map<String, String> map = new HashMap<>();
		// 1.1 put 添加的方法
		map.put("101", "zhang1");
		map.put("102", "zhang2");
		map.put("101", "zhang3");
		// map中的键不能重复
		System.out.println(map);
		// 1.2.获得元素
		System.out.println(map.get("101"));
		// 1.3.集合的遍历
		// 1.3.1 遍历键
		Set<String> keys = map.keySet();
		for (String key : keys) {// 迭代
			System.out.println(key);
		}
		// 1.3.1 遍历值
		Collection<String> values = map.values();
		// 子类的父类的子类是不是set类
		if (values instanceof Set) {
			Set<String> setvalues = (Set<String>) values;
			System.out.println(setvalues);
		}
		// 使用构造函数复制内容
		Set<String> val1 = new HashSet<>(values);
		System.out.println(val1);
		if (values instanceof List) {
			List<String> setvalues = (List<String>) values;
			System.out.println(setvalues);
		}
		List<String> val2 = new ArrayList<>(values);
		System.out.println(val2);
		// 1.3.1 遍历键值
		Set<Entry<String, String>> vks = map.entrySet();
		for (Entry<String, String> vk : vks) {
			System.out.println(vk.getKey() + ":" + vk.getValue());
		}
		// 1.4 删除的方法
		map.remove("1001");
		map.remove("zhang2");
		map.clear();
		System.out.println(map);

	}

	public static void main(String[] args) {
		new TestMap();
	}
}
