# 反射机制

## 1、

### 1.1、反射机制有什么用

通过java语言中的**反射机制可以操作字节码文件**（可以读和修改字节码文件）

### 1.2、反射机制的相关类在哪个包下

java.lang.reflect.*;

### 1.3、反射机制相关的重要的类有哪些

java.lang.Class:代表整个字节码，代表一个类型，代表整个类

java.lang.reflect.Method:代表字节码中的方法字节码，代表类中的方法

java.lang.reflect.Constructor:代表字节码中的构造方法字节码，代表类中的构造方法

java.lang.reflect.Field:代表字节码中的属性字节码，代表类中的成员变量（静态变量，实例变量）

### 1.4、类加载器概述

##### 1.4.1、什么是类加载器？

​		专门负责加载类的命令/工具

​		ClassLoader

##### 1.4.2、JDK中自带了3个类加载器

​	启动类加载器

​	扩展类加载器

​	应用类加载器

假设有这样一段代码：

​	String s = "abc";

​	代码在开始执行之前，会将所需要的类全部加载到JVM当中。通过类加载器加载，看到以上代码，类加载器会找String.class文件，找到就加载，那么是怎么进行加载的呢？

​	首先通过”启动类加载器“加载。

​		注意：启动类加载器专门加载：D:\JAVA\jdk1.8\jre\lib\rt.jar

​		rt.jar中都是JDK最核心的类库

​	如果通过”启动类加载器“加载不到的时候，会通过”扩展类加载器“加载。

​		注意：扩展类加载器专门加载：D:\JAVA\jdk1.8\jre\lib\ext\ *.jar

​	如果”扩展类加载器“没有加载到，那么会通过”应用类加载器“加载

​		注意：应用类加载器专门加载：classpath中的类

##### 1.4.3、双亲委派机制

​	java中为了保证类加载的安全，使用了双亲委派机制，优先从启动类加载器加载，这个称为”==父==“，”父“无法加载到，再从扩展类加载器加载，这个称为”==母==“。**双亲委派**。如果都加载不到，才会考虑从应用类加载器中加载，直到加载到为止。



## 2、代码

### ReflectTest01:

```java
package com.反射机制;

import java.util.Date;

/*
* 要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取java.lang.Class实例？
*   三种方式：
*       第一种：Class c = Class.forName("完整类名带包名");
*       第二种：Class c = 对象.getClass();
*       第三种：Class c = 任何类型.class;
* */
public class ReflectTest01 {
    public static void main(String[] args) {
        //第一种方法
        /*
        * Class.forName()
        *   1、静态方法
        *   2、方法的参数是一个字符串
        *   3、字符串需要的是一个完整类名
        *   4、完整类名必须带有包名。java.lang包也不能省略。
        * */
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String");//c1代表String.class文件，或者说c1代表String类型
            c2 = Class.forName("java.util.Date");//c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer");//c3代表Integer类型
            Class c4 = Class.forName("java.lang.System");//c4代表System类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //第二种方法
        //java中任何一个对象都有一个方法：getClass()
        String s = "abc";
        Class x = s.getClass();//x代表String.class字节码文件，代表String类型
        System.out.println(c1 == x);//true（==判断的是对象的内存地址）

        Date date = new Date();
        Class y = date.getClass();//y代表Date.class字节码文件
        System.out.println(c2 == y);//true（c2和y两个变量中保存的内存地址都是一样的，都指向方法区中的字节码文件Date.class）

        //第三种方法
        //java语言中任何一种类型，包括基本数据类型，他都有.class属性
        Class z = String.class;//z代表String类型
        Class k = Date.class;//k代表Date类型
        Class f = int.class;//f代表int类型
        Class e = double.class;//e代表double类型
        System.out.println(x == z);
    }
}
```

### 通过反射实例化对象：

#### ReflectTest02:

```java
package com.反射机制.a反射创建对象;
/*
* 获取到Class能干什么？
*   通过Class的newInstance()方法来实例化对象。
*   注意：newInstance()方法内部实际上调用了无参数构造方法，必须保证无参构造方法存在才可以
* */
public class ReflectTest02 {
    public static void main(String[] args) {
        //这是不使用反射机制，创建对象
        /*User user = new User();
        System.out.println(user);*/

        //下面这段代码是以反射机制的方式创建对象
        try {
            //通过反射机制，获取Class，通过Class来实例化对象
            //c代表User类型
            Class c = Class.forName("com.反射机制.a反射创建对象.User");

            //newInstance()这个方法会调用User这个类的“无参数构造方法”，完成对象的创建
            //重点是：newInstance()调用的是无参数构造，必须保证无参数构造是存在的。
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
```

