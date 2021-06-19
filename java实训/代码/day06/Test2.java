package day06;

import day05.Test;

/**
 * 1.给属性赋值
 * 2.参数的传递
 * 3.this区分全局变量和局部变量
 * 
 * 
 * @author fan
 *
 */
public class Test2 {
	private int id;  //5.id=1
	private String name;	
	public int getId() {  //int返回值为id的值为1
		return id;//6.id=1
	}
	public Test2() {}
	 //id 行参数==变量
	public Test2(int  id2) {//3.id2=id1=1  参数的传递
		this.id=id2; //4.变量的赋值
		//this.id是全局变量   this.id=id2=1
	}
	public Test2(int  id2,String name) {//3.id2=id1=1  参数的传递
		this.id=id2; //4.变量的赋值
		this.name=name;
		//this.id是全局变量   this.id=id2=1
	}
	public static void main(String[] args) {
		int id1=10;//1.局部变量id=1
		Test2 test2=new Test2(id1);//2.id实参 变量的赋值
		test2=new Test2(id1,"1");
		System.out.println(test2.getId());
		System.out.println(test2.name);
	}

}
