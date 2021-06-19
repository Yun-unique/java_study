package com.反射机制.b反射机制深入;

        import java.io.FileNotFoundException;
        import java.io.FileReader;

/*
 * 研究一下文件路径的问题
 *   怎么获取一个文件的绝对路径
 * */
public class ReflectTest05 {
    public static void main(String[] args) throws FileNotFoundException {
        //这种方式的路径缺点是：移植性差，在IDEA默认的当前路径是Project的根
        //这个代码假设离开了IDEA，换到了其它位置，可能当前路径就不是Project的根了，这时这个路径就无效了
        //FileReader reader = new FileReader("C:\\Users\\86187\\Desktop\\Java\\java\\javase_code\\classinfo.properties");

        //接下来说一种比较通用的一种路径，即使代码换位置了，这样编写仍然是通用的
        //注意：使用以下通用方式的前提是：这个文件必须在类路径下。
        //什么是类路径下？凡是在src下的都是类路径下。（重点）
        //src是类的根路径
        /*
         * 解释一下：
         *   Thread.currentThread()当前线程对象
         *   get.ContextClassLoader()是线程对象的方法，可以获取到当前线程的类加载器对象
         *   get.Resource()【获取资源】这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
         *
         * */
        //这种方式获取文件绝对路径是通用的
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        //采用以上的代码可以拿到一个文件的绝对路径
        System.out.println(path);

        String path1 = Thread.currentThread().getContextClassLoader().
                getResource("com/反射机制/ReflectTest01.class").getPath();
        System.out.println(path1);
    }
}
