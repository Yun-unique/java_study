package day05;
/**
 * 属性：
 *   1.全局属性
 *   2.局部属性
 * @author fan
 *
 */
public class Test3 {
   int  a=10; //1.全局属性
   private void eat(String name) {//2.使用形参定义的局部属性
	 int  a=20; //3.局部变量有效范围为整个方法  
	System.out.println(name);
	
	//4.使用this关键字区分局部和全局
//	使用this修饰的变量为全局变量
	System.out.println(a);//20
	System.out.println(this.a);//10
	this.a=a;//this.a=20
	System.out.println(this.a);//20
}
   public static void main(String[] args) {
	   //方法的调用，参数的个数和实参的个数要一致
	   new Test3().eat("a");
}
}
