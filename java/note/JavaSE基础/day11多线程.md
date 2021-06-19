# 多线程

## 1、概念

### 1、

#### 1、什么是进程？什么是线程？

进程是一个应用程序（1个进程是一个软件）。

线程是一个进程中的执行场景/执行单元。

一个进程可以启动多个线程。

#### 2、

对于java程序来说，当在Dos命令窗口中输入：

java HelloWorld 回车之后。

会先启动JVM，而JVM就是一个进程。

JVM再启动一个主线程调用main方法。

同时再启动一个垃圾回收线程负责看护，回收垃圾、

最起码，现在的java程序中至少有两个线程并发。

一个是垃圾回收线程，一个是执行main方法的主线程。

#### 3、进程和线程是什么关系？举个例子

> 阿里巴巴：进程

​		马云：阿里巴巴的一个线程

​		童文红：阿里巴巴的一个线程

---

> 京东：进程

​		强东：京东的一个线程

​		妹妹：京东的一个线程

进程可以看作是现实生活当中的公司

线程可以看作是公司当中的某个员工

---

> **注意**：

​	进程A和进程B的内存独立不共享。

​			魔兽游戏是一个进程

​			网易云音乐是一个进程

​			这两个进程是独立的，不共享资源。

​	线程A和线程B呢？

​				**在java语言中：线程A和线程B，堆内存和方法区内存共享，但是栈内存独立，一个线程一个栈。**

假设启动10个线程，就会有10个栈空间，每个栈和每个栈之间互不干扰，各自执行各自的，这就是多线程并发。

​	火车站：可以看作是一个进程

​	火车站中的每一个售票窗口可以看作是一个线程。

​	我在窗口1购票，你可以在窗口2购票，你不需要等我，我也不需要等你。

​	所以多线程并发可以提高效率

java中之所以有多线程机制，目的就是为了提高程序的处理效率。

#### 4、思考一个问题

使用了多线程机制之后，main方法结束，是不是有可能程序也不会结束。main方法结束只是主线程结束了，主栈空了，其它的栈（线程）可能还在压栈弹栈。

![](C:\Users\86187\Desktop\Java\java截图\多线程\多线程.png)

#### 5、分析一个问题：

对于单核的CPU来说，真的可以做到真正的多线程并发吗？

​	对于多核的CPU电脑来说，真正的多线程并发是没问题的。

​		4核CPU表示同一个时间节点上，可以真正的有四个进程并发执行。

​	什么是真正的多线程并发？

​		t1线程执行t1的。

​		t2线程执行t2的。

​		t1不会影响t2，t2也不会影响t1。这叫做真正的多线程并发。

单核的CPU表示只有一个大脑：

​	不能够做到真正的多线程并发，但是可以做到给人一种“多线程并发”的感觉。对于单核的CPU来说，在某一个时间点上实际上只能处理一件事，但是由于CPU处理速度极快，多个线程之间频繁的切换执行，给人的感觉是：多个事情同时在做！

### 2、

#### 1、java语言中，实现线程的两种方式

java支持多线程机制，并且java已经将多线程实现了，我们只需要继承就行了

第一种方式：编写一个类，直接继承java.lang.Thread,重写run方法

//定义线程类

```java
public class MyThread extends Thread{//重写run()方法}
```

```java
MyThread t = new MyThread();
t.start();
```

第二种方式：编写一个类，实现java.lang.Runnable接口，实现run()方法

```java
public class MyRunnable implements Runnable{//重写run()方法}
```

```java
Thread t = new Thread(new MyRunnable()); 
```

**注意：**第二种方式实现接口比较常用，因为一个类实现了接口，它还可以去继承其它的类，更灵活。

#### 2、==线程生命周期==

![](C:\Users\86187\Desktop\Java\java截图\多线程\线程生命周期.png)

![](C:\Users\86187\Desktop\Java\java截图\多线程\线程生命周期2.png)

==新建状态==、==就绪状态==、==运行状态==、==阻塞状态==、==死亡状态==

#### 3、线程调度概述

3.1、常见的线程调度模型有哪些？

* **抢占式调度模型**：

  哪个线程的优先级别比较高，抢到的CPU时间片的概率就高一些/多一些。

  java采用的就是抢占式调度模型

