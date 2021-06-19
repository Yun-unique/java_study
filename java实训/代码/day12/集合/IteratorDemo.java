package day13jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList();
		collection.add("1");
		collection.add("2");
		collection.add("3");
		System.out.println(collection);
		int size = collection.size();
		System.out.println(size);
		Iterator<String> iterator = collection.iterator();
		//1. hasNext
//		cursor != size; size=3集合中元素的个数
				// cursor=0
		Boolean flag = iterator.hasNext();
		
		//2.每次调用next，cursor+=1;
		//sr  是从数组中直接获得元素
//		String sr = iterator.next();
//		System.out.println(sr);
//		sr = iterator.next();
//		System.out.println(sr);
//		sr = iterator.next();
//		System.out.println(sr);
//		sr = iterator.next();
//		System.out.println(sr);
//		 iterator.next();
		 iterator.remove();//确定删除的下标
		 System.out.println(collection);
		

	}
}
