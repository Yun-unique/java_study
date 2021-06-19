### 常用类：

#### 1、String

##### **StringTest1：**

```java
package com.常用类.String;
/*
关于Java JDK中内置的一个类：java.lang.String
    1、String表示字符串类型，属于引用数据类型，不属于基本数据类型
    2、在java中随便使用双引号括起来的都是String对象。例如："abc"，"def"，"hello world",这是三个String对象。
    3、java中规定，双引号括起来的字符串，是不可变的，也就是说"abc"自出生到最终死亡，不可变，不能变成"abcd"，也不能变成"ab"
    4、在JDK当中双引号括起来的字符串，例如："abc","def"都是直接存储在"方法区"的字符串常量池当中的
        为什么SUN公司把字符串存储在一个“字符串常量池”当中呢，因为字符串在实际的开发中使用太频繁，为了提高执行效率
        所以把字符串放到了方法区的字符串常量池当中
 */
public class StringTest01 {
    public static void main(String[] args) {
        //这两行代码表示底层创建了3个字符串对象，都在字符串常量池当中
        String string1 = "abcdef";
        String string2 = "abcdef" + "xy";

        //分析：这是使用new的方式创建的字符串对象。这个代码中的"xy"是从哪里来的？
        //凡是双引号括起来的都在字符串常量池中有一份
        //new对象的时候一定在堆内存中开辟空间
        String string3 = new String("xy");
    }
}
```

![](C:\Users\86187\Desktop\Java\java截图\常用类截图\String1.png)



##### **StringTest2:**

```java
package com.常用类.String;
/*

 */
public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
        //"hello"是存储在方法区的字符串常量池当中
        //所以这个"hello"不会新建（因为这个对象已经存在了）
        String s2 = "hello";
        //分析结果是true还是false
        //==号比较的是变量中保存的内存地址
        System.out.println(s1==s2);//true

        String x = new String("xyz");
        String y = new String("xyz");
        //分析结果是true还是false
        System.out.println(x==y);//false

        //通过这个案例的学习，说明字符串对象之间的比较不能使用“==”
        //“==”不保险。应该调用String类的equals方法
        //String类已经重写了equals方法，以下的equals方法调用的是String重写之后的equals方法
        System.out.println(x.equals(y));//true

        String k = new String("testString");
        //"testString"这个字符串可以后面加"."
        //因为"testString"是一个String字符串对象，只要是对象就能调用字符串方法
        System.out.println("testString".equals(k));//建议使用这种方式，可以避免空指针异常
        System.out.println(k.equals("testString"));//k如果为空，则会出现空指针异常
    }
}
```

![](C:\Users\86187\Desktop\Java\java截图\常用类截图\String2.png)

##### **StringTest3:**

```java
package com.常用类.String;
/*
分析以下程序创建了几个对象
 */
public class StringTest03 {
    public static void main(String[] args) {
        /*
        一个三个对象：
            方法区字符串常量池中有一个："hello"
            堆内存中有两个String对象
         */
        String s1 = new String("hello");
        String s2 = new String("hello");
    }
}
```

##### StringTest4:

```java
package com.常用类.String;
/*
关于String类中的构造方法:
    第一个：String s = new String("");
    第二个：String s = "";最常用
    第三个：String s = new String(char数组);
    第四个：String s = new String(char数组,起始下标,长度);
    第五个：String s = new String(byte数组);
    第六个：String s = new String(byte数组,起始下标,长度);
 */
public class StringTest04 {
    public static void main(String[] args) {
        //创建字符串对象最常用的一种方式
        String s1 = "hello world!";
        //s1这个变量中保存的是一个内存地址
        //按说以下应该输出一个地址
        //但是输出一个字符串。说明String类已经重写了toString()方法
        System.out.println(s1);//hello world
        //System.out.println(s1.toString());

        //这里只掌握常用的构造方法
        byte[] bytes = {97,98,99};//97是a，98是b，99是c
        String s2 = new String(bytes);

        //输出一个引用的时候，会自动调用toString()方法，默认Object的话，会自动输出对象的内存地址
        //通过输出结果我们可以得出一个结论：String类已经重写了toString()方法
        //输出字符串对象的话，输出的不再是对象的内存地址，而是字符串本身
        System.out.println(s2.toString());//abc
        System.out.println(s2);//abc

        //String(字节数组,数组元素下标位置,长度)
        //将byte数组中的一部分转换成字符串
        String s3 = new String(bytes,1,2);
        System.out.println(s3);//bc
    }
}

```

