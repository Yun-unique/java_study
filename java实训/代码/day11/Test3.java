package day12.finals;

public class Test {
	public static void main(String[] args) {
       final User user=new User("");//对象不可变
       user.setName("zhang");//对象中的属性可变
       System.out.println(user.getName());
       user.setName("li");
       System.out.println(user.getName());
//       user=new User();
	}
}
