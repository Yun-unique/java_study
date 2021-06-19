package day14.shuju;

import java.util.ArrayList;

public class ArrayDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList();
		arrayList.add("11");
		arrayList.add("12");
		arrayList.add("13");
		//添加慢--每次添加数据都会复制到新的数组
		arrayList.add("14");
		//通过指定位置查找--查找快
		System.out.println(arrayList.get(2));
		
	}

}
