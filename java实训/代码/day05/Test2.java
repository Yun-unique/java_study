package day05;
/**
 * 成员方法：
 *   1.格式： 修饰词  返回值的类型  标识符 ([参数列表]){
 *   }
 *   2.修饰词：
 *      public：公开的在项目下可以直接访问
 *      private：私有的，只能在本类中访问
 *      default：默认的不写，同包下访问
 *      protected: 受保护的，通包下访问
 *   2：返回值的类型
 *   	2.1 有返回值类型
 *   	2.2 无返回值类型，使用void定义
 *   	2.3 作用：获得方法的唯一结果
 *   3.参数列表
 *   	3.1 有参数
 *  	3.2 无参数
 *   	3.3 作用； 将外部数据传递到方法中
 *   	3.4 形参： 变量,只能在方法中使用
 *       实参： 变量的值
 *   4.注意： 方法在定义完成后不会被执行
 *           通过调用执行    
 * @author fan
 *
 */
public class Test2 {
	/**
	 * 作用： 主要对本类的内容操作
	 */
	public void add() {
		System.out.println("无参数无返回值类型");
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		System.out.println("有参数无返回值类型");
	}
	public int add2(int a,int b) {
		int c=a+b;
		System.out.println("有参数有返回值类型");
	   return c;
	}
	
public static void main(String[] args) {
	Test2 test2=new Test2();
	test2.add();
	int  add=test2.add2(1, 3);
	System.out.println(add);
	
	
}
}
