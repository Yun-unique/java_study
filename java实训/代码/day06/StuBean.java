package day06;

/**
 * 1.��׼��javabean
 * 2.��װ��
 *     ������ӿ������
 * 3.�ַ��ıȽ�
 *    �ַ�ͨ��ASCII��ת�������ֱȽ�
 * @author fan
 *
 */
public class StuBean {
	// 1.����
	// 2.�޲������캯��(�������)
	// 3.�в����Ĺ��캯��
	// 4.һ��ķ���
	// 5.set/get�ķ�����������
	private int id;
	private String name;
	private char sex='\u0000';
	private int age;
	public StuBean() {}
	//�������췽������Ը�ֵ
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
//	    if(this.sex=='Ů') {
//			this.sex='Ů';
//		}else {
//			this.sex='��';
//		}
	    if(this.sex==22899) {
			this.sex=22899;
		}else {
			this.sex=30007;
		}	
		return sex;
	}
	//set��ӿ������󣬹��캯��ҲҪ��ӿ������
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
		bean.setSex('��');
		System.out.println(bean.getSex());
	}
}
