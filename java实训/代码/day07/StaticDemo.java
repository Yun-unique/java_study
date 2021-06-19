package day07;
/**
 * 
 *static：
 * 1.修饰属性
 *   通过类名访问属性
 * 2.修饰方法
 * 3.定义： 
 * 使用static修饰的内容可以通过类名访问
 * 4.作用：
 *    数据共享
 *    属于类属性
 *    静态资源只加载一次,和创建对象无关系
 *5.加载顺序
 *6.调用：
 *   静态资源不能调用非静态资源
 *   非静态资源可以调用静态资源
 *  
 */
public  class  StaticDemo {
	/***********非静态部分*************/ 
	  public  String name="a";//2.1
	  public int i=eat();
	  {//2.2  代码块和属性同级 流式原则
		  System.out.println("name="+name);
		  System.out.println("id="+id);
		  System.out.println("i="+i);
		   name="zhang";
		   eat();
	  }
	
	  //构造函数
	  public StaticDemo() { //2.3 加载类后调用构造函数
		System.out.println("id="+id);
		  System.out.println("name2="+name);
	  }	 
	  //2.4对象创建完成后调用方法
	  public void play() {
		  eat();
		System.out.println(name);
	  }
	/***********静态部分*************/
	  public static int id=1001;//1.1静态资源--
	  static {
		  //创建对象调用
		  System.out.println("静态代码块"+id);
	  }
	  public static int eat() {
		System.out.println("eat");
		return 1;
	  }

	
	public static void main(String[] args) {
//		StaticDemo demo=new StaticDemo();
		
//		System.out.println(StaticDemo.id);
//		StaticDemo.eat();
		
	}

}
