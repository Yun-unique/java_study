# 注解

## 1、概述

### 1、

注解，或者叫做注释，英文单词是：Annotation

### 2、

注解Annotation是一种引用数据类型，编译之后也是生成xxx.class文件

### 3、

怎么自定义注解呢？语法格式？

​	[修饰符列表] @interface 注解类型名{

​	} 

### 4、

注解怎么使用，用在什么地方？

​	第一：注解使用时的语法格式是：

​				@注解类型名

​	第二：注解可以出现在类上、属性上、方法上、变量上等。。。

​	注解还可以出现在注解类型上（默认情况下，注解可以出现在任意位置）

### 5、

JDK内置了哪些注解呢？

java.lang包下的注释类型：

| **[Deprecated](../../java/lang/Deprecated.html)**            | 用 @Deprecated 注释的程序元素，不鼓励程序员使用这样的元素，通常是因为它很危险或存在更好的选择。 |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **[Override](../../java/lang/Override.html)**                | 表示一个方法声明打算重写超类中的另一个方法声明。             |
| **[SuppressWarnings](../../java/lang/SuppressWarnings.html)** | 指示应该在注释元素（以及包含在该注释元素中的所有程序元素）中取消显示指定的编译器警告。 |

### 6、

什么是元注解？

用来标注“注解类型”的“注解”，称为元注解

常见的元注解有哪些？

​	Target

​	Retention

关于Target注解：

​	这是一个元注解，用来标注“注解类型”的“注解”

​	这个Target注解用来标注“被标注的注解”可以出现在哪些位置上。

```java
@Target({ElementType.METHOD})//表示“被标注的注解”只能出现在方法上
```

关于Retention注解：

​	这是一个元注解，用来标注“注解类型”的“注解”

​	这个Retention注解用来标注“被标注的注解”最终保存在哪里。

```java
@Retention(RetentionPolicy.SOURCE)//表示该注解只被保留在java源文件中
@Retention(RetentionPolicy.CLASS)//表示该注解只被保留在class文件中
```

### 7、注解在开发中有什么用呢？

需求：

​	假设有这样一个注解，叫做：@Id

​	这个注解只能出现在类上面，当这个类上有这个注解的时候，

​	要求这个类中必须有一个int类型的id属性。如果没有这个属性，就报异常。

​	如果有这个属性则正常执行！

## 2、代码

### Annotation1:

#### AnnotationTest01:

```java
package com.注解.Annotation1;
/*
* 1、注解，或者叫做注释类型，英文单词是：Annotation
* 2、注解Annotation是一种引用数据类型。编译之后也是生成xxx.class文件
* 3、怎么自定义注释呢？语法格式？
*   [修饰符列表] @interface 注解类型名{
*   }
* 4、默认情况下，注解可以出现在任意位置
* */
@MyAnnotation
public class AnnotationTest01 {

    @MyAnnotation
    private int no;

    @MyAnnotation
    public AnnotationTest01() {
    }

    @MyAnnotation
    public static void m1(){
        @MyAnnotation
        int i = 100;
    }

    @MyAnnotation
    public void m2(@MyAnnotation String name,@MyAnnotation int k){
    }
}
@MyAnnotation
interface MyInterface{
}
@MyAnnotation
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
//注解修饰注解
@MyAnnotation
@interface OtherAnnotation{
}
```

#### AnnotationTest02:

```java
package com.注解.Annotation1;
/*
* 关于JDK lang包下的Override注解
* 源代码：
*   public @interface Override{
*   }
*
* @Override这个注解只能注解方法
* @Override这个注解是给编译器参考的，和运行阶段没有关系
* 凡是java中的方法带有这个注解的，编译器都会进行编译检查，如果这个方法不是重写父类的方法，编译器报错。
* */
public class AnnotationTest02 {
    @Override
    public String toString() {
        return "toString";
    }
}
```

#### AnnotationTest03:

