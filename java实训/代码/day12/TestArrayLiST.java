package day13;
/**
 * ����������Ϊ�����ͷ���ֵʹ��
 * @author fan
 *
 */

import java.util.ArrayList;

public class TestArrayLiST {
	ArrayList<Role> arrayList=new ArrayList<>();
	public void open(Role role) {//Ӧ��������Ϊ����ʹ��
		arrayList.add(role);
	}
	//����������Ϊ����ֵʹ��
	public ArrayList<Role> getArrayList() {
		return arrayList;
	}

}
