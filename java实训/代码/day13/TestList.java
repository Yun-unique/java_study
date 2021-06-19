package day14.listw;

import java.util.ArrayList;
import java.util.List;

public class TestList {
public static void main(String[] args) {
	//使用数组的形式实现List集合
	//list中的数据可以重复
	//list是有序的集合直接操作数据
	List<String>  list=new ArrayList();
	list.add("1");
	String val=list.get(0);
	System.out.println(val);
	list.add(1, "a");//添加创建的数组长度比原来长度多一个
	list.add(1, "b");//每次添加都会生产一个新的数组
	System.out.println(list);
	list.remove("a");
	System.out.println(list);
	list.remove(1);
	System.out.println(list);
	
	
}
}
