package day16;

public class Duigui {
	// µÝ¹éºÍµü´ú
	public Duigui() {
		int a = 10;
//		a = sum(a);
//		System.out.println(a);
		a=5;  
		a=getValue(a);  //2*3*4*5
		System.out.println(a);
		getValueSum(a);
		System.out.println(sum);
	}
	int sum=1;
	//½×³ËºÍ  ??? 
	private int getValueSum(int a) {
		if (a == 1) {
			return 1;
		}
		sum+=getValue(a-1);
		System.out.println(sum);
		return a*getValue(a-1);
	}
	private int getValue(int a) {
		if (a == 1) {
			return 1;
		}
		return a*getValue(a-1);
	}
	private int sum(int a) { 
		if (a == 1) {
			return 1;
		}
		System.out.println(a);
//		return a + sum(--a); // µÝ¼õ
		return a + sum(a-1); // µÝ¼õ
	}

	public static void main(String[] args) {
		new Duigui();
	}
}
