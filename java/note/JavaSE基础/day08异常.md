### 异常：

#### ExceptionTest01:

```java
package com.异常;
/*
1、什么是异常，java提供异常处理机制有什么用？
    以下程序执行过程中发生了不正常的情况，而这种不正常的情况叫做：异常
    java语言是很完善的语言，提供了异常的处理方式，以下程序执行过程中出现了不正常情况，
    java把该异常信息打印输出到控制台，供程序员参考。程序员看到异常信息之后，可以对程序
    进行修改，让程序更加的健壮。

    什么是异常：程序执行过程中的不正常情况
    异常的作用：增强程序的健壮性
2、以下程序执行控制台出现了：
    Exception in thread "main" java.lang.ArithmeticException: / by zero
   at com.异常.ExceptionTest01.main(ExceptionTest01.java:18)
   这个信息被我们称为：异常信息。这个信息是JVM打印的

 */
public class ExceptionTest01 {
    public static void main(String[] args) {

        /*int a = 10;
        int b = 0;
        //实际上JVM在执行到此处的时候，会new异常对象：new ArithmeticException("/ by zero");
        //并且JVM将new的异常对象抛出，打印输出信息到控制台了
        int c = a / b;
        System.out.println(a+"/"+b+"="+c);*/

        //修改下
        int a = 10;
        int b = 0;
        if (b==0){
            System.out.println("除数b不能为0");
            return;
        }
        int c = a / b;
        System.out.println(c);
    }
}
```

#### ExceptionTest02:

```java
package com.异常;
/*
java语言中异常是以什么形式存在的呢？
    1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象
    2、异常对应的现实生活中是怎样的？
        如：
            火灾（异常类）：
                2008年8月8日，小明家着火了（异常对象）
                2008年8月9日，小刚家着火了（异常对象）
                2008年9月8日，小红家着火了（异常对象）

            类是模板    对象是实际存在的个体

            钱包丢了（异常类）
            2008年1月8日，小明的钱包丢了（异常对象）
            2008年1月9日，小芳的钱包丢了（异常对象）
            ......

 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        //通过“异常类”实例化“异常对象”
        NumberFormatException nfe = new NumberFormatException("数字格式化异常！");
        //java.lang.NumberFormatException:数字格式化异常
        System.out.println(nfe.toString());

        NullPointerException npe = new NullPointerException("空指针异常发生了！");
        System.out.println(npe);

    }
}
```

#### ExceptionTest03:

```java
package com.异常;

public class ExceptionTest03 {
    public static void main(String[] args) {
        /*
        程序执行到此处发生了ArithmeticException异常，
        底层new了一个ArithmeticException异常对象
        然后抛出了，由于是main方法调用了100/0，所以这个异常ArithmeticException
        抛给了main方法。main方法没有处理，将这个异常自动抛给了JVM，JVM最终终止程序执行

        ArithmeticException继承RuntimeException，属于运行时异常
        在编写程序阶段不需要对这种异常进行预先处理
         */
        System.out.println(100/0);

        //这里的hello world没有输出，没有执行
        System.out.println("hello world!");
    }
}
```

#### ExceptionTest04:

```java
package com.异常;
/*
以下代码报错的原因是什么？
    因为doSome()方法声明位置上使用了：throws ClassNotFoundException
    而ClassNotFoundException是编译时异常。必须编写代码处理，没有处理编译器报错
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
        //main方法中调用doSome()方法
        //因为doSome()方法声明位置上有：throws ClassNotFoundException
        //我们在调用doSome()方法的时候必须对这种异常进行预先的处理。
        //如果不处理，编译器就报错
        //编译器报错信息：Unhandled exception:java.lang.ClassNotFoundException
        //doSome();

    }

    /**
     * doSome方法在方法声明的位置上使用了：throws ClassNotFoundException
     * 这个代码表示doSome()方法在执行过程中，有可能会出现ClassNotFoundException异常
     * 叫做类没有找到异常，这个异常直接父类是：Exception，所以ClassNotFoundException属于编译时异常
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!");
    }
}
```

#### ExceptionTest05:

```java
package com.异常;
/*
异常处理的原理：
 */
public class ExceptionTest05 {
    //第一种处理方式:在方法声明的位置上继续使用：throws，来完成异常的继续上抛。抛给调用者。
    //上抛类似于推卸责任。（继续把异常传递给调用者）
    /*
    public static void main(String[] args) throws ClassNotFoundException{
        doSome();
    }
    */

    //第二种处理方式：try...catch进行捕捉
    //捕捉等于把异常给拦下了，异常真正的解决了。（调用者是不知道的）
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!");
    }
}
```

#### ExceptionTest06:

