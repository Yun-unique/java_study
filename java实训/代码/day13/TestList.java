package day14.listw;

import java.util.ArrayList;
import java.util.List;

public class TestList {
public static void main(String[] args) {
	//ʹ���������ʽʵ��List����
	//list�е����ݿ����ظ�
	//list������ļ���ֱ�Ӳ�������
	List<String>  list=new ArrayList();
	list.add("1");
	String val=list.get(0);
	System.out.println(val);
	list.add(1, "a");//��Ӵ��������鳤�ȱ�ԭ�����ȶ�һ��
	list.add(1, "b");//ÿ����Ӷ�������һ���µ�����
	System.out.println(list);
	list.remove("a");
	System.out.println(list);
	list.remove(1);
	System.out.println(list);
	
	
}
}
