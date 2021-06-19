package day14.set1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public HashSetDemo() {
		// init();
//		init2();
		init3();
		

	}

	private void init3() {
		StuForm form1=new StuForm(1,"g");
		System.out.println(form1.hashCode());
		System.out.println(System.identityHashCode(form1));
		StuForm form2=new StuForm(2,"G");
		System.out.println(form2.hashCode());
		//hashSet���ö����е�hashCode����
		//���hashcode����ȣ�������equals�ķ���
		//���hashCode��ȣ�����equals����
		HashSet<StuForm> stuForms=new HashSet<>();
		stuForms.add(form1);
//		stuForms.add(form2);
		StuForm form3=form1;
		stuForms.add(form3);
		System.out.println(stuForms);
		
	}

	private void init2() {
    //set���ݲ����ظ�  �Ƚ϶���
		StuForm form1=new StuForm(1,"a");
		StuForm form2=new StuForm(1,"a");
		System.out.println(form1==form2);//��ַ
		System.out.println(form1.equals(form2));
		
		
	}

	private void init() {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("a");
		hashSet.add("b");
		System.out.println(hashSet);
		Iterator<String> i = hashSet.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

	public static void main(String[] args) {
		new HashSetDemo();
	}
}
