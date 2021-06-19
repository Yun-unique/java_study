package day03;

/**
 * 格式： for(初始化;判断;运算){ 死循环}
 * 
 * @author fan
 *
 */
public class ForDemo {
	private static void test1() {
		int i = 0;  //1.定义变量
		for (; i < 10;) { //2.判断运算
			System.out.println(i);
			i++;  //3.算术运算
		}

	}
	private static void test2() {
		 //1.定义变量
		for (int i = 0;  i < 10;i++) { //2.判断运算
			System.out.print(i+" "); 
			  //3.算术运算
			//注意：for循环先执行方法体后进行算术运算
		}

	}
	private static void test3() {
		 //1.debug模式查看过程  调试过程
		for (int i = 0;  i < 10;i++) { 	
			System.out.print(i+" "); 
			
		}

	}

	public static void main(String[] args) {
		test3();
	}
}