* **均分式调度模型**：

  平均分配CPU时间片，每个线程占有的CPU时间片时间长度一样，平均分配，一切平等。有一些编程语言，线程调度模型采用的是这种方式。

3.2、java中提供了哪些方法是和线程调度有关系的呢？

​	实例方法：

​		void setPriority(int newPriority)	设置线程的优先级

​		int getPriority()	获取线程优先级

​		最低优先级1，默认优先级是5，最高优先级10

​	静态方法：

​		static void yield()	让位方法

​		暂停当前正在执行的线程对象，并执行其他线程。

​		yield()方法不是阻塞方法，让当前线程让位，让给其它线程使用。

​		yield()方法的执行会让当前线程从“运行状态”回到“就绪状态”。

​		注意：在回到就绪之后，有可能还会再次抢到。

​	实例方法：

​		void join()	合并线程

#### 4、关于多线程并发环境下，数据的安全问题。（线程安全）

##### 4.1、为什么这个是==重点==？

​	以后在开发中，我们的项目都是运行在服务器当中，而服务器已经将线程的定义，

​	线程对象的创建，线程的启动等，都已经实现完了。这些代码我们都不需要编写。

​	最重要的是：你要知道，你编写的程序需要放到一个多线程的环境下运行，你更需要

​	关注的是这些数据在多线程并发的环境下是否是安全的（==重点==）

##### 4.2、什么时候数据在多线程并发的环境下会存在安全问题？

​	==**三个条件：**==

​		**条件1：多线程并发**

​		**条件2：有共享数据**

​		**条件3：共享数据有修改的行为**

​	满足以上三个条件之后就会存在线程安全问题

##### 4.3、怎么解决线程安全问题？

​	当多线程并发的环境下，有共享数据，并且这个数据还会被修改，此时就存在线程安全问题，怎么解决这个问题。

**线程排队执行（不能并发）。用排队执行解决线程安全问题，这种机制被称为：==线程同步机制==**

线程同步就是线程排队，线程排队了就会牺牲一部分效率，但这是必须的，因为数据的安全是第一位，只有数据安全了，我们才可以谈效率。

##### 4.4、线程同步设计的两个专业术语：

​	**异步编程模型**：

​		线程t1和线程t2，各自执行各自的，t1不管t2，t2不管t1，谁也不需要等谁，这种编程模型叫做：异步编程模型。其实就是：多线程并发（效率较高）

​	**同步编程模型**：

​		线程t1和线程t2，在线程t1执行的时候，必须等待t2线程执行结束，或者说在t2线程执行的时候，必须等待t1线程执行结束。两个线程之间发生了等待关系，这就是同步编程模型。（效率较低）

#### 5、==java中有三大变量==

* 实例变量：在堆中
* 静态变量：在方法区中
* 局部变量：在栈中

以上三大变量中：

​	局部变量永远都不会存在线程安全问题。因为局部变量不共享。（一个线程一个栈）

​	局部变量在栈中，所以局部变量永远都不会共享。

实例变量在堆中，堆只有1个。

静态变量在方法区中，方法区只有1个。

堆和方法区都是多线程共享的，所以有可能存在线程安全问题。

#### 6、synchronized总结

结合之前学习内容：

​	如果使用局部变量进行字符串拼接操作，建议使用StringBuilder，因为局部变量不存在线程安全问题。（StringBuffer线程安全的，效率低）

ArrayList是非线程安全的。

Vector是线程安全的

HashMap HashSet是非线程安全的。

Hashtable是线程安全的

synchronized有两种写法：

​	第一种：同步代码块

​	灵活

​		synchronized(线程共享对象){

​			同步代码块;

​		}

​	第二种：在实例方法上使用synchronized表示共享对象一定是this，并且同步代码块是整个方法体。

​	第三种：在静态方法上使用synchronized

​		**表示找类锁。类锁永远只有1把。就算创建了100个对象，类锁也只有1把**

#### 7、死锁

![](C:\Users\86187\Desktop\Java\java截图\多线程\死锁.png)

### 3、平时开发中如何解决线程安全问题

是不是一上来就选择线程同步吗？synchronized

