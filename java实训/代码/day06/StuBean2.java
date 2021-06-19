package day06;

/**
 * 
 * 
 * @author fan
 *
 */
//对象的内容
//1.输出对象实际调用toString方法
//1.1.toString的作用
//1.1.1 地址  day06.StuBean2@7852e922
//day06.StuBean2:bean.getClass().getName()
//7852e922:hashCode
//1.1.2 为了显示属性，方法查看属性的赋值
//2.hashCode
//2.1 默认的hashCode
//* @see     java.lang.Object#equals(java.lang.Object)
//* @see     java.lang.System#identityHashCode
//2.2 生产 hashCode---根据属性生成的
//通过属性int类型直接添加31
//字符串类型拆分成char类型操作
public class StuBean2 {
	private int id=1;
	private String name;
	private int age=1;



//	@Override
//	public String toString() {
//		return "StuBean2 [id=" + id + ", name=" + name + "]";
//	}
	@Override
	public String toString() {
		return super.toString();
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













	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StuBean2 other = (StuBean2) obj;
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
		StuBean2 bean = new StuBean2();
		bean.id=1;
		bean.age=12;
		System.out.println(bean.hashCode());
		StuBean2 bean2 = new StuBean2();
		bean2.id=0;
		bean2.age=13;
		System.out.println(bean2.hashCode());
//		System.out.println(bean);
//		
//        int hashCode=bean.hashCode();
//        System.out.println(hashCode);
//        //使用十六进制表示
//        String hashCodeh=Integer.toHexString(hashCode);
//        System.out.println(hashCodeh);
//        System.out.println(bean.getClass().getName()+"@"+hashCodeh);
	}
}
