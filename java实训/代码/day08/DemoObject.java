package day08;

import javax.sound.midi.Soundbank;

public class DemoObject {
	public DemoObject() {
//		init1();
//		init2();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	

	private void init2() {
		// 对象的操作实际就是Object的操作
		// hashCode() 唯一的的地址
	int hashcode=	hashCode();
	System.out.println(hashcode);
		// toString()
	  DemoObject demoObject=new DemoObject();
	  System.out.println(demoObject.toString());
		// equals(Object obj)
	  

	}

	private void init1() {
		// 构造函数
		Object obj = new Object();
		System.out.println(obj);// java.lang.Object@7852e922
		long s = System.identityHashCode(obj);
		System.out.println(Long.toHexString(s));
		System.out.println(obj.getClass().getName());

	}

	public static void main(String[] args) {
		new DemoObject().init2();;
	}

}
