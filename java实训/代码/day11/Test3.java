package day12.finals;

public class Test {
	public static void main(String[] args) {
       final User user=new User("");//���󲻿ɱ�
       user.setName("zhang");//�����е����Կɱ�
       System.out.println(user.getName());
       user.setName("li");
       System.out.println(user.getName());
//       user=new User();
	}
}
