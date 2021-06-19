package day02;

public class ChangLiang {
	public static void main(String[] args) {
		//1.使用输出定义常量
		System.out.println("字符串类型");
		System.out.println('字');//字符     char
		String name=null;
		System.out.println(name);//null    
//		System.out.println(null);//null
		System.out.println(12);//整数类型         int                 
		System.out.println(12.5);//浮点类型     float
		System.out.println(true);//布尔类型    boolean
		 //2.使用final定义
		String name2="zhang"; //给变量赋值
		System.out.println(name2);
		name2="wang"; //注意： 变量的二次赋值没有数据类型
		System.out.println(name2);
		//3. 接口定义的变量都是常量
		
	}

}
