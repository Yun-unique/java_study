 package day04;

public class breakDemo {
	

	public static void main(String[] args) {
//		testbreak();
//		testContinue2();
//		testreturn();
	System.out.println(testreturn2());
	}
	private static double testreturn2() {
		//1.return:����ֵ����������
		//return����ֵ  void�޸ĳ�ֵ��Ӧ������
		//2.return���ж�������ã����Է��ز�ͬ��ֵ
		//3.���з���û�г��ڣ�ĩβ�����з���
		int i=10;
		if(i>10) {
			return 11;
		}else if(i>5) {
			return 5;
			
		}else {
//			return 0;
		}
		
		return 1;  //1 int  byte short
	}
	private static void testreturn() {
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				if(j==3) {  //ÿһ�е�j=3������
					return;  //������ָ����ǩ��λ��
				}
			  System.out.print(j+"*"+i+"="+j*i+"\t");			
			  
			}
			System.out.println();
		}
	}
	private static void testContinue2() {
		/**
		 * continue:
		 */
		a:for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				if(j==3) {  //ÿһ�е�j=3������
					continue a;  //������ָ����ǩ��λ��
				}
			  System.out.print(j+"*"+i+"="+j*i+"\t");			
			  
			}
			System.out.println();
		}
	}
	private static void testContinue() {
		/**
		 * continue:
		 */
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				if(j==3) {  //ÿһ�е�j=3������
					continue;  //��������ѭ��������ѭ����ĩβʹ��
				}
			  System.out.print(j+"*"+i+"="+j*i+"\t");			
			  
			}
			System.out.println();
		}
	}
	private static void testbreak() {
	/**
	 * ע�⣺ ��ѭ����ʹ��break��continue
	 */
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				if(i==3) { //i=3 ����j��ѭ��
					break;
				}
			System.out.print(j+"*"+i+"="+j*i+"\t");
			//break������ǰѭ��
//				if(j==4) {
//					break;
//				}
				
			}
//			if(i==4) { //i=4 ����i��ѭ��
//				break;
//			}
			System.out.println();
		}
		
		
		
	}

}
