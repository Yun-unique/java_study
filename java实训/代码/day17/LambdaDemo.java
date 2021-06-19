package day17.file;

public class LambdaDemo {
	public LambdaDemo() {
		String  amess="aa";
		String  bmess="bb";
		String  cmess="cc";
//		init(amess+bmess+cmess);
		//使用封装的概念  通过类实现
		//lambda 作为返回值使用
		//格式  ()->{} 表示接口的实现类
		//接口的方法只有一个  
		//当代码体中只有一句{}可以省略
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