##### StringTest05:

```java
package com.常用类.String;

//String类中的常用方法
public class StringTest05 {
    public static void main(String[] args) {
        //1（掌握）char charAt(int index)
        char c = "中国人".charAt(1);//"中国人"是一个字符串对象，只要是对象就能调用方法"."
        System.out.println(c);//国

        //2（了解）int compareTo(String anotherString)
        //字符串之间的比较大小用compareTo方法
        //拿着字符串一个一个对应比较，一分出大小后面的就不用比了，前大后小结果为1、前小后大为-1，都相等则为0
        System.out.println("xyz".compareTo("yzx"));//-1

        //3（掌握）boolean contains(CharSequence s)
        //判断前面的字符串中是否包含后面的子字符串
        System.out.println("helloworld.java".contains(".java"));//true
        System.out.println("http://www.baidu.com".contains("https://"));//false

        //4（掌握）boolean endWith(String suffix)
        //判断当前字符串是否以某个字符串结尾
        System.out.println("test.txt".endsWith(".java"));//false
        System.out.println("test.txt".endsWith(".txt"));//true

        //5（掌握）boolean equals(Object anObject)
        //比较两个字符串是否相等，必须使用equals方法，不能使用“==”
        System.out.println("abc".equals("abc"));

        //6（掌握）boolean equalsIgnoreCase(String anotherString)
        //判断两个字符串是否相等，并且同时忽略大小写
        System.out.println("ABc".equalsIgnoreCase("abC"));

        //7（掌握）byte[] getBytes()
        //将字符串对象转换成字节数组
        byte[] bytes = "abcdef".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //8（掌握）int indexOf(String str)
        //判断某个子字符串在当前字符串中第一次出现处的索引
        System.out.println("oracle,java,c++,.net,c#,php,python,java,oracle,c++".indexOf("java"));

        //9（掌握）boolean isEmpty()
        //判断某个字符串是否为"空字符串"。底层调用的应该是字符串的length()方法
        System.out.println("a".isEmpty());//false
        System.out.println("".isEmpty());//true

        //10（掌握）int length()
        //面试题：判断数组长度和判断字符串长度不一样
        //判断数组长度是length属性，判断字符串长度是length()方法
        int[] ints = new int[5];
        System.out.println(ints.length);
        System.out.println("abc".length());
        System.out.println("".length());

        //11（掌握）int lastIndexOf(String str)
        //判断某个子字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("oracle,java,c++,.net,c#,php,python,java,oracle,c++".lastIndexOf("java"));

        //12（掌握）String replace(CharSequence target,CharSequence replacement)
        //String的父接口就是：CharSequence
        String newString = "http://www.baidu.com".replace("http","https");
        System.out.println(newString);//https://www.baidu.com
        System.out.println("name=zhangsan&password=123&age=20".replace("=",":"));

        //13（重点掌握）String[] split(String regex)
        //拆分字符串,返回字符串,输出字符串用遍历的方法
        String[] strings = "1998-05-10".split("-");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        //14（掌握）boolean startWith(String prefix)
        //判断某个字符串是否以某个字符串开始
        System.out.println("http://www.baidu.com".startsWith("http"));

        //15（掌握）String substring(int beginIndex)截取字符串，参数是起始下标
        //16（掌握）String substring(int begunIndex,int endIndex),参数是起始下标和结束下标
        //截取左闭右开，beginIndex(起始位置包括)，endIndex(结束位置，不包括)
        System.out.println("http://www.baidu.com".substring(7));//www.baidu.com
        System.out.println("http://www.baidu.com".substring(7,10));//www

        //17（掌握）char[] toCharArray()
        //将字符串转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println(chars);//我是中国人
        String[] str = {"my","name","is","jym"};
        System.out.println(str);//[Ljava.lang.String;@5fd0d5ae

        //18（掌握）String toLowerCase()
        //转换为小写
        System.out.println("ABCDefKXyz".toLowerCase());

        //19（掌握）String toUpperCase()
        //转换为大写
        System.out.println("ABCDefKXyz".toUpperCase());

        //20（掌握）String trim()
        //去除字符串前后空白
        System.out.println("   hello   world    ".trim());

        //21（掌握）String中只有一个方法是静态的，不需要new对象
        //这个方法叫做valueOf,静态方法用类名调用,作用：将“非字符串”转换成“字符串”
        System.out.println(String.valueOf(true));
        //这个静态的valueOf()方法，当参数是一个对象的时候，会自动调用该对象的toString()方法
        //没有重写toString()方法对象内存地址：com.常用类.String.Customer@16b98e56
        System.out.println(String.valueOf(new Customer()));

        Object obj = new Object();
        //通过源码可以看出：为什么输出一个引用的时候，会调用toString()方法！！
        //本质上System.out.println()这个方法在输出任何数据的时候都是先转换成字符串，再输出
        //所以打印在控制台输出的都是被转换成字符串输出的数据！！！
        System.out.println(obj);
    }
}
class Customer{}
```