​		不是，synchronized会让程序的执行效率变低，用户体验不好。系统的用户吞吐量降低。用户体验差。在不得已的情况下再选择线程同步机制。

**第一种方案：尽量使用局部变量代替“实例变量和静态变量”**

**第二种方案：如果必须是实例变量，那么可以考虑创建多个对象，这样实例变量的内存就不共享了。（一个线程对应一个对象，100个线程对应100个对象，对象不共享，就没有数据安全问题了。）**

**第三种方案：如果不能使用局部变量，对象也不能创建多个，这个时候就只能选择synchronized了。线程同步机制。**

### 4、线程的其它内容

#### 4.1、守护线程

Java语言中线程分为两大类：

​	一类是：用户线程

​	一类是：守护线程（后台线程）

​	其中具有代表性的就是：垃圾回收线程（守护线程）

守护线程的特点：

​	一般守护线程是一个死循环，所有的用户线程只要结束，守护线程就自动结束。

注意：主线程main方法是一个用户线程。

守护线程用在什么地方呢？

#### 4.2、定时器

定时器的作用：

​	间隔特定的时间，执行特定的程序。

​	如：每周要进行银行账户的总帐操作、每天要进行数据的备份操作等

在实际的开发中，每隔多久执行一段特定的代码，这种需求是很常见的，那么在java种其实可以采用多种方式实现：

​	可以使用sleep方法，睡眠，设置睡眠时间，每到这个时间点醒来，执行任务。这种方式是最原始的定时器。（比较low）

​	在java的类库中已经写好了一个定时器：java.util.Timer，可以直接拿来使用，不过这种方式在目前的开发中也很少用，因为现在很多高级框架都是支持定时任务的。

​	在实际的开发中，目前使用较多的是Spring框架中提供的SpringTask框架，这个框架只要进行简单的配置，就可以完成定时器的任务。

#### 4.3、实现线程的第三种方式：FutureTask方式，实现Callable接口（JDK8新特性）

这种方式实现的线程**可以获取线程的返回值**。之前讲的那两种方式是无法获取线程返回值的，因为run()方法返回void

思考：

​	系统委派一个线程去执行一个任务，该线程执行完任务之后，可能会有一个执行结果，我们怎么能拿到这个执行结果呢？

​	使用第三种方式：实现Callable接口方式。

#### 4.4、关于Object类中的wait和notify方法（生产者和消费者模式！）

第一：wait和notify方法不是线程对象的方法，是java中任何一个java对象都有的方法，因为这两个方式是Object类中自带的。

第二：wait()方法作用？

​	Object o = new Object();

​	o.wait();

​	表示：让正在o对象上活动的线程进入等待状态，无限期等待，直到被唤醒为止。

​	o.wait();方法的调用，会让“当前进程（正在o对象上活动的线程）”进入等待状态。

第三：notify()方法作用？

​	Object o = new Object();

​	o.notify();

表示可以让正在o对象上等待的线程唤醒，继续执行。

notifyAll();表示唤醒o对象上处于等待的所有线程。

![](C:\Users\86187\Desktop\Java\java截图\多线程\wait和notify.png)

#### 4.5、生产者和消费者：

![](C:\Users\86187\Desktop\Java\java截图\多线程\生产者和消费者.png)

## 2、代码

### ThreadTest01：

```java
package com.多线程;
/*
* 分析以下程序，有几个线程，除垃圾回收线程之外。有几个线程？
*   1个线程（因为程序只有一个栈）
main begin
m1 begin
m2 begin
m3 execute!
m2 over
m1 over
main over
*   一个栈中，自上而下的顺序依次逐行执行！
* */
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }
    public static void m1(){
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }
    public static void m2(){
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }
    public static void m3() {
        System.out.println("m3 execute!");
    }
}

```

### ThreadTest02:

