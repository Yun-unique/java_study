package day17.file;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
	public LambdaDemo2() {
//		init1();
        init2();
	}

	private void init2() {
//		int add=(a,b)->a+b;
	int c=	add((a,b)->1+4);
	System.out.println(c);
		// 23种设计模式的使用
		c = jian((a, b) -> 5 - 1); // lambada 处理接口 ---建造者模式
	    add2((a,b)->System.out.println(12));
	}
	public void add2(MyfilterAdd2 my) {  //builder
		  my.sum(1, 2);
	}
	
	interface MyfilterAdd2{
		void sum(int a,int b);
	}
	
	public int add(MyfilterAdd my) {  //builder
		return  my.add(1, 2);
	}
	interface MyfilterAdd{
		int add(int a,int b);
	}
	public int jian(MyfilterJian my) {  //builder
		return  my.jian(1, 2);
	}
	interface MyfilterJian{
		int jian(int a,int b);
	}
	
	
	private void init1() {
		//参数和返回值---泛型
		String a[]= {"abc","ab","a"};
		Arrays.sort(a,newCompartor());
		System.out.println(Arrays.toString(a));
		
	 
	}
	
	class ComparatorMy implements Comparator<String>{
		@Override
		public int compare(String a, String b) {
			return 0;
		}
		
	}
	public  Comparator<String> newCompartor() {
		Comparator<String> m=(a,b)->a.length()-b.length();
		return m;
		
	}

	public static void main(String[] args) {
		new LambdaDemo2();
	}
}