#### 2、StringBuffer：

##### StringBufferTest01：

```java
package com.常用类.StringBuffer;
/*
思考：我们在实际开发中，如果需要进行字符串的频繁拼接，会有什么问题？
    因为java中的字符串是不可变的，每一次拼接都会产生新字符串
    这样会占用大量的方法区内存，造成内存空间的浪费
    String s = "abc";
    s+="hello";
    就以上两行代码，就导致在方法区字符串常量池当中创建了三个对象："abc","hello","abchello"
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        String s = "";
        //这样做会给java的方法区字符串常量池带来很大的压力
        for (int i = 0; i < 100; i++) {
            s+=i;
            System.out.println(s);
        }
    }
}
```

##### StringBufferTest02：

```java
package com.常用类.StringBuffer;
/*
如果以后需要进行大量字符串的拼接操作，建议使用JDK中自带的方法：
    java.lang.StringBuffer
    java.lang.StringBuilder
如何优化StringBuffer的性能？
    在创建StringBuffer的时候尽可能给定一个初始化容量
    最好减少底层数组的扩容次数，预估计一下，给定一个大一些的初始化容量
    关键点：提供一个合适的初始化容量，可以提高程序的执行效率
 */
public class StringBufferTest02 {
    public static void main(String[] args) {
        //创建一个初始化容量为16个byte[] 数组。（字符串缓冲区对象）
        StringBuffer stringBuffer = new StringBuffer();

        //拼接字符串，以后拼接字符串统一调用append()方法
        //append是追加的意思
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.append(3.14);
        stringBuffer.append(true);
        //append方法底层在进行追加的时候，如果byte数组满了，会自动扩容
        stringBuffer.append(100L);
        System.out.println(stringBuffer.toString());

        //指定初始化容量的StringBuffer对象（字符串缓冲区对象）
        StringBuffer sb = new StringBuffer(100);
        sb.append("hello");
        sb.append("world!");
        sb.append("hello");
        sb.append("kitty");
        System.out.println(sb.toString());
    }
}
```

##### StringBuilderTest01:

```java
package com.常用类.StringBuffer;
/*
java.lang.StringBuilder
StringBuffer和StringBuilder的区别:
    StringBuffer中的方法都有：synchronized关键字修饰。表示StringBuffer在多线程环境下运行是安全的。
    StringBuilder中的方法都没有：synchronized关键字修饰。表示StringBuilder在多线程环境下运行是不安全的。

    StringBuffer是线程安全的
    StringBuilder是非线程安全的
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        //使用StringBuilder也是可以完成字符串的拼接操作
        //初始化容量也是16的byte数组
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(100);
        stringBuilder.append(true);
        stringBuilder.append("hello");
        stringBuilder.append("kitty");
        System.out.println(stringBuilder);
    }
}
```

#### 3、基础类型对应的8个包装类

##### IntegerTest01:

