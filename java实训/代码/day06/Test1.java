package day06;


/**
 * 1.����
 *   ��������ͬ
 *   �������Ͳ�ͬ
 *   ����������ͬ
 *   �Ͳ�����û���κι�ϵ
 * 2.���ã�
 *   Ĭ�ϵ��ÿղ����Ĺ��캯��
 *   ���д�˹��캯����Ĭ�Ϲ����ȡ��
 *   ÿ���������д�޲����Ĺ��캯��
 * 3.��������ã�
 *   ��ʼ������  
 *   �����Ը�ֵ
 *   
 *   
 * @author fan
 *
 */
public class Test1 {
	private int  id;
	private String name;
	
	public Test1() {
		init();//�����ĵ���
		System.out.println("Test1");
	}
	public Test1(int id,String name) {//��ʼ������
		  this.id=id;
		  this.name=name;
		  System.out.println("Test1  int string");
	}
//	public Test1(int a,String b) {
//		System.out.println("Test1  int string");
//	}
	
	public void init() {//��ʼ������
		  this.id=12;
		  this.name="zhang";
	}
	public void show() {
		System.out.println("id="+id+",name="+name);
	}
	public Test1(byte a) {
		System.out.println("Test1 byte");
	}
	public Test1(int a) {
		System.out.println("Test1  int");
	}

	public Test1(String b,int a) {
		System.out.println("Test1   string int");
	}
	public static void main(String[] args) {
//		new Test1().show();//���ÿղ����Ĺ���
//		new Test1(1); //1Ĭ����int���� ����int���͵Ĺ���
//		new Test1((byte)1); //����byte���͵Ĺ���
//		new Test1((byte)1,"1");//�Զ�����ת��  byteת����int
//		new Test1("1",(byte)1);//�Զ�����ת��  byteת����int
	    new Test1(1,"a").show();;
	
	}

}
