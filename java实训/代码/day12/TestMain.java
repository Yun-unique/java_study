package day13;

public class TestMain {
	public static void main(String[] args) {
		Role role1 = new Role();
		role1.setId(1001);// ��ɫ���
		role1.setName("���");
		One one = new One("����", 10);
		role1.setOne(one);
		// role1.attack();
		// role1.wear();
		Role role2 = new Role();
		role2.setId(1002);// ��ɫ���
		role2.setName("����");
		Two two = new Two("ͷ��", 9);
		role2.setTwo(two);

		// role2.attack();
		// role2.wear();
		role1.attack(role2);
		role1.attack(role2);
		System.out.println(role2.getBoold());
		System.out.println(role1.getBoold());

	}
}