```java
package com.常用类.八种包装类.integer;
/*
1、java中为8种基本数据类型又对应准备了8种包装类型。8种包装类型属于“引用数据类型”，父类是Object
2、思考：为什么要再提供8种包装类？
    因为8种基本数据类型不够用
    所以SUN又提供对应的8种包装类型
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        //有没有这种需求：调用doSome()方法的时候需要传递一个数字进去
        //但是数字属于基本数据类型，而doSome()方法参数的类型是Object
        //可见doSome()方法无法接收基本数据类型的数字。那怎么办呢？可以传一个数字对应的包装类进去

        //把100这个数字经过构造方法包装成对象
        MyInt myInt = new MyInt(100);
        //doSome()方法虽然不能直接传100，但是可以传一个100对应的包装类型
        doSome(myInt);
    }
    public static void doSome(Object obj){
        System.out.println(obj.toString());
    }
}

//这种包装类是自己写的，实际开发中我们不需要自己写
//8种基本数据类型对应的8种包装类，SUN公司已经写好了，直接调用就行
class MyInt{
    int value;

    public MyInt(){}

    public MyInt(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
```

##### IntegerTest02:

```java
package com.常用类.八种包装类.integer;
/*
1、8种基本数据类型对应的包装类型名是什么？
    基本数据类型              包装类型
    ---------------------------------------
    byte                    java.lang.Byte（父类是Number）
    short                   java.lang.Short（父类是Number）
    int                     java.lang.Integer（父类是Number）
    long                    java.lang.Long（父类是Number）
    float                   java.lang.Float（父类是Number）
    double                  java.lang.Double（父类是Number）
    boolean                 java.lang.Boolean（父类是Object）
    char                    java.lang.Character（父类是Object）
2、以上八种包装类，重点以java.lang.Integer为代表进行学习，其他的类型照葫芦画瓢就行

3、八种包装类其中6个都是数字对应的包装类，它们的父类都是Number，可以先研究一下Number种公共的方法：
    Number是一个抽象类，无法实例化对象.
    Number类中有这样的方法：涉及装箱、拆箱问题
    byte byteValue()      以byte形式返回指定的数值
    short shortValue()    以short形式返回指定的数值
    int intValue()        以int形式返回指定的数值
    long longValue()      以long形式返回指定的数值
    float floatValue()    以float形式返回指定的数值
    double doubleValue()  以double形式返回指定的数值
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        //123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换
        //基本数据类型--(转换为)-->引用数据类型（装箱）
        Integer i = new Integer(123);

        //将引用数据类型--(转换为)-->基本数据类型（拆箱）
        float f = i.floatValue();
        System.out.println(f);//123.0

    }
}
```

##### IntegerTest03:

```java
package com.常用类.八种包装类.integer;

import java.text.DecimalFormat;

/*
关于Integer类的构造方法，有两个：
    Integer(int)
    Integer(String)
 */
public class IntegerTest03 {
    public static void main(String[] args) {
        //Java9之后不建议使用这个构造方法了，出现横线表示已过时
        //将数字100转换成Integer包装类型（int-->Integer）
        Integer x = new Integer(100);
        System.out.println(x);
        //System.out.println(x.toString());

        //将String类型的数字，转换成Integer包装类型（String-->Integer）
        Integer y = new Integer("123");
        System.out.println(y);

        //double-->Double
        Double d = new Double(1.23);
        System.out.println(d);
        //String-->Double
        Double e = new Double("3.14");
        System.out.println(e);
    }
}
```

##### IntegerTest04:

```java
package com.常用类.八种包装类.integer;

public class IntegerTest04 {
    public static void main(String[] args) {
        //通过访问包装类的常量，来获取最大值和最小值
        System.out.println("int的最大值："+Integer.MAX_VALUE);
        System.out.println("int的最小值："+Integer.MIN_VALUE);
        System.out.println("byte的最大值："+Byte.MAX_VALUE);
        System.out.println("byte的最小值："+Byte.MIN_VALUE);
    }
}
```

##### IntegerTest05:

```java
package com.常用类.八种包装类.integer;
/*
好消息：在JDK1.5之后，支持自动拆箱和自动装箱了
    自动装箱：基本数据类型自动转换成包装类
    自动拆箱：包装类自动转换成基本数据类型

    有了自动拆箱之后，Number类种的方法就用不着了

    自动装箱和拆箱的好处：方便编程
 */
public class IntegerTest05 {
    public static void main(String[] args) {
        //自动装箱(int-->Integer)
        //Integer x = new Integer(100);不需要用了
        Integer x = 100;//底层等同于：Integer x = new Integer(100);
        System.out.println(x);

        //自动拆箱(Integer-->int)
        //int y = x.intValue();用不着了
        int y = x;
        System.out.println(y);

        //z是一个引用，z是一个变量，z还是保存了一个对象的内存地址
        Integer z = 999;
        //+两边要求是基本数据类型的数字，z是包装类，不属于基本数据类型，这里会进行自动拆箱，将z转换成基本数据类型
        System.out.println(z+1);

        Integer a = 1000;
        Integer b = 1000;
        //==比较的是对象的内存地址，a和b两个引用种保存的对象内存地址不同
        //==这个运算符不会触发自动拆箱机制，（只有+ - * /等运算的时候才会）
        System.out.println(a==b);//false
    }
}
```

