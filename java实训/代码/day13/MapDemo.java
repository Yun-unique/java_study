package day14.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public MapDemo() {
//		init1();
		init2();
	}
	private void init2() {
		Map<String, String> map = new TreeMap<>();
		// 添加元素
		map.put("id", "101");
		map.put("name", "zhang");
		map.put("name", "zhang2");// 同名的键会修改值
		map.put("name1", "zhang");
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.println(map.get(key));
		}
		List<String> list=new ArrayList<>(map.values());
		System.out.println(list);
	}
	private void init1() {
		Map<String, String> map = new TreeMap<>();
		// 添加元素
		map.put("id", "101");
		map.put("name", "zhang");
		map.put("name", "zhang2");// 同名的键会修改值
		map.put("name1", "zhang");
		System.out.println(map);
		// 获得
		String id = map.get("id");
		System.out.println(id);
		Set<String> keys = map.keySet();
		Collection<String> values = map.values();
		int size = map.size();
		System.out.println(size);
		Set<Entry<String, String>> dd = map.entrySet();
		System.out.println(dd);
		
	}
	public static void main(String[] args) {
	 new MapDemo();
	}
}
