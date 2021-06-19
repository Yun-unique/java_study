package day14.set1;

import java.util.Comparator;

public class StuComparator implements Comparator<StuForm> {

	@Override
	public int compare(StuForm stu1, StuForm stu2) {
		int c = stu2.getId() - stu1.getId();
//		System.out.println("c1="+c);
		int d=stu2.getName().hashCode()-stu1.getName().hashCode();
		c = c != 0 ? c : d;
//		System.out.println("c2="+d);
		return c;
	}

}