#### User:

```java
package com.反射机制.a反射创建对象;

public class User {
    public User() {
        System.out.println("无参构造方法");
    }
    //定义了有参数的构造，系统默认的无参构造就没了
    /*public User(String s){

    }*/
}
```

### ReflectTest03:

```java
package com.反射机制.a反射创建对象;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
* 验证反射机制的灵活性。
*   java代码写一遍，再不改变java源代码的基础上，可以做到不同对象的实例化。
*   非常之灵活。（符合OCP开闭原则：对扩展开放，对修改关闭）
*
* 后期学习的高级框架如：
*   ssh ssm
*   Spring SpringMVC MyBatis
*   Struts Hibernate
*   ...
*   这些高级框架底层实现原理：都采用了反射机制，所以反射机制是很重要的。
*   学会了反射机制有利于理解框架底层的源代码。
* */
public class ReflectTest03 {
    public static void main(String[] args) {
        //这种方式代码就是写死的，只能创建一个User类型的对象
        //User user = new User();

        //以下代码是灵活的，代码不需要改动，可以修改配置文件，配置文件修改之后，可以创建出不同的实例对象。
        FileReader reader = null;
        try {
            //通过IO读取classinfo.properties文件
            reader = new FileReader("C:\\Users\\86187\\Desktop\\Java\\java\\javase_code\\classinfo.properties");
            //创建属性类对象Map
            Properties pro = new Properties();//key，value都是String
            //加载
            pro.load(reader);
            //通过key获取value
            String className = pro.getProperty("className");
            System.out.println(className);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

### ReflectTest04:

```java
package com.反射机制.a反射创建对象;
/*
* 研究一下：Class.forName()发生了什么？
*   结论：Class.forName()这个方法的执行会导致：类加载
*   重点：
*       如果只是希望一个类的静态代码块执行，其它代码一律不执行，
*       可以使用：Class.forName("完整类名（加包名）");
*       这个方法的执行会导致类加载，类加载时，静态代码块执行。
* 提示：
*   后面JDBC（连接数据库）技术需要使用
* */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            //Class.forName()这个方法的执行会导致：类加载
            Class.forName("com.反射机制.a反射创建对象.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class MyClass{
    //静态代码块在类加载的时候执行，并且只执行一次
    static {
        System.out.println("MyClass类的静态代码块执行了");
    }
}
```

### ReflectTest05:

```java
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
		
        //java文件后缀改.
        String path1 = Thread.currentThread().getContextClassLoader().
                getResource("com/反射机制/ReflectTest01.class").getPath();
        System.out.println(path1);
    }
}
```

### IoPropertiesTest:

```java
package com.反射机制.b反射机制深入;
/*
* //以流的形式直接返回
* */
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{
        //获取一个文件的绝对路径了
        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        FileReader reader = new FileReader(path);*/

        //直接以流的形式返回
        InputStream reader = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo2.properties");

        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        String className = pro.getProperty("className");
        System.out.println(className);
    }
}
```

### 资源绑定器：

#### ResourceBundleTest:

```java
package com.反射机制.c资源绑定器;

import java.util.ResourceBundle;

