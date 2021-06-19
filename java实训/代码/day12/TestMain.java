package day13;

public class TestMain {
	public static void main(String[] args) {
		Role role1 = new Role();
		role1.setId(1001);// ½ÇÉ«±àºÅ
		role1.setName("Ìì±ß");
		One one = new One("¹­¼ý", 10);
		role1.setOne(one);
		// role1.attack();
		// role1.wear();
		Role role2 = new Role();
		role2.setId(1002);// ½ÇÉ«±àºÅ
		role2.setName("ºÚÔÆ");
		Two two = new Two("Í·¿ø", 9);
		role2.setTwo(two);

		// role2.attack();
		// role2.wear();
		role1.attack(role2);
		role1.attack(role2);
		System.out.println(role2.getBoold());
		System.out.println(role1.getBoold());

	}
}