##### IntegerTest06:

```java
package com.常用类.八种包装类.integer;

public class IntegerTest06 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a==b);//false
        /*
        java中为了提高程序的执行效率，将[-128~127]之间所有的包装类对象提前创建好了，
        放到了一个方法区的“整数型常量池”当中了，目的是只要用这个区间的数据不需要
        再new了(底层),直接从整数型常量池当中取出来

        原理：x变量中保存的对象的内存地址和y变量保存的对象的内存地址是一样的
         */
        Integer x = 127;
        Integer y = 127;
        System.out.println(x==y);//true
    }
}
```

![](C:\Users\86187\Desktop\Java\java截图\常用类截图\Integer的内存结构.png)

##### IntegerTest07:

```java
package com.常用类.八种包装类.integer;
/*
包装类常用方法：
(***)1、static int parseInt(String s)   静态方法，传参String,返回int
     2、static String toBinaryString(int i) 静态的，将十进制转换成二进制字符串
     3、static String toHexString(int i)    静态的，将十进制转换成十六进制字符串
     4、static String toOctalString(int i)  静态的，将十进制转换成八进制字符串
     5、static Integer valueOf(int i) 静态的：int-->Integer
     6、static Integer valueOf(String s)  静态的：String-->Integer
 */
public class IntegerTest07 {
    public static void main(String[] args) {
        //手动装箱
        Integer x = new Integer(1000);
        //手动拆箱
        int y = x.intValue();
        System.out.println(y);

        Integer a = new Integer("123");
        //编译的时候没问题，一切符合java语法，运行时会不会出现问题呢？
        //不是一个“数字”，可以包装成Integer吗？不能。运行时出现异常
        //java.lang.NumberFormatException
        /*Integer b = new Integer("中文");
        System.out.println(b);*/

        //重点方法；
        //static int parseInt(String s)
        //静态方法，传参String,返回int
        //应用场景：网页上文本框中输入的100实际上是"100"字符串。后台数据库中要求存储100数字，此时java程序需要将"100"转换成100
        int reValue = Integer.parseInt("123");//String-转换->int
        //int reValue = Integer.parseInt("中文");NumberFormatException数字格式化异常
        System.out.println(reValue+100);

        //照葫芦画瓢
        double reValue2 = Double.parseDouble("3.14");
        System.out.println(reValue2+1.21);

        //--------------------以下内容作为了解----------------------
        //static String toBinaryString(int i)
        //静态的，将十进制转换成二进制字符串
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString);//"11"二进制字符串

        //static String toHexString(int i)
        //静态的，将十进制转换成十六进制字符串
        //十六进制：1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12
        String hexString = Integer.toHexString(16);
        System.out.println(hexString);//10

        //static String toOctalString(int i)
        //静态的，将十进制转换成八进制字符串
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString);
        
        //valueOf方法作为了解
        //static Integer valueOf(int i) 静态的：int-->Integer
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        //static Integer valueOf(String s)  静态的：String-->Integer
        Integer i2 = Integer.valueOf("3.14");
        System.out.println(i2);
    }
}
```

##### IntegerTest08:

```java
package com.常用类.八种包装类.integer;
/*
String int Integer之间互相转换
 */
public class IntegerTest08 {
    public static void main(String[] args) {
        //String-->int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1+1);//101

        //int-->String
        String s2 = i1+"";//"100"字符串
        System.out.println(s2+1);//"1001"字符串
       /* String s2a = String.valueOf(i1);
        System.out.println(s2a);//"100"字符串*/

        //int-->Integer     自动装箱
        Integer x = 100;

        //Integer-->int     自动拆箱
        int y = x;

        //String-->Integer
        Integer integer = Integer.valueOf("123");
        //Integer-->String
        String s3 = String.valueOf(integer);
    }
}
```

