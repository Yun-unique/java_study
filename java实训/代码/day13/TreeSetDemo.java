package day14.set1;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public TreeSetDemo() {
		// init1();
		init2();
	}

	private void init2() {
		TreeSet<StuForm> forms = new TreeSet<>(new StuComparator());
		forms.add(new StuForm(1,"A"));
		forms.add(new StuForm(1,"B"));
		forms.add(new StuForm(2,"B"));
		forms.add(new StuForm(2,"a"));
		System.out.println(forms);

	}
	
	
	
	

	private void init1() {
		// ×ÔÈ»Ë³Ðò= Comparable
		TreeSet<String> set = new TreeSet<>();
		set.add("aa");
		set.add("bb");
		System.out.println(set);

	}

	public static void main(String[] args) {
		new TreeSetDemo();
	}

}
