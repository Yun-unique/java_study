package day07;

public  class  StaticTest {
	
	  
	
	public static void main(String[] args) throws Exception {
		//加载类
		//加载属性和代码块
		//创建对象--调用构造
//		StaticDemo demo=new StaticDemo();
	   //静态资源在加载类时加载---常量池
	Class clazz=Class.forName("day07.StaticDemo");
	//每次创建对象非静态的资源重新加载
	clazz.newInstance();  //创建对象 
	clazz.newInstance();  //创建对象 	
		
		//private 只能在本类中访问
//		StaticDemo.id=1002;
//		System.out.println(StaticDemo.id);
//		//创建对象后不重新加载静态
//
//		StaticDemo demo=new StaticDemo();
//		demo.id=1004;
//		System.out.println(demo.id);
//		
//		demo=new StaticDemo();
//		System.out.println(demo.id);
	}

}
