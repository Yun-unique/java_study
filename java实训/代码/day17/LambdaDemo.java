package day17.file;

public class LambdaDemo {
	public LambdaDemo() {
		String  amess="aa";
		String  bmess="bb";
		String  cmess="cc";
//		init(amess+bmess+cmess);
		//ʹ�÷�װ�ĸ���  ͨ����ʵ��
		//lambda ��Ϊ����ֵʹ��
		//��ʽ  ()->{} ��ʾ�ӿڵ�ʵ����
		//�ӿڵķ���ֻ��һ��  
		//����������ֻ��һ��{}����ʡ��
		MessBuild build=()->amess+bmess+cmess;
		 build=()->{
			 System.out.println(11);
			 return amess+bmess+cmess;};
		
		init2(build);
		
	}
	interface MessBuild{
		String buildmess();
	}
	private void init2(MessBuild messBuild) {
		System.out.println(messBuild.buildmess());
		
	}
	private void init(String mess) {
		System.out.println(mess);
		
	}

	public static void main(String[] args) {
         new LambdaDemo();
	}
}
