package day06;

/**
 * 1.标准的javabean
 * 2.封装：
 *     方便添加控制语句
 * 3.字符的比较
 *    字符通过ASCII码转换成数字比较
 * @author fan
 *
 */
public class StuBean {
	// 1.属性
	// 2.无参数构造函数(反射机制)
	// 3.有参数的构造函数
	// 4.一般的方法
	// 5.set/get的方法操作属性
	private int id;
	private String name;
	private char sex='\u0000';
	private int age;
	public StuBean() {}
	//参数构造方便给属性赋值
	//shift+alt+s
	public StuBean(int id, String name, char sex, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		//
//	    if(this.sex=='女') {
//			this.sex='女';
//		}else {
//			this.sex='男';
//		}
	    if(this.sex==22899) {
			this.sex=22899;
		}else {
			this.sex=30007;
		}	
		return sex;
	}
	//set添加控制语句后，构造函数也要添加控制语句
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		if(this.age>3&&this.age<33) {
			return age;
		}else {
			this.age=18;
//			this.age=3;//
		}
		
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show() {
		System.out.println("id="+id);
	}
	public static void main(String[] args) {
		StuBean bean=new StuBean();
		bean.setSex('不');
		System.out.println(bean.getSex());
	}
}
