package day12.duotai;

public class Cat extends Animal {

	@Override //��д
	public void eat() {
//		super.eat();//���ø���ķ���
		System.out.println("Cat ����");

	}
	public static void main(String[] args) {
		// 1.��̬�����ָ�ʽ
//		��������  ������=new  ��������
		//2.ͬһ������Ķ�����̬
		Animal animal=new Cat();
		animal.eat();//������д����ķ�����Ĭ�ϵ�super����ȡ��
		/**
		 * ����̳������������ͨ��super�ؼ��ֵ��õ�
		 * �������ṹ
		 */
		animal=new Animal();
		animal.eat();//�����ĵ���
		animal=new Dog();
		animal.eat();
	}
	

}
