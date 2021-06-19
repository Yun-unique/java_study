package day06;
/**
 * �Ƚ��ࣺ
 * 1.�Ƚ�String��ֵ
 * 1.1  String ��һ����
 * 1.2  ��ֵ��ʽ
 *      �������������أ�   ����
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
	
	//ȷ���Ƚϵ�����
	
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
//		//������ָ����ͬ��λ��
//		System.out.println(a==b);//�Ƚ�������--�����صıȽ�
//		System.out.println(a==c);//����ıȽ�ʹ���ڴ��ַ
//		//ͨ��equals�����Ƚ϶�������Ե�ֵ
//		//������洢�Ķ��Ƕ�����
//		System.out.println(a.equals(c));
//		
////		System.out.println(c);
//	}
}
