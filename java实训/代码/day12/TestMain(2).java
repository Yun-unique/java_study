package day13;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args) {
		Role role1 = new Role();
		role1.setId(1001);// 角色编号
		role1.setName("天边");
		One one = new One("弓箭", 10);
		role1.setOne(one);
		//添加法术对象
		role1.setFashu(new Fashu() {
			@Override
			public void fashuattack() {
				System.out.println("秒杀");
				
			}
		});
		
		 role1.attack();
//		 role1.wear();
		 role1.attackFashu();
		 Role role2 = new Role();
		role2.setId(1002);// 角色编号
		role2.setName("黑云");
		Two two = new Two("头盔", 9);
		role2.setTwo(two);
		// role2.attack();
		// role2.wear();
		role2.setFashu(new Fashu() {
			
			@Override
			public void fashuattack() {
				System.out.println("对半");
				
			}
		});
		role2.attackFashu();
//		role1.attack(role2);
//		role1.attack(role2);
//		System.out.println(role2.getBoold());
//		System.out.println(role1.getBoold());
		TestArrayLiST arrayLiST=new TestArrayLiST();
		arrayLiST.open(role1);
		arrayLiST.open(role2);
		//返回值的类型用对应的类型接受
		ArrayList<Role> arrayList2=arrayLiST.getArrayList();
		System.out.println(arrayList2);
	}
}
