package day06;
/**
 * 比较类：
 * 1.比较String的值
 * 1.1  String 是一个类
 * 1.2  赋值方式
 *      字面量（常量池）   对象
 * @author fan
 *
 */
public class StuBean3 {
	private int id=1;
	private String name="a";
	private int age=1;
	
	public StuBean3() {
		super();
	}

	public StuBean3(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//确定比较的属性
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StuBean3 other = (StuBean3) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		StuBean3 stu1=new StuBean3(1,"a",12);
		StuBean3 stu2=new StuBean3(2,"a2",12);
		System.out.println(stu1==stu2);
		System.out.println(stu1.equals(stu2));
		System.out.println(stu1);
//		a1eb
//		10 00000011 000000000
		
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		String a="a";
//		String b="a";
//		String c=new String("a");
//		//常量池指向相同的位置
//		System.out.println(a==b);//比较字面量--常量池的比较
//		System.out.println(a==c);//对象的比较使用内存地址
//		//通过equals方法比较对象的属性的值
//		//计算机存储的都是二进制
//		System.out.println(a.equals(c));
//		
////		System.out.println(c);
//	}
}
