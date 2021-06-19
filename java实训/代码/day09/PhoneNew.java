package day10.extend;

public class PhoneNew extends Phone{
	static int id=1001;
	static{
		System.out.println(id);
		System.out.println(Phone.id);
		System.out.println("static PhoneNew{}");
	}
	{
		System.out.println("PhoneNew{}");
		super.call();
		System.out.println(super.name);
	}
	public PhoneNew() {
		//默认的构造函数中调用无参数父类的构造
		super();//super必须在第一行
		System.out.println("12");
		super.call();
	}
	public PhoneNew(String  price) {
		//默认的构造函数中调用无参数父类的构造
//		super(price);//super必须在第一行
		this();
	}
	/**
	 *  重写的作用就是添加新的功能
	 */
	public void showNum() {
		super.showNum();
		System.out.println("来电彩铃");
		System.out.println("显示来电姓名");
		System.out.println("显示头像");
		
	}
   public static void main(String[] args) {
	   Phone phone=new PhoneNew("1"); //创建对象调用一次构造函数
	   //可以使用super或者this执行调用的方法
//	   默认会执行一次父类的构造
//	   phone.showNum();//打印子类的内容
}
}