```java
package com.多线程;
/*
* 实现线程的第一种方式：
*   编写一个类，直接继承java.lang.Thread，重写run方法
*
*   怎么创建线程对象？new一个
*   怎么启动线程？调用线程对象的start()方法
* */
public class ThreadTest02 {
    public static void main(String[] args) {
        //这里是main方法，这里的代码属于主栈，在主栈中运行
        //新建一个分支线程对象
        MyThread myThread = new MyThread();

        //myThread.run();//这样不会启动线程，不会分配新的分支栈。（这种方式就是单线程）

        //启动线程
        /*
        * start()方法的作用是：启动一个分支线程，在JVM中开辟一个新的栈空间，这段代码任务完成之后，瞬间就结束了。
        * 这段代码的任务只是为了开启一个新的栈空间，只要新的栈空间开出来，start()方法就结束了。线程就启动成功了。
        * 启动成功的线程会【自动】调用run()方法，并且run方法在分支栈的栈底部(压栈)
        * run()方法在分支栈的栈底部，main()方法在主栈的栈底部。run和main是平级。
        * */
        myThread.start();
        //这里的代码还是运行在主线程中
        for (int i = 0;i < 1000;i++){
            System.out.println("主线程-->"+i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        //编写程序，这段程序运行在分支线程中（分支栈）
        for (int i = 0;i < 1000;i++){
            System.out.println("分支线程-->"+i);
        }
    }
}
```

#### **线程的start()方法：**

![](C:\Users\86187\Desktop\Java\java截图\多线程\线程的start方法.png)

### ThreadTest03:

```java
package com.多线程;
/*
* 实现线程的第二种方式，编写一个类实现java.lang.Runnable接口，实现run()方法
* */
public class ThreadTest03 {
    public static void main(String[] args) {
        /*//创建一个可运行的对象
        MyRunnable runnable = new MyRunnable();
        //将可运行的对象封装程一个线程对象
        Thread thread = new Thread(runnable);*/
        //合并代码
        Thread thread = new Thread(new MyRunnable());
        //启动线程
        thread.start();
        for (int i = 0;i < 1000;i++){
            System.out.println("主线程-->"+i);
        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 1000;i++){
            System.out.println("分支线程-->"+i);
        }
    }
}

```

### ThreadTest04:

```java
package com.多线程;
/*
* 采用匿名内部类的方式
*   new ([匿名类] implements) Runnable{
*           @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    System.out.println("t线程-->"+i);
                }
            }}
* */
public class ThreadTest04 {
    public static void main(String[] args) {
        //创建线程对象，采用匿名内部类的方式
        //这是通过一个没有名字的类，new出来的对象
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    System.out.println("t线程-->"+i);
                }
            }
        });
        //启动线程
        thread.start();
        for (int i = 0;i < 100;i++){
            System.out.println("main线程-->"+i);
        }
    }
}
```

### ThreadTest05:

```java
package com.多线程;
/*
* 1、怎么获取当前线程对象？
*
* 2、获取线程对象的名字
*       String name = 线程对象.getName();
*
* 3、修改线程对象的名字
*       线程对象.setName("线程名字");
* 4、当线程没有设置名字的时候，默认的名字有什么规律
*       Thread-0
*       Thread-1
*       Thread-2
*       ......
* */
public class ThreadTest05 {
    public static void main(String[] args) {
        //currentThread就是当前线程对象
        //这个代码出现在main方法当中，所以当前线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());//main

        //创建线程对象
        MyThread myThread = new MyThread();
        //设置线程的名字
        myThread.setName("java");
        //获取线程的名字
        String myThreadName = myThread.getName();
        System.out.println(myThreadName);//没有设置名字默认Thread-0

        MyThread myThread1 = new MyThread();
        String myThreadName1 = myThread1.getName();
        System.out.println(myThreadName1);//T没有设置名字默认Thread-1
        //启动线程
        myThread.start();
        for (int i = 0; i < 100;i++){
            System.out.println(currentThread.getName()+"线程-->"+i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            //currentThread就是当前线程对象。
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName()+"线程-->"+i);
        }
    }
}
```

### ThreadTest06:

