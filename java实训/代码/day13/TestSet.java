package day14.set1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
public static void main(String[] args) {
	/**
	 * set:继承Collection
	 * 特点：唯一无须的数据
	 */
	
	Set<String> set1=new HashSet<>();
	set1.add("3");
	set1.add("1");
	set1.add("2");
	set1.add("4");
	set1.add("11");//char--hashCode
	set1.add("12");
	set1.add("a");
	set1.add("a");
	System.out.println(set1);
	Set<String> set2=new TreeSet<>();
	
	
}
}
