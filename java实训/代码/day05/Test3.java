package day05;
/**
 * ���ԣ�
 *   1.ȫ������
 *   2.�ֲ�����
 * @author fan
 *
 */
public class Test3 {
   int  a=10; //1.ȫ������
   private void eat(String name) {//2.ʹ���βζ���ľֲ�����
	 int  a=20; //3.�ֲ�������Ч��ΧΪ��������  
	System.out.println(name);
	
	//4.ʹ��this�ؼ������־ֲ���ȫ��
//	ʹ��this���εı���Ϊȫ�ֱ���
	System.out.println(a);//20
	System.out.println(this.a);//10
	this.a=a;//this.a=20
	System.out.println(this.a);//20
}
   public static void main(String[] args) {
	   //�����ĵ��ã������ĸ�����ʵ�εĸ���Ҫһ��
	   new Test3().eat("a");
}
}