![](C:\Users\86187\Desktop\Java\java截图\常用类截图\Integer、String、int三种类型之间的互相转换.png)

#### 4、日期相关类

##### DateTest01:

```java
package com.常用类.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
java中对日期的处理:
    1、怎么获取系统当前时间
    2、Date-->String 日期格式化为自己想要的类型
    3、String-->Date
 */
public class DateTest01 {
    public static void main(String[] args) throws Exception{
        //获取系统当前时间（精确到毫秒的系统当前时间）
        //直接调用无参构造方法就行
        Date nowTime = new Date();
        System.out.println(nowTime);//Mon Apr 19 16:54:17 CST 2021
        //System.out.println(nowTime.toString());toString()方法已经重写了

        //日期可以格式化吗？
        //将日期类型Date，按照指定的格式进行转换：Date--转换成具有一定格式的日期字符串-->String
        //SimpleDateFormat是java.text包下的。专门负责日期格式化的。
        /*
        yyyy    年(4位)
        MM      月(2位)
        dd      日
        HH      时
        mm      分
        ss      秒
        SSS     毫秒（毫秒3位，最高999，1000毫秒代表1秒）
        注意：在日期格式中，除了y,M,d,H,m,s,S这些字符不能随便写之外，剩下的符号格式自己随意组织。
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);//2021-04-19 17:07:00 199*/

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String nowTimeStr1 = sdf1.format(nowTime);
        System.out.println(nowTimeStr1);//19/04/2021

        SimpleDateFormat sdf2 = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        String nowTimeStr2 = sdf2.format(nowTime);
        System.out.println(nowTimeStr2);//21/04/19 17:10:54

        //假设现在有一个日期字符串String，怎么转换成Date类型？
        String time = "2008-08-08 08:08:08 888";
        //SimpleDateFormat sdf3 = new SimpleDateFormat("格式不能随便写，要和日期字符串格式相同");
        //注意：字符串的日期格式和SimpleDateFormat对象指定的日期格式要一致。不然会出现异常：java.text.ParseException
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:m:ss SSS");
        Date dateTime = sdf3.parse(time);
        System.out.println(dateTime);//Fri Aug 08 08:08:08 CST 2008
    }
}
```

##### DateTest02:

```java
package com.常用类.date;

import org.w3c.dom.ls.LSOutput;

/*
获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数
1秒 = 1000毫米
可以用来统计程序执行耗费的时间

简单总结以下System类的相关属性和方法：
    System.out  【out时System类的静态变量】
    System.out.println()    【println()方法不是System类的，是PrintStream类的方法】
    System.gc()     【建议启动垃圾回收器】
    System.currentTimeMills()   【取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数】
    System.exit(0)  【退出JVM】
 */
public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);//1618901107214

        //统计一个方法执行耗时
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长为："+(end-begin)+"毫秒");
    }

    //需求：统计一个方法执行所耗费的时长
    public static void print(){
        for (int i = 0; i < 100; i++) {
            System.out.println("i = "+i);
        }
    }
}
```

##### DateTest03:

```java
package com.常用类.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        //这个时间是什么时间？
        //1970-01-01 00:00:00 001
        //注意：带参数是1个毫秒，从1970-01-01 00:00:00 000开始加,不带参数获取当前系统时间
        Date time = new Date(1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        //北京是东8区，差8个小时
        System.out.println(strTime);//1970-01-01 08:00:00 001

        //获取昨天此时的时间
        Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String strTime2 = sdf.format(time2);
        System.out.println(strTime2);//2021-04-19 15:08:28 416

        //获取去年的今天的时间
    }
}
```



#### 5、数字相关类

##### DecimalFormatTest01:

```java
package com.常用类.数字相关类;

import java.text.DecimalFormat;

/*
关于数字的格式化
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //java.text.DecimalFormat专门负责数字格式化的一个类
        //DecimalFormat df = new DecimalFormat("数字格式");

        /*
        数字格式有哪些？
            #   代表任意数字
            ,   代表千分位
            .   代表小数点
            0   代表不够时补零

            ###,###.##  表示：加入千分位，保留2个小数
         */
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.5678);
        System.out.println(s);//"1,234.57"

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s2 = df2.format(1234.56);
        System.out.println(s2);//"1,234.5600
    }
}
```