```java
package com.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
处理异常的第一种方式：
    在方法声明的位置上使用throws关键字抛出异常，谁调用我这个方法，我就抛给谁。抛给调用者来处理。
    处理异常的态度：上报
处理异常的第二种方式：
    使用try...catch语句对异常进行捕捉
    这个异常不会上报，自己把这个异常处理了。
    异常到此为止，不再上抛了。

注意：
    只要异常没有捕捉，采用上报的方式，此方法的后续代码不会执行
    另外需要注意，try语句块中的某一行出现异常，改行后面的语句不会执行
 */
public class ExceptionTest06 {
    //一般不建议在main方法上使用throws，因为这个异常如果真正发生了，一定会抛给JVM
    //JVM只有终止程序运行
    //异常处理机制的作用就是增强程序的健壮性，怎么能做到，异常发生了也不影响程序的执行。
    //所以一般main方法中的异常建议使用try...catch进行捕捉。main方法就不要继续上抛了。
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
            //如果以上代码出现异常，直接进入catch语句块中执行
            System.out.println("hello");
        } catch (FileNotFoundException e) {//这个e引用保存的内存地址是那个new出来的异常对象的内存地址
            System.out.println("文件不存在，或路径错误");
            System.out.println(e);
        }
        //try...catch把异常抓住之后，这里的代码会继续执行
        System.out.println("main over");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    //可以抛FileNotFoundException的父对象IOException,throws后面也可以抛出多个异常，用逗号隔开
    //但是必须对异常进行处理（直接throws抛给上一级，或者自己使用try...catch捕获）
    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() throws FileNotFoundException {
        //创建一个输入流对象，该流指向一个文件
        //一个方法当中的代码出现异常之后，如果上报的话，此方法结束
        new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\MarkDown语法.md");
        //new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\MarkDown语法.md");
        System.out.println("如果以上代码出现异常，这里会执行吗？");
    }
}

```

#### ExceptionTest07:

```java
package com.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
try...catch深入
    1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该类型的父类型
    2、catch可以写多个。建议catch的时候，精确的一个一个处理，这样有利于程序的调试
    3、catch写多个的时候，从上到下，必须遵守从小到大的原则
    
在以后开发中，处理编译时异常，应该上报还是捕捉？
    如果希望调用者知道，选择throws上抛
    其它情况使用捕捉的方式
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        try {
            //FileInputStream fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\MarkDown语法.md");
            FileInputStream fis = new FileInputStream("C:\\User\\86187\\Desktop\\Java\\MarkDown语法.md");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        }
        System.out.println("hello");

        try {
            //创建输入流
            FileInputStream fis = new FileInputStream("C:\\User\\86187\\Desktop\\Java\\MarkDown语法.md");
            //读文件
            fis.read();
        } catch (IOException e) {//多态：IOException e = new FileNotFoundException
            System.out.println("文件不存在！");
        }

        try {
            //创建输入流
            FileInputStream fis = new FileInputStream("C:\\User\\86187\\Desktop\\Java\\MarkDown语法.md");
            //读文件
            fis.read();
        }catch (FileNotFoundException e){
            System.out.println("文件不存在！");
        }catch (IOException e) {//多态：IOException e = new FileNotFoundException
            System.out.println("读文件错误！");
        }
        
        //JDK8新特性：支持catch捕捉异常用“|”符号
        try {
            FileInputStream fis = new FileInputStream("C:\\User\\86187\\Desktop\\Java\\MarkDown语法.md");
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e) {
            System.out.println("文件不存在?数学格式异常？空指针异常？都有可能");
        }
    }
}
```

#### ExceptionTest08:

```java
package com.异常;
/*
异常对象有两个非常重要的方法：
    获取异常简单的描述信息：
        String msg = exception.getMessage();
    打印异常追踪的堆栈信息：(常用)
        exception.printStackTrace();
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        //这里只是new了异常对象，但是没有将异常对象抛出。JVM会认为这是一个普通的Java对象
        NullPointerException e = new NullPointerException("空指针异常");
        //获取异常简单描述信息：这个信息实际上就是构造方法上面的String参数
        String message = e.getMessage();
        System.out.println(message);

        //打印异常追踪的堆栈信息
        //java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印的
        e.printStackTrace();

        System.out.println("hello");
    }
}
```

#### ExceptionTest09:

```java
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
```

#### ExceptionTest10:

```java
package com.异常;
/*
finally语句
 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        /*
        try和finally，没有catch可以吗？可以
            try不能单独使用
            try、finally可以联合使用
        以下代码的执行顺序：
            先执行try...
            再执行finally...
            最后执行return（return语句一执行，方法结束）
         */
        try{
            System.out.println("try...");
            return;
            //System.out.println("hello");没有机会运行，报错
        }finally {
            System.out.println("finally...");
        }

        //System.out.println("hello");没有机会运行，报错
    }
}

```

