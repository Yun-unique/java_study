package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 缓冲流
 * inputStream---->
 * outputStream---->
 * @author fan
 *
 */
public class Demo1 {
	public Demo1() throws IOException {
		init1();
	}
	//inputStream---->BufferedInputStream
	private void init1() throws IOException {
		String pathname="D:\\java\\XMind.exe";//流的地址都是项目下的路径
		//将路径转换成文件类  便于操作
		File file=new File(pathname);
		//将文件转换成流文件
		InputStream in=new FileInputStream(file);
		OutputStream out=new FileOutputStream("src/file/XMind.exe");
		//添加缓冲区域---提高速度
		BufferedInputStream bio=new  BufferedInputStream(in);
	    BufferedOutputStream bos=new BufferedOutputStream(out);
		byte[] buf=new byte[1024];
		int len=0;
		//不使用缓冲获得时间
//		long cur=System.currentTimeMillis();
//		while((len=in.read())!=-1) {
//			System.out.println(1);
//			out.write(len);
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(end-cur);
		//使用数组获得时间
//		long cur=System.currentTimeMillis();
//		while((len=in.read(buf))!=-1) { 
//			out.write(buf,0,len);
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(end-cur);//500
		//使用缓冲获得时间
//		long cur=System.currentTimeMillis();
//		while((len=bio.read())!=-1) { //2297
//			bos.write(len);
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(end-cur);
		//使用缓冲和数组获得时间
//		在读取数据的时候一定使用缓冲+数组的形式
		long cur=System.currentTimeMillis();
		while((len=bio.read(buf))!=-1) {
			bos.write(buf,0,len);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-cur); //126
	}
	public static void main(String[] args) {
		try {
			new Demo1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
