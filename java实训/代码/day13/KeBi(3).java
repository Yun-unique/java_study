package day14.set1;

public class KeBi {
	// �ɱ����
	public static void eat(String... strings) {
		// �ɱ䳤���൱������
		System.out.println(strings.length);
	}

	private static void getSum(int... strings) {
		int sum = 0;
		for (int i : strings) {
          sum+=i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
//		eat();
//		eat("1");
//		eat("1", "2");
		getSum(1,2,3,5);
		int[] st= {1,2,3,5};
		getSum(st);
	}
}
