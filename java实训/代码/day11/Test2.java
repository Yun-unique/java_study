package day12.duotai;

public class Test2 {
	public static void main(String[] args) {
        //4.����ת��
		//4.1 ��������ת�����Զ���ɵģ�
//		Animal animal=new Dog();
		Dog dog=new Dog(); //��������  
//		���������Ҳ�и��������
		Animal animal=dog; //��ö����и��������
		animal.eat();//��������û��ʹ��super���ø��������
//		animal.play();
		//4.2 ��������ת��(ǿ������ת��)
		dog=(Dog)animal;//�������л�ð������������
		dog.eat();
		dog.play();
		//������ֲ�ƥ��
		Cat cat=(Cat)animal;//����ĸ�������಻�Ǳ���
		//�Ƕ�����Ů���������ӣ�
		//��ĸ���Ķ��Ӳ����㣨�ֵܣ�
		cat.eat();//Cateat  dogeat
		
	}
	public static void showAnimal(Animal animal) {
		animal.eat();
	}
}
