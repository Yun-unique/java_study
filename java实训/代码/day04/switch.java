package day04;

public class IfDemo {
	private static void test1() {
		/**
		 * 1.if(boolean){执行语句1;}
		 * 2.if(boolean){执行语句1;}
		 *   else{执行语句2;}
		 * 3.if(boolean){执行语句1;}
		 *  else if(boolean){执行语句1;}
		 *   else{执行语句2;} 
		 * 只要有if必有条件
		 * 只要有else必没有条件   
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
	 * 选择语句
	 */
	private static void testswitch() {
	//关键字 switch case default
	//格式
		/**
		 * switch(变量){
		 * case 变量的值:执行语句 break;
		 * case 变量的值:;
		 * default：前面都不成立执行
		 * }
		 */
	//应用
		/**
		 * switch在确定值得时候使用
		 * 如果是使用范围使用if
		 */
//		int a=11;  //钥匙
//		//变量的取值：整数类型
//		switch (a) { //开关语句---（反射）
//		case 10:  //锁
//			System.out.println("10");
//			break;
//		case 2://注意：同一个switch中的case不能相同
//			System.out.println("2");
//			break;
//		default:
//			System.out.println("default");
//			break;
//		}
			
	//原理（运行步骤）
	}
	private static void testswitch2() {

			String a="aa";  //钥匙
			//变量的取值：整数类型,字符类型
			//字符类型的取值可以是字符和数字
			//字符串的取值在1.8以上可以使用
			switch (a) { //开关语句
			case "aa":  //锁
				System.out.println("10");
				break;
			default:
				System.out.println("default");
				break;
			}	
		}
	private static void testswitch3() {
		String a="aa";  //1.
		//执行过程
		switch (a) { //2.
		case "aa":  //3.true结束 false执行第四步
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
		//case的穿透性
		String a="aa";  //1.
		switch (a) { //2.
		case "aa":  //3.true结束 false执行第四步
			System.out.println("aa");
//			break; //case的穿透性需要break解决
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
