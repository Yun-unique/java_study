package day02;

public class Test8 {
	/**
	 * 比较运算符的结果是一个boolean类型
	 * @author fan
	 *
	 */
    public static void test1() {
    	//>  <  >=  <=  !=
    	//注意： 数字比较
    	String a="1";	String b="1";
    	boolean c=a==b;
    	char a2='2';	char b2='1';
    	boolean c2=a2>b2; //自动类型转化
    	System.out.println(c2);
		
	}
    public static void test2() {
    	//&  &&  数字形式
    	int a=3;  int b=2;
    	/*
    	 * 10
    	 * 11
    	 * 10
    	 */
    	int c=b&a;
    	System.out.println(c);
    	//&  &&  boolean类型的比较
//    	++  --
    	c=20;
        int d=c++;  //先赋值 后运算
        System.out.println(d);//20
        System.out.println(c); //21
    	c=20;
        d=++c;  //先赋值 后运算
        System.out.println(d);//21
        System.out.println(c); //21
	}
    public static void test3() {
    	//&& &   *  true:1 false:0
    	int  a=9;
    	//&&  短路与 出现false后不执行
    	//&执行所有的运算判断
      boolean flag=++a>10&&++a<10;
      System.out.println(a);
    }
    public static void test4() {
    	int  a=2;int b=3; //算数运算
    	int c=a|b;
    	System.out.println(c);
    	a=2;  
    	boolean c2=++a>1||++a<1;
    	System.out.println(c2);
    	System.out.println(a);
    	
    }
    public static void test5() {
    	//三目   boolean?数据类型的值:数据类型的值
    	int a=10;
    	int b= a>10?1:2; //就近原则
    	System.out.println(b);
    }
    public static void test6() {
    	//位 <<
    	int a=10;  //1010
    	int c=a<<2;//101000  加密
    	/**64 32 16 8 4 2 1
    	 *     1  0 1 0 0 0
    	 */
    	int d=c>>2; //解密  md5 二代  money
    	System.out.println(c);
    	System.out.println(d);	
    }
	public static void main(String[] args) {
//		test1();
		test6();
	}

}