```java
package com.多线程.线程sleep方法;
/*
* 关于线程的sleep方法：
*   static void sleep(long millis)
*   1、静态方法：Thread.sleep(1000);
*   2、参数是毫秒
*   3、作用：让当前线程进入休眠，进入“阻塞状态”，放弃占有CPU时间片，让给其它线程
*           使用。这行代码出现在A线程中，A线程就会进入休眠。
*           这行代码出现在B线程中，B线程就会进入休眠。
*   4、Thread.sleep()方法，可以做到这种效果：
*         间隔特定的时间，去执行一段特定的代码，每隔多久执行一次。
*
* */
public class ThreadTest06 {
    public static void main(String[] args) {
        //让当前线程进入休眠，睡眠5秒
        //当前线程是主线程
        /*try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //5秒之后执行这里的代码
        //System.out.println("hello world!");


        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            //睡一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

### ThreadTest07:

```java
package com.多线程.线程sleep方法;
/*
* 关于Thread.sleep()方法的一个面试题：
* */
public class ThreadTest07 {
    public static void main(String[] args) {
        //创建线程对象
        Thread mt = new MyThread();//多态：父类型引用指向子类型对象
        mt.setName("t");
        mt.start();
        //调用sleep方法
        try {
            //问题：这行代码会让线程t进入休眠状态吗？
            mt.sleep(1000*5);//在执行的时候还是会转换成：Thread.sleep(1000*5);
            //这行代码的作用是：让当前线程进入休眠，也就是说main线程进入休眠
            //这行代码出现在main方法中，main线程睡眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5秒之后这里才会执行
        System.out.println("hello");
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
```

### ThreadTest08:

```java
package com.多线程.线程sleep方法;
/*
* 终止线程睡眠：唤醒线程
*   注意：这个不是终断线程的执行，而是终断线程的睡眠
* */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.setName("T");
        t.start();

        //希望5秒之后，t线程醒来
        try {
            Thread.sleep(1000 *5 );//当前主线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终断t线程的睡眠（这种终断睡眠的方式依靠了java的异常处理机制）
        t.interrupt();
    }
}
class MyRunnable implements Runnable{

    //重点：run()方法当中的异常不能throws，只能try catch
    //因为run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->begin");
        //睡眠1年
        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //1年之后才会执行这里
        System.out.println(Thread.currentThread().getName()+"-->end");
    }
}
```

### ThreadTest09:

```java
package com.多线程.线程终止;
/*
*在java中怎么强行终止一个线程的执行。
*   这种方式存在很大的缺点：容易丢失数据。因为这种方式是直接将线程杀死了，
*   线程没有保存的数据将会丢失，不建议使用。
* */
public class ThreadTest09 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable1());
        t.setName("T");
        t.start();
        //模拟5秒
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5秒之后强行终止t线程
        t.stop();//已过时（不建议使用）
    }
}
class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        //循环结束10秒
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

### ThreadTest10:

```java
package com.多线程.线程终止;
/*
* 怎么合理的终止一个线程的执行。这种方式是很常用的。
* */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable2 mr = new MyRunnable2();
        Thread thread = new Thread(mr);
        thread.setName("T");
        thread.start();
        //模拟5秒
        try {
            thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        mr.run = false;
    }
}
class MyRunnable2 implements Runnable{

    //打一个布尔标记
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName()+"-->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //终止当前线程
                return;
            }
        }
    }
}
```

### ThreadTest11:

```java
package com.多线程.线程调度;
/*
* 了解：关于线程的优先级
*   最高优先级：10
*   最低优先级：1
*   默认优先级：5
* */
public class ThreadTest11 {
    public static void main(String[] args) {
        //设置主线程的优先级为1
        Thread.currentThread().setPriority(1);

       /* System.out.println("最高优先级："+Thread.MAX_PRIORITY);//10
        System.out.println("最低优先级："+Thread.MIN_PRIORITY);//1
        System.out.println("默认优先级："+Thread.NORM_PRIORITY);//5*/

       //获取当前线程对象
        //Thread currentThread = Thread.currentThread();
        //获取当前线程的优先级,main线程的默认优先级是：5
        //System.out.println(currentThread.getName()+"线程的默认优先级是："+currentThread.getPriority());

        Thread thread = new Thread(new MyRunnable());
        thread.setName("T");
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        //获取线程优先级
        //System.out.println(Thread.currentThread().getName()+"线程的默认优先级是："+Thread.currentThread().getPriority());
        //设置分支线程的优先级190
        Thread.currentThread().setPriority(10);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
```

### ThreadTest12:

