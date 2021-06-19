package day17.file;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class FileDemo {
	public FileDemo() throws Exception {
//		init();
//		init2();
		init3();
	}
	

	private void init3() throws Exception {
		String str="file:/d:/daima/aaaa/aa/dd/cc";
		URL url=new URL(str);
		URI uri=url.toURI();
		File file=new File(uri);//java.io.File使用的是file协议
		file.mkdirs();
		
	}

	private void init2() throws Exception {
		//protocol:协议
		//三种协议：
		//file: 本机访问文件的协议
		//file://d:/daima
		//ftp:window操作操作linux  或者服务器上传内容
		//http:// 网络协议
		URL url=new URL("http", "localhost", 8080,"/aa");
		System.out.println(url);
		//url--网络编程
		
	}


	private void init() throws Exception {
		String addredss = "http://www.baidu.com";
		// url 类 URL 代表一个统一资源定位符，它是指向互联网“资源”的指针
		URL url = new URL(addredss);
		System.out.println(url);
		// URL
		// uri 统一资源标识符 (URI) 引用
		URI uri = url.toURI();
		System.out.println(uri);

	}

	public static void main(String[] args) throws Exception {
		new FileDemo();

	}
}
