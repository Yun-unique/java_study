package day16;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;

public class FileDemo3 {
	public FileDemo3() throws Exception {
//		init1();
		String pathnane="D:\\daima\\xuexiao\\src";
		init2(pathnane);
	}
	private void init2(String pathnane) {
	     File file=new File(pathnane);
	     System.out.println(file.getName());
	     if(file.isFile()) {
	    	 System.out.println(file.getName());
	     }else if(file.isDirectory()) {
	    	 String[] paths=file.list();
	    	 for (String path : paths) {
	    		 init2(path);
			}
	     }
		
	}
	//递归思想--自己调用自己---直接递归  简洁递归
     //遍历
	private void init1() {
		String pathname="d://daima";
		File file=new File(pathname);
		String[] path=file.list();
		System.out.println(Arrays.toString(path));
		File[] files=file.listFiles();
		System.out.println(Arrays.toString(files));
			
	}

	public static void main(String[] args) throws Exception {
		new FileDemo3();
	}
};