```java
package com.注解.Annotation1;
//表示这个类已过时
//这个注解主要是向其它程序员传达一个信息，告知已过时，有更好的解决方案存在。
@Deprecated
public class AnnotationTest03 {
    @Deprecated
    public void doSome(){
        System.out.println("do something");
    }
    public void doOther(){
        System.out.println("do other...");
    }
}
class T{
    public static void main(String[] args) {
        AnnotationTest03 at = new AnnotationTest03();
        at.doSome();
        at.doOther();
    }
}
```

#### MyAnnotation:

```java
package com.注解.Annotation1;
/*
* 自定义注解：
* */
public @interface MyAnnotation {
    //？？？
}
```

### Annotation2:

#### MyAnnotation:

```java
package com.注解.Annotation2;
/*
* 自定义注解
* */
public @interface MyAnnotation {
    /**
     * 我们通常在注解当中可以定义属性，以下这个是MyAnnotation的name属性。
     * 看着像一个方法，但实际上我们称之为属性name。
     * @return
     */
    String name();

    String color();

    //给属性指定默认值
    int age() default 25;
}
```

#### MyAnnotationTest:

```java
package com.注解.Annotation2;

public class MyAnnotationTest {
    //报错的原因：如果一个注解当中有属性，那么必须给属性赋值（除非该属性使用default指定了默认值）
    /*@MyAnnotation
    public void doSome(){

    }*/

    //@MyAnnotation(属性名 = 属性值)
    //指定name属性的值就好了。
    @MyAnnotation(name = "张三",color = "红色")
    public void doSome(){}
}
```

### Annotation3:

#### MyAnnotation:

```java
package com.注解.Annotation3;

public @interface MyAnnotation {
    //指定一个value属性
    String value();
}
```

#### AnnotationTest:

```java
package com.注解.Annotation3;
//如果一个注解的属性名字是value，并且只有一个属性的话，在使用的时候，该属性名可以省略
public class MyAnnotationTest {
    /*@MyAnnotation
    public void doSome(){}*/
    @MyAnnotation(value = "123")
    public void doSome(){}

    @MyAnnotation("123")
    public void doOther(){}
}
```

#### OtherAnnotation:

```java
package com.注解.Annotation3;

public @interface OtherAnnotation {
    String name();
}
```

#### OtherAnnotationTest:

```java
package com.注解.Annotation3;

public class OtherAnnotationTest {
    @OtherAnnotation(name = "test")
    public void doSome(){}

    //@OtherAnnotation("test")
    public void doOther(){}
}
```

### Annotation4:

#### MyAnnotation:

```java
package com.注解.Annotation4;

public @interface MyAnnotation {
    /*
    * 注解当中的属性可以是哪种类型？
    *   属性的类型可以是：
    *       byte short int long float double boolean char
    *       以及以上每一种的数组形式
    * */
    int value();
    String value2();
    int[] value3();
    String[] value4();
    Season value5();
    Season[] value6();
    Class parameterType();
    Class[] parameterTypes();
}
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
```

#### OtherAnnotation:

```java
package com.注解.Annotation4;

public @interface OtherAnnotation {
    int age();
    String[] email();
    Season[] season();
}
```

#### OtherAnnotationTest:

```java
package com.注解.Annotation4;

public class OtherAnnotationTest {
    //数组是大括号
    @OtherAnnotation(age = 25,email = {"zhangsan@123","zhangsan@sohu.com"},season = {Season.SPRING})
    public void doSome(){}

    //如果数组中只有1个元素，大括号可以省略
    @OtherAnnotation(age = 25,email = "zhangsan@123.com",season = {Season.SPRING,Season.SUMMER,Season.AUTUMN,Season.WINTER})
    public void doOther(){}
}
```

### Annotation5:

#### MyAnnotation:

```java
package com.注解.Annotation5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//只允许该注解可以标注类，方法
@Target({ElementType.METHOD,ElementType.TYPE})
//希望这个注解可以被反射
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "北京大兴区";
}
```

#### MyAnnotationTest:

