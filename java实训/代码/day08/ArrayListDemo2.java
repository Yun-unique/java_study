package day08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2 {
	public ArrayListDemo2() {
//		init1();
		init2();
	}
	
	private void init2() {
		//创建自定义类型的数组
		ArrayList<StuDemo> stuDemos=new ArrayList<>();
		stuDemos.add(new StuDemo(101,"aa"));
		stuDemos.add(new StuDemo(101,"aa"));
		System.out.println(stuDemos);
	}

	private void init1() {
		//定义string类型的数组、
		//如果不添加定义的是Object类型的数组
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("1");
		arrayList.add(0,"2");
		System.out.println(arrayList);
		arrayList.addAll(arrayList);
		System.out.println(arrayList);
//		arrayList.clear();
//		System.out.println(arrayList);
		
		//size();
		int size=arrayList.size();
		for (int i = 0; i < size; i++) {
			//get通过位置获得值
			String str=arrayList.get(i);
			System.out.println(str);	
		}
		int startindex=arrayList.indexOf("1");
		System.out.println(startindex);
		int endindex=arrayList.lastIndexOf("1");
		System.out.println(endindex);
		//set
		arrayList.set(2, "5");
		arrayList.remove(1);
		System.out.println(arrayList);
		
		
		
	}

	public static void main(String[] args) {
		new ArrayListDemo2();
	}

}