/*
* 资源绑定器：（只限用于属性配置文件）
*   java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容。
*   使用以下这种方式的时候，属性配置文件xxx.properties必须放到类路径下。
* */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器，只能绑定xxx.properties文件，并且这个文件必须在类（src根路径下为起点）路径下。
        //文件扩展名也必须是properties，并且在写路径的时候，路径后面的扩展名不能写。
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");

        String className = bundle.getString("className");
        System.out.println(className);
    }
}
```

### ReflectTest06:

```java
package com.反射机制.d反射应用;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
* 反射Student类当中所有的Field
* */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception{
        //获取整个类
        Class studentClass = Class.forName("com.反射机制.d反射应用.Student");
        //getFields()可以获取类中所有的public 修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);
        for (Field field:fields){
            System.out.println(field);//public int com.反射机制.d反射应用.Student.id
            System.out.println(field.getName());//
        }
        System.out.println("=============================");
        //获取所有的Field
        Field[] declaredFields = studentClass.getDeclaredFields();
        System.out.println(declaredFields.length);
        for (Field declaredField:declaredFields){
            //获取属性的修饰符列表
            //System.out.println(i);//返回修饰符是一个数字，每个数字是修饰符对应的代号
            int i = declaredField.getModifiers();
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);
            //获取属性的类型
            Class fieldType = declaredField.getType();
            //获取属性的名字
            //String fieldName = fieldType.getName();
            String fieldName = fieldType.getSimpleName();
            System.out.println(fieldName);
        }
    }
}
//反射属性Field
class Student{
    //Field翻译为字段，其实就是属性/成员
    //4个Field，分别采用了不同的访问控制权限修饰符
    public int id;
    private String name;
    protected int age;
    boolean sex;
}
```

### ReflectTest07:

```java
package com.反射机制.d反射应用;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
* 通过反射机制，反编译一个类的属性Field
* */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{
        //创建这个是为了拼接字符串
        StringBuilder sb = new StringBuilder();

        //Class studentClass = Class.forName("com.反射机制.d反射应用.Student");
        Class studentClass = Class.forName("java.lang.String");
        //sb.append("public class Student {");
        sb.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+"{\n");
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field:fields){
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers()));
            sb.append(" ");
            sb.append(field.getType().getSimpleName());
            sb.append(" ");
            sb.append(field.getName());
            sb.append(";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
```

### ReflectTest08:

```java
package com.反射机制.d反射应用;

import java.lang.reflect.Field;

/*
* 必须掌握：
*   怎么通过反射机制访问一个Java对象的属性？
*       给属性赋值set
*       获取属性的值get
* */
public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        //不使用反射机制，怎么去访问一个对象的属性呢？
        Student s = new Student();
        //三要素：给s对象的id属性赋值1111
        //要素1：对象s   要素2：id属性    要素3：1111
        s.id = 1111;
        System.out.println(s.id);

        //使用反射机制，怎么去访问一个对象的属性（set get）
        Class studentClass = Class.forName("com.反射机制.d反射应用.Student");
        Object object = studentClass.newInstance();//object就是Student对象（底层调用无参数构造方法）

        //获取具体属性（根据属性的名称来获取Field）
        Field id = studentClass.getDeclaredField("id");
        //给object对象（Student对象）具体属性赋值
        id.set(object,2222);//给object对象的id属性赋值2222

        //读取具体属性的值
        System.out.println(id.get(object));

        //可以访问私有的属性吗？
        Field name = studentClass.getDeclaredField("name");
        //需要打破封装才可以（反射机制的缺点：打破封装，可能会给不法分子留下机会）
        //这样设置完之后，在外部也是可以访问private的
        name.setAccessible(true);//打破封装

        name.set(object,"jack");
        System.out.println(name.get(object));
    }
}
```

### 可变长参数：

```java
package com.反射机制.e反射Method;
/*
* 可变长参数
*   int... args 这就是可变长参数
*       语法是：类型...(注意：一定是3个点)
*   注意点：
*       1、可变长参数要求的参数个数是：0~N个
*       2、可变长参数在参数列表中必须在最后一个位置上，而且可变长参数只能有1个
*       3、可变长参数可以看作是一个数组
* */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);
        //m("abc");类型不对
        m3("jack","kitty","rose");

        String[] strings = {"a","b","c"};
        m3(strings);

        m3(new String[]{"我","是","中","国","人"});
    }
    public static void m(int... args){
        System.out.println("m方法执行了");
    }
    //public static void m2(int... args2,String... args2){}

    public static void m2(int a,String... args1){}

    public static void m3(String... args){
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" "+"\n");
        }
    }
}
```

### ReflectTest09:

```java
package com.反射机制.e反射Method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
*反射Method
* */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception{
        Class userServiceClass = Class.forName("com.反射机制.e反射Method.UserService");
        //获取所有的Method
        Method[] methods =userServiceClass.getDeclaredMethods();
        //System.out.println(methods.length);//2

        //遍历Method
        for (Method method:methods){
            //获取方法的修饰符
            System.out.println(Modifier.toString(method.getModifiers()));
            //获取方法的返回值类型
            System.out.println(method.getReturnType().getSimpleName());
            //获取方法名
            System.out.println(method.getName());
            //方法的修饰符列表（一个方法的参数可能会有多个）
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType:parameterTypes){
                System.out.println(parameterType.getSimpleName());
            }

        }
    }
}
class UserService{
    /**
     * 登入方法
     * @param name  用户名
     * @param password  密码
     * @return  true表示登入成功，false表示登入失败
     */
    public boolean login(String name,String password){
        if ("admin".equals(name) && "123".equals(password)){
            return true;
        }
        return false;
    }
    public void logout(){
        System.out.println("系统安全退出");
    }
}
```

### ReflectTest10:

```java
package com.反射机制.e反射Method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
* 反编译Method
*   反编译一个类的方法
* */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        //Class userServiceClass = Class.forName("com.反射机制.e反射Method.UserService");
        Class userServiceClass = Class.forName("java.lang.String");
        sb.append(Modifier.toString(userServiceClass.getModifiers())+" class "+
                userServiceClass.getSimpleName()+"{\n");

        Method[] methods = userServiceClass.getDeclaredMethods();
        for (Method method:methods){
            sb.append("\t");
            sb.append(Modifier.toString(method.getModifiers()));
            sb.append(" ");
            sb.append(method.getReturnType().getSimpleName());
            sb.append(" ");
            sb.append(method.getName());
            sb.append("(");
            //参数列表
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType:parameterTypes){
                sb.append(parameterType.getSimpleName());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("){}\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
```

### ReflectTest11:

```java
package com.反射机制.e反射Method;

import java.lang.reflect.Method;

/*
* 重点：必须掌握
*   通过反射机制怎么调用一个对象的方法
*
* 反射机制，让代码很具有通用型，可变化的内容都是写到配置文件当中，
* 将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了。
* 但是java代码不需要做任何改动。这就是反射的作用
* */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception{
        //不适用反射机制调用方法
        /*
        * 要素分析：
        *   要素1：对象userService
        *   要素2：login方法名
        *   要素3：实参列表
        *   要素4：返回值
        * */
        /*UserService userService = new UserService();
        boolean login = userService.login("admin", "123");
        System.out.println(login?"登入成功":"登入失败");*/

        //使用反射机制调用方法
        Class userService = Class.forName("com.反射机制.e反射Method.UserService");
        //创建对象
        Object o = userService.newInstance();
        //获取Method
        Method login = userService.getDeclaredMethod("login", String.class, String.class);
        /*
        * 反射机制调用Method也有四要素：
        *   1、login方法
        *   2、o对象
        *   3、"admin","123"实参
        *   4、retValue返回值
        * */
        Object retValue = login.invoke(o, "admin", "123");
        System.out.println((boolean)retValue?"登入成功":"登入失败");
    }
}
```

### ReflectTest12:

```java
package com.反射机制.f反射Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
* 反编译一个类的Constructor构造方法
* */
public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        Class vipClass = Class.forName("com.反射机制.f反射Constructor.Vip");
        sb.append(Modifier.toString(vipClass.getModifiers()));
        sb.append(" class ");
        sb.append(vipClass.getSimpleName());
        sb.append("{\n");

        //拼接构造方法
        Constructor[] constructors = vipClass.getDeclaredConstructors();
        for (Constructor constructor:constructors){
            sb.append("\t");
            sb.append(Modifier.toString(constructor.getModifiers()));
            sb.append(" ");
            sb.append(vipClass.getSimpleName());
            sb.append("(");
            //拼接参数
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType:parameterTypes){
                sb.append(parameterType.getSimpleName());
                sb.append(",");
            }
            //删除最后下标位置上的字符
            if (parameterTypes.length>0){
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append("){}\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
class Vip{
    int no;
    String name;
    String birth;
    boolean sex;

    public Vip() {
    }

    public Vip(int no) {
        this.no = no;
    }

    public Vip(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Vip(int no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    public Vip(int no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sex=" + sex +
                '}';
    }
}
```

### ReflectTest13:

```java
package com.反射机制.f反射Constructor;

import java.lang.reflect.Constructor;

/*
* 反射机制调用构造方法
* */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception {
        //不使用反射机制怎么创建对象
        /*Vip v1 = new Vip();
        Vip v2 = new Vip(110,"张三","2001-10-11",true);*/

        //使用反射机制怎么创建对象
        Class vipClass = Class.forName("com.反射机制.f反射Constructor.Vip");
        //调用无参数构造方法
        /*Object obj = vipClass.newInstance();
        System.out.println(obj);*/

        //调用有参数的构造方法怎么办？
        //第一步：先获取到这个有参数的构造方法
        Constructor con = vipClass.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
        //第二步：调用构造方法new对象
        Object object = con.newInstance(110, "jackson", "1990-10-11", true);
        System.out.println(object);

        //获取无参数构造方法
        Constructor constructor = vipClass.getDeclaredConstructor();//无参数构造
        Object newObj = constructor.newInstance();
        System.out.println(newObj);
    }
}
```

### ReflectTest14:

```java
package com.反射机制.g反射获取父类和父接口;
/*
* 重点：给你一个类，怎么获取这个类的父类，已经实现了哪些接口？
* */
public class ReflectTest14 {
    public static void main(String[] args) throws Exception{
        //String举例
        Class stringClass = Class.forName("java.lang.String");
        //获取String类的父类
        Class superClass = stringClass.getSuperclass();
        System.out.println(superClass);

        //获取String类实现的所有接口（一个类可以实现多个接口）
        Class[] interfaces = stringClass.getInterfaces();
        for (Class in:interfaces){
            System.out.println(in.getName());
        }
    }
}
```