```java
package com.注解.Annotation5;
@MyAnnotation("上海浦东区")
public class MyAnnotationTest {
    //@MyAnnotation //该注解定义只能注解类和方法
    int i;
    //@MyAnnotation //该注解不能注解Constructor
    public MyAnnotationTest() {
    }
    @MyAnnotation
    public void doSome(){
        //@MyAnnotation //该注解不能注解局部变量
        int j;
    }
}
```

#### ReflectAnnotationTest:

```java
package com.注解.Annotation5;

import java.lang.annotation.Annotation;

/*
* 反射注解
* */
public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception{
        //获取这个类
        Class c = Class.forName("com.注解.Annotation5.MyAnnotationTest");
        //判断类上面是否有@MyAnnotation
        //System.out.println(c.isAnnotationPresent(MyAnnotation.class));
        if (c.isAnnotationPresent(MyAnnotation.class)){
            //获取该注解对象
            MyAnnotation myAnnotation = (MyAnnotation)c.getAnnotation(MyAnnotation.class);
            System.out.println("类上面的注解对象："+myAnnotation);
            //获取注解对象的属性？和调接口没区别
            String value = myAnnotation.value();
            System.out.println(value);
        }

        //判断String类上面是否存在这个注解
        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation.class));
    }
}
```

### Annotation6:

#### MyAnnotation:

```java
package com.注解.Annotation6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    //username属性
    String username();

    //password属性
    String password();
}
```

#### MyAnnotationTest:

```java
package com.注解.Annotation6;

import java.lang.reflect.Method;

//通过反射获取注解对象的属性值
public class MyAnnotationTest {

    @MyAnnotation(username = "admin",password = "123")
    public void doSome(){}

    public static void main(String[] args) throws Exception{
        //获取MyAnnotationTest的doSome()方法上面的注解信息
        //首先获取这个方法所在的类
        Class c = Class.forName("com.注解.Annotation6.MyAnnotationTest");
        //获取doSome()方法
        Method doSome = c.getDeclaredMethod("doSome");
        //判断该方法上是否存在这个注解
        if (doSome.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = doSome.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.username());
            System.out.println(myAnnotation.password());
        }
    }
}
```

### Annotation7:

#### Id：

```java
package com.注解.Annotation7;
/*
需求：
​	假设有这样一个注解，叫做：@Id
​	这个注解只能出现在类上面，当这个类上有这个注解的时候，
​	要求这个类中必须有一个int类型的id属性。如果没有这个属性，就报异常。
​	如果有这个属性则正常执行！
*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//表示这个注解只能出现在类上面
@Target(ElementType.TYPE)
//该注解可以被反射机制读取到
@Retention(RetentionPolicy.RUNTIME)
public @interface Id {
}
```

#### User:

```java
package com.注解.Annotation7;
@Id
public class User {
    int id;
    String name;
    String password;
}
```

#### HasNotIdPropertyException:

```java
package com.注解.Annotation7;
/*
 * 自定义异常
 * */
public class HasNotIdPropertyException extends RuntimeException{
    public HasNotIdPropertyException() {
    }

    public HasNotIdPropertyException(String message) {
        super(message);
    }
}
```

#### Test:

```java
package com.注解.Annotation7;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception{
        //获取类
        Class c = Class.forName("com.注解.Annotation7.User");
        //判断这个类上面是否存在Id注解
        if (c.isAnnotationPresent(Id.class)){
            //当一个类上面有@Id注解的时候，要求类中必须存在int类型的id属性
            //如果没有int类型的id属性则报异常
            //获取类的属性
            Field[] fields = c.getDeclaredFields();
            boolean isRight = false;//给一个默认的标记
            for (Field field:fields){
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())) {
                    //表示这个类是合法的类，有@Id注解，则这个类中必须存在int类型的id
                    isRight = true;//表示合法
                    break;
                }
            }
            //判断是否合法
            if (!isRight) {
                throw new HasNotIdPropertyException("被@Id注解标注的类中必须要有一个int类型的id属性");
            }
        }
    }
}
```