##### BigDecimalTest01:

```java
package com.常用类.数字相关类;

import com.oop.demon07.B;

import java.math.BigDecimal;

/*
1、BigDecimal    属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
这是SUN公司提供的一个类，专门用于财务软件中

2、处理财务等精度需求很大的数据就需要使用BigDecimal类型，在java.math包下
 */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);//高精度的数据

        //v1+v2;不能直接使用+求和，v1和v2都是引用，需要调方法
       BigDecimal v3 = v1.add(v2);
        System.out.println(v3.toString());
    }
}
```

#### 6、Random

##### RandomTest01:

```java
package com.常用类.random;

import java.util.Random;

/*
随机数：
 */
public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        //随机产生一个int类型取值范围内的数字
        int num1 = random.nextInt();
        System.out.println(num1);

        //产生[0~100]之间的随机数。不包括101
        //nexInt翻译为：下一个int类型的数据是101，表示只能取到100
        int num2 = random.nextInt(101);
        System.out.println(num2);
    }
}
```

##### RandomTest02:

```java
package com.常用类.random;

import java.util.Arrays;
import java.util.Random;

/*
编写程序，生成5个不重复的随机数[0~100]，重复的话重新生成
最终生成的5个随机数放到数组中，要求数组中的这5个随机数不重复
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];//默认值为0，注意和随机生成的0区分开
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        //循环，生成随机数
        int index = 0;
        while (index < array.length){
            int num = random.nextInt(10);
            System.out.println("生成的随机数为："+num);
            if (!contains(array,num)) {
                array[index++] = num;
            }
        }
        Arrays.sort(array);
        //遍历数组
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("]");
    }

    /**
     * 单独编写一个方法，专门用来判断数组中是否包含某个元素
     * @param arr   数组
     * @param key   元素
     * @return  true表示包含，false表示不包含
     */

    public static boolean contains(int[] arr,int key){
       /*
       这种方法有bug(判断排序后交换位置使得数组默认取值-1被换到数组第一位，无法改变了)
        //对数组进行升序
        Arrays.sort(arr);
        //进行二分法查找，结果>=0表示找到
        return Arrays.binarySearch(arr, key) >= 0;
        */

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}
```

#### 7、Enum

##### EnumTest01:

```java
package com.常用类.枚举;//标识符，enum是关键字，不能做标识符
/*
采用枚举的方式改造程序:
总结：
    1、枚举是一种引用数据类型
    2、枚举类型怎么定义，语法是？
        enum 枚举类型名{
            枚举值1,枚举值2       //大写，以英文逗号分隔，不以英文;结尾
        }
    3、结果只有两种情况的，建议使用布尔类型
        结果超过两种，并且还是可以一枚一枚列举出来的，建议使用枚举类型
        列如：颜色，四季。星期等都可以使用枚举类型
 */
public class EnumTest01 {
    public static void main(String[] args) {
        Result r = divide(10,0);
        System.out.println(r==Result.SUCCESS?"计算成功":"计算失败");//计算失败
    }

    /**
     * 计算两个int类型数据的商
     * @param a int类型数据
     * @param b int类型数据
     * @return  Result.SUCCESS表示成功，Result.FAIL表示失败
     */
    public static Result divide(int a,int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}
//枚举：可以一枚一枚列举出来的，才建议使用枚举类型
//枚举编译之后也是生成class文件
//枚举也是一种引用数据类型，枚举中的每一个值可以看作是“常量”
enum Result{
    //SUCCESS和FAIL   都是枚举Result类型中的一个值
    SUCCESS,FAIL
}
```

##### EnumTest02:

```java
package com.常用类.枚举;

public class SwitchTest {
    public static void main(String[] args) {
        //switch语句支持枚举类型
        /*
        * 低版本的JDK，只支持int
        * 高版本的JDK，支持int、String、枚举。
        * byte short char也可以，存在自动类型转换*/
        switch (Season.AUTUMN) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
enum Season {
    SPRING,SUMMER,AUTUMN,WINTER
}
enum Color {
    RED,BLUE,GREEN,YELLOW
}
```