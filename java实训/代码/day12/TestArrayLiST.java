package day13;
/**
 * 引用类型作为参数和返回值使用
 * @author fan
 *
 */

import java.util.ArrayList;

public class TestArrayLiST {
	ArrayList<Role> arrayList=new ArrayList<>();
	public void open(Role role) {//应用类型作为参数使用
		arrayList.add(role);
	}
	//引用类型作为返回值使用
	public ArrayList<Role> getArrayList() {
		return arrayList;
	}

}