```java
package com.多线程.线程调度;
/*
* 让位，当前线程暂停，让给其他线程。
* 静态方法：Thread.yield();
* */
public class ThreadTest12 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("T");
        t.start();
        for (int i = 0; i <= 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            //每100个让位一次
            if (i % 100 == 0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
```

### ThreadTest13:

```java
package com.多线程.线程调度;
/*
* 线程合并
* */
public class ThreadTest13 {
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread t = new Thread(new MyRunnable3());
        t.setName("T");
        t.start();
        //合并线程
        try {
            t.join();//t合并到当前线程中，当前线程受阻塞，t线程执行直到结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
```

### 线程安全：

#### 不使用线程同步机制：

##### Account.java

```java
package com.多线程.f线程安全.线程安全_不使用线程同步机制;
/*
* 银行账户
*   不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题
* */
public class Account {
    //账号
    private String actno;
    //余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    public void withdraw(double money){
        //t1和t2并发执行这个方法。（t1和t2是两个栈，两个栈操作堆中同一个对象）
        //取款之前的余额
        double balance = this.getBalance();

        //在这里模拟以下网络延迟，100%出问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //取款之后的余额
        //更新余额
        //思考：t1执行到这里，但还没有来得及执行这行代码，t2线程进来执行withdraw方法了。此时一定出现问题。
        this.setBalance(balance-money);
    }
}
```

##### AccountThread.java

```java
package com.多线程.f线程安全.线程安全_使用线程同步机制;

public class AccountThread extends Thread{
    //两个线程必须共享同一个账户对象
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        //run方法的执行表示取款操作
        //假设取款5000
        double money = 5000;
        //取款
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"对"+act.getActno()+"取款"+money+"成功，余额："+act.getBalance());
    }
}
```

##### Test.java

```java
package com.多线程.f线程安全.线程安全_使用线程同步机制;

public class Test {
    public static void main(String[] args) {
        //创建账户对象(只能创建一个)
        Account act = new Account("act-001",10000);
        //创建两个线程
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        //设置name
        t1.setName("t1");
        t2.setName("t2");
        //启动线程取款
        t1.start();
        t2.start();
    }
}
```

#### 使用线程同步机制：

##### Account.java

```java
package com.多线程.f线程安全.线程安全_使用线程同步机制;
/*
* 银行账户
*   不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题
* */
public class Account {
    //账号
    private String actno;
    //余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    public void withdraw(double money){
        //以下这几行代码必须是线程同步（排队）的，不能并发。
        //一个线程把这里的代码全部执行结束之后，另一个线程才能进来
        /*
        线程同步机制的语法是：
            synchronized(){
                //线程同步代码块
            }
            synchronized后面小括号中传的这个“数据”是相当关键的，这个数据必须
            是多线程共享的数据。才能达到多线程排队。
            ()中写什么？
                那要看你想让哪些线程同步。
                假设t1,t2,t3,t4,t5有5个线程
                你只希望t1,t2,t3排队，t4，t5不需要排队。怎么办？
                你一定要在()中写一个t1,t2,t3共享的对象，而这个对象对于t4,t5
                来说不是共享的。

         这里的共享对象是：账户对象
         */
        synchronized (this){
            double balance = this.getBalance();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(balance-money);
        }
    }
}
```

##### AccountThread.java

```java
package com.多线程.f线程安全.线程安全_使用线程同步机制;

public class AccountThread extends Thread{
    //两个线程必须共享同一个账户对象
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        //run方法的执行表示取款操作
        //假设取款5000
        double money = 5000;
        //取款
        act.withdraw(money);

        /*synchronized (act){//这种方式也可以，只不过扩大了同步的范围，效率更低了
            act.withdraw(money);
        }*/

        System.out.println(Thread.currentThread().getName()+"对"+act.getActno()+"取款"+money+"成功，余额："+act.getBalance());
    }
}
```

##### Test.java

```java
package com.多线程.f线程安全.线程安全_使用线程同步机制;

public class Test {
    public static void main(String[] args) {
        //创建账户对象(只能创建一个)
        Account act = new Account("act-001",10000);
        //创建两个线程
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        //设置name
        t1.setName("t1");
        t2.setName("t2");
        //启动线程取款
        t1.start();
        t2.start();
    }
}
```

