package day06;

import day05.Test;

/**
 * 1.�����Ը�ֵ
 * 2.�����Ĵ���
 * 3.this����ȫ�ֱ����;ֲ�����
 * 
 * 
 * @author fan
 *
 */
public class Test2 {
	private int id;  //5.id=1
	private String name;	
	public int getId() {  //int����ֵΪid��ֵΪ1
		return id;//6.id=1
	}
	public Test2() {}
	 //id �в���==����
	public Test2(int  id2) {//3.id2=id1=1  �����Ĵ���
		this.id=id2; //4.�����ĸ�ֵ
		//this.id��ȫ�ֱ���   this.id=id2=1
	}
	public Test2(int  id2,String name) {//3.id2=id1=1  �����Ĵ���
		this.id=id2; //4.�����ĸ�ֵ
		this.name=name;
		//this.id��ȫ�ֱ���   this.id=id2=1
	}
	public static void main(String[] args) {
		int id1=10;//1.�ֲ�����id=1
		Test2 test2=new Test2(id1);//2.idʵ�� �����ĸ�ֵ
		test2=new Test2(id1,"1");
		System.out.println(test2.getId());
		System.out.println(test2.name);
	}

}