#### ExceptionTest11:

```java
package com.异常;
/*
finally
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        try{
            System.out.println("try...");
            //退出JVM
            System.exit(0);//退出JVM之后，finally语句中的代码就不执行了
        }finally {
            System.out.println("finally...");
        }
    }
}
```

#### ExceptionTest12:

```java
package com.异常;
/*
finally面试题
 */
public class ExceptionTest12 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);//100
    }
    /*
    java语法规则（有一些规则是不能破环的）
        java中有这样的规则：
            方法体中的代码必须遵循自上而下的顺序依次逐行执行（亘古不变的语法）
        java中还有一条语法：
            return语句一旦执行，整个方法必须结束（亘古不变的语法）
     */
    public static int m(){
        int i = 100;
        try{
            //这行代码出现再int i = 100;的下面，所以最终结果必须是返回100
            //return语句还是保证在finally语句块结束后执行。一旦执行，整个方法结束
            return i;
        }finally {
            i++;
        }
    }
}

/*
反编译之后的结果
public static int m(){
    int i = 100;
    int j = i;
    i++;
    return j;
}
 */
```

#### ExceptionTest13:

```java
package com.异常;
/*
final、finally、finalize有什么区别？
    final   关键字
        final修饰的类无法继承
        final修饰的方法无法覆盖
        final修饰的变量不能重新赋值

    finally 关键字
        和try一起联合使用，finally语句块中的代码必须执行

    finalize    标识符
        是一个Object类中方法名
        这个方法是由垃圾回收期GC负责调用的
 */
public class ExceptionTest13 {
    public static void main(String[] args) {
        //final是一个关键字，表示最终的。不变的
        final int i = 100;

        //finally也是一个关键字。和try联合使用，使用在异常处理机制中
        //在finally语句块中的代码是一定会执行的
        try{

        }finally {
            System.out.println("finally...");
        }

        //finalize()是Object类中的一个方法。作为方法名出现
        //所以finalize是标识符

    }
}
```

#### ExceptionTest14:

```java
package com.异常;
/*
1、SUN提供的JDK内置的异常肯定是不够用的。在实际开发中，有很多业务，这些业务出现异常
之后，JDK中都是没有的，和业务挂钩的。那么就需要程序员根据实际需要自己定义异常类。
2、Java中如何定义异常类
    两步：
        第一步：编写一个类继承Exception或者RuntimeException.
        第二步：提供两个构造方法，一个无参数的，一个带有String参数的
 */
public class MyException extends Exception{//编译时异常

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
```

```java
package com.异常;

public class ExceptionTest14 {
    public static void main(String[] args) {
        //创建异常对象(只new了异常对象，并没有手动抛出)
        MyException myException = new MyException("用户名不能为空！");

        //打印异常堆栈信息
        myException.printStackTrace();

        //获取异常简单的描述信息
        String message = myException.getMessage();
        System.out.println(message);
    }
}
```

#### ExceptionTest15:

```java
package com.异常;

/*
异常在方法覆盖中需要注意的点：
    重写之后的方法不能比重写之前的方法抛出更多（或更宽泛）的异常，可以更少
 */
public class ExceptionTest15 {
}

class Animal {
    public void doSome(){
    }

    public void doOther() throws Exception {
    }
}

class Cat extends Animal {
    //编译报错
    /*
    public void doSome () throws Exception {

    }
     */

    //编译正常
    //public void doOther(){}

    //编译正常
    //public void doOther() throws Exception{}

    //编译正常
    public void doOther() throws NullPointerException {}
}
```

### 异常测试：

```java
package com.异常.测试;
/*
自定义类：
 */
public class IllegalNameException extends Exception {
    public IllegalNameException() {
    }

    public IllegalNameException(String message) {
        super(message);
    }
}
```

```java
package com.异常.测试;
/*
用户业务类：处理用户相关的业务：例如登入、注册等功能
 */
public class UserService {
    /**
     * 用户名注册
     * @param username  用户名
     * @param password  密码
     * @throws IllegalNameException 当用户名为null、或者用户名长度小于6，或者长度大于14，会出现该异常！
     */
    public void register(String username,String password) throws IllegalNameException {
        //引用等于null的这个判断最好放到所有条件的最前面
        if (username == null || username.length() < 6 || username.length() > 14){
            throw new IllegalNameException("用户名不合法，长度必须在[6-14]之间");
        }
        //程序能够执行到这，说明用户名合法
        System.out.println("注册成功，欢迎"+username);
    }
}
```

```java
package com.异常.测试;

public class Test {
    public static void main(String[] args) {
        //创建userService对象
        UserService userService = new UserService();
        try {
            userService.register("jack","123");
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
```

