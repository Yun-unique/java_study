 package day04;

public class breakDemo {
	

	public static void main(String[] args) {
//		testbreak();
//		testContinue2();
//		testreturn();
	System.out.println(testreturn2());
	}
	private static double testreturn2() {
		//1.return:返回值的类型连用
		//return返回值  void修改成值对应的类型
		//2.return和判断语句连用，可以返回不同的值
		//3.并行返回没有出口，末尾不能有返回
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
				if(j==3) {  //每一列的j=3都跳出
					return;  //跳出到指定标签的位置
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
				if(j==3) {  //每一列的j=3都跳出
					continue a;  //跳出到指定标签的位置
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
				if(j==3) {  //每一列的j=3都跳出
					continue;  //跳出本次循环，不在循环的末尾使用
				}
			  System.out.print(j+"*"+i+"="+j*i+"\t");			
			  
			}
			System.out.println();
		}
	}
	private static void testbreak() {
	/**
	 * 注意： 在循环中使用break和continue
	 */
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				if(i==3) { //i=3 跳出j的循环
					break;
				}
			System.out.print(j+"*"+i+"="+j*i+"\t");
			//break结束当前循环
//				if(j==4) {
//					break;
//				}
				
			}
//			if(i==4) { //i=4 跳出i的循环
//				break;
//			}
			System.out.println();
		}
		
		
		
	}

}