### ThreadTest14:

```java
package com.多线程.h守护线程;
/*
* 守护线程
*   调用setDaemon(true)方法
* */
public class ThreadTest14 {
    public static void main(String[] args) {
        Thread t = new BakDataThread();
        t.setName("备份数据的线程");

        //启动线程之前，将线程设置为守护线程
        t.setDaemon(true);

        t.start();

        //主线程：主线程是用户线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class BakDataThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        //即使是死循环，但由于该线程设置为守护线程，当用户线程结束，守护线程自动终止。
        while (true){
            System.out.println(Thread.currentThread().getName()+"-->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

### ThreadTest15:

```java
package com.多线程.a创建线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
* 实现线程的第三种方式：
*   实现Callable接口
*   优点：可以拿到线程的返回结果
*   缺点：在获取线程的执行结果的时候（调用get方法），当前线程受阻塞，效率比较低。
* */
public class ThreadTest15 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一步：创建一个“未来任务类”对象
        //参数非常重要，需要给一个Callable接口的实现对象。
        //匿名内部类
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call()方法就相当于run()方法。只不过这个有返回值。
                //线程执行一个任务，执行之后可能会有一个执行结果
                //模拟执行
                System.out.println("call method begin");
                Thread.sleep(1000 * 10);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;//自动装箱（300结果变成Integer类型）
            }
        });

        //创建线程对象
        Thread t = new Thread(task);
        t.setName("t");
        //启动线程
        t.start();

        //这里是main方法，这是在主线程中。
        //在主线程中，怎么获取t线程的返回结果呢？
        //get()方法的执行会导致“当前线程阻塞”
        Object object = task.get();
        System.out.println("线程执行的结果："+object);

    }
}
```

### ThreadTest16:

```java
package com.多线程.j生产者和消费者;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
* 1、使用wait方法和notify方法实现“生产者和消费者模式”
* 2、什么是“生产者和消费者模式”？
*       生产线程负责生产，消费线程负责消费。
*       生产线程和消费线程要达到均衡。
*       这是一种特殊的业务需求，在这种特殊的情况下需要使用wait方法和notify方法。
* 3、wait和notify方法不是线程对象的方法，是普通java对象都有的方法（继承于Object类）
* 4、wait和notify放法建立在线程同步的基础之上，因为多线程要同时操作同一个仓库（线程）。
*   有线程安全问题。
* 5、wait方法作用：o.wait();让正在o对象上活动的线程t进入等待状态，并且释放掉t线程之前占有的o对象的锁。
* 6、notify方法作用：o.notify();让正在o对象上等待的线程被唤醒，只是通知，不会释放o对象上之前占有的锁
*
* 7、模拟这样一个需求：
*       仓库我们采用list集合。
*       list集合中假设只能存储一个元素。
*       假设list集合中元素个数是0，表示仓库空了。
*       保证list集合中永远都是最多存储1个元素。
*       就需要做到这种效果：生产一个消费一个均衡。
* */
public class ThreadTest16 {
    public static void main(String[] args) {
        //创建一个仓库对象，共享的。
        List list = new ArrayList();
        //创建两个线程对象
        //生产者线程
        Thread t1 = new Thread(new Producer(list));
        //消费者线程
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");

        t1.start();
        t2.start();
    }
}
//生产线程
class Producer implements Runnable{
    //仓库,共享对象
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直生产
        while (true){
            synchronized (list) {
                //给仓库对象list加锁
                if (list.size() > 0) {//大于0，表示仓库种已经有1个元素了
                    //当前线程进入等待状态，并且释放Producer之前占有的list集合的锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到这里说明仓库是空的，需要生产
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"-->"+obj);
                //唤醒消费者进行消费
                list.notifyAll();
            }
        }
    }
}
//消费线程
class Consumer implements Runnable{
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直消费
        while (true){
            synchronized (list){
                if (list.size() == 0){
                    try {
                        //仓库空了，消费者线程等待，释放list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到此，说明仓库中有元素，需要进行消费
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName()+"-->"+obj);
                //唤醒生产者生产
                list.notifyAll();
            }
        }
    }
}
```



