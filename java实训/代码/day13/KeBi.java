package day14.set1;

public class KeBi {
	 //�ɱ����
	public static void eat(String... strings) {
		//�ɱ䳤���൱������
		System.out.println(strings.length);
	}
	public static void main(String[] args) {
		eat();eat("1");eat("1","2");
	}
}
