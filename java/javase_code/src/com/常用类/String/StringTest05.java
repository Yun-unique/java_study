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