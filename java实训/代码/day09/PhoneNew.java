package day10.extend;

public class PhoneNew extends Phone{
	static int id=1001;
	static{
		System.out.println(id);
		System.out.println(Phone.id);
		System.out.println("static PhoneNew{}");
	}
	{
		System.out.println("PhoneNew{}");
		super.call();
		System.out.println(super.name);
	}
	public PhoneNew() {
		//Ĭ�ϵĹ��캯���е����޲�������Ĺ���
		super();//super�����ڵ�һ��
		System.out.println("12");
		super.call();
	}
	public PhoneNew(String  price) {
		//Ĭ�ϵĹ��캯���е����޲�������Ĺ���
//		super(price);//super�����ڵ�һ��
		this();
	}
	/**
	 *  ��д�����þ�������µĹ���
	 */
	public void showNum() {
		super.showNum();
		System.out.println("�������");
		System.out.println("��ʾ��������");
		System.out.println("��ʾͷ��");
		
	}
   public static void main(String[] args) {
	   Phone phone=new PhoneNew("1"); //�����������һ�ι��캯��
	   //����ʹ��super����thisִ�е��õķ���
//	   Ĭ�ϻ�ִ��һ�θ���Ĺ���
//	   phone.showNum();//��ӡ���������
}
}
