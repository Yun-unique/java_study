package day04;

public class IfDemo {
	private static void test1() {
		/**
		 * 1.if(boolean){ִ�����1;}
		 * 2.if(boolean){ִ�����1;}
		 *   else{ִ�����2;}
		 * 3.if(boolean){ִ�����1;}
		 *  else if(boolean){ִ�����1;}
		 *   else{ִ�����2;} 
		 * ֻҪ��if��������
		 * ֻҪ��else��û������   
		 */
	  double money=12;
	  if(money>10) {
		  System.out.println("money>10");
	  }
	  else if(money>5) {
		 System.out.println("money>5");	  
	 }
	  else if(money>3) {
		 System.out.println("money>3"); 
	 }
	 else {
		 System.out.println("money>0"); 
	 } 

	}
	/**
	 * ѡ�����
	 */
	private static void testswitch() {
	//�ؼ��� switch case default
	//��ʽ
		/**
		 * switch(����){
		 * case ������ֵ:ִ����� break;
		 * case ������ֵ:;
		 * default��ǰ�涼������ִ��
		 * }
		 */
	//Ӧ��
		/**
		 * switch��ȷ��ֵ��ʱ��ʹ��
		 * �����ʹ�÷�Χʹ��if
		 */
//		int a=11;  //Կ��
//		//������ȡֵ����������
//		switch (a) { //�������---�����䣩
//		case 10:  //��
//			System.out.println("10");
//			break;
//		case 2://ע�⣺ͬһ��switch�е�case������ͬ
//			System.out.println("2");
//			break;
//		default:
//			System.out.println("default");
//			break;
//		}
			
	//ԭ�����в��裩
	}
	private static void testswitch2() {

			String a="aa";  //Կ��
			//������ȡֵ����������,�ַ�����
			//�ַ����͵�ȡֵ�������ַ�������
			//�ַ�����ȡֵ��1.8���Ͽ���ʹ��
			switch (a) { //�������
			case "aa":  //��
				System.out.println("10");
				break;
			default:
				System.out.println("default");
				break;
			}	
		}
	private static void testswitch3() {
		String a="aa";  //1.
		//ִ�й���
		switch (a) { //2.
		case "aa":  //3.true���� falseִ�е��Ĳ�
			System.out.println("10");
			break;
		case "a":  //4.
			System.out.println("10");
			break;
		default:
			System.out.println("default");
			break;
		}	
	}
	private static void testswitch4() {
		//case�Ĵ�͸��
		String a="aa";  //1.
		switch (a) { //2.
		case "aa":  //3.true���� falseִ�е��Ĳ�
			System.out.println("aa");
//			break; //case�Ĵ�͸����Ҫbreak���
		case "a":  //4.
			System.out.println("a");
			break;
		case "s":  //4.
			System.out.println("s");
			break;
		default:
			System.out.println("default");
			break;
		}	
	}
	
public static void main(String[] args) {
	testswitch4();
}
}
