package com.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
关于try...catch中的Finally子句：
    1、在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中出现了异常
        finally子句必须和try一起出现，不能单独编写
    2、Finally语句通常使用在哪些情况下呢？
        通常在finally语句块中
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        FileInputStream fis = null;//声明位置放到try外面，这样finally中才能用
        try {
            //创建输入流
            fis = new FileInputStream("C:\\User\\86187\\Desktop\\Java\\MarkDown语法.md");

            String s = null;
            //这里一定会出现空指针异常,但是上面出了异常，这里不会执行
            s.toString();

            //流使用完需要关闭，因为流是占用资源的
            //即使以上程序出现异常，流也必须要关闭
            //放到这里也可能流关不了
            //fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            //流的关闭放在这里比较保险
            //finally中的代码是一定会执行的
            //即使try中出现了异常
            System.out.println("hello Iron-man");
            if (fis!=null){//避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
