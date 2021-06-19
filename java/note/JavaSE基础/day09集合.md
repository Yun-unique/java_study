### 集合：

#### 1、集合概述：

##### 1.1、什么是集合？集合有什么用？

​	数组其实就是一个集合。集合实际上就是一个容器。可以用来容纳其它类型的数据。

​	集合为什么说在开发中使用较多？

​	集合是一个容器，是一个载体，可以一次容纳多个对象。在实际开发中，假设连接数据库，数据库当中有10条数据记录，那么假设把这10条记录查询出来，在java程序中会将10条数据封装成10个java对象，然后将10个java对象放到某一个集合当中，将集合传到前端，然后遍历集合，将一个数据一个数据展现出来。

##### 1.2

集合不能直接存储基本数据类型，另外集合也不能直接存储java对象，集合当中存储的都是java对象的==内存地址==。（或者说集合中存储的是==引用==）

```java
list.add(100);//自动装箱Integer
```

注意：

​	集合在java中本身是一个容器，是一个==对象==。集合中任何时候存储的都是”引用“。

##### 1.3

在java中每一个不同的集合，底层会对应不同的数据结构。往不同的集合中存储元素，等于将数据放到了不同的数据结构当中。什么是数据结构？数据存储的结构就是数据结构。不同的数据结构，数据存储方式不同。例如：数组、二叉树、链表、哈希表...等常见的数据结构。

java中已经将数据结构实现了，已经写好了这些常用的集合类，我们只需要掌握怎么用，在什么情况下选择哪一种合适的集合去使用即可。

```java
new ArrayList();	//创建一个集合，底层是数组
new LinkedList();	//创建一个集合对象，底层是链表
new TreeSet();		//创建一个集合对象，底层是二叉树
```



##### 1.4

集合在java JDK中的哪个包下？

​	java.util.*;

​		所有的集合类和集合接口都在java.util包下

##### 1.5、集合的继承结构图：

![](C:\Users\86187\Desktop\Java\java截图\集合截图\集合的继承结构图.png)

![](C:\Users\86187\Desktop\Java\java截图\集合截图\集合的继承结构图2.png)

![](C:\Users\86187\Desktop\Java\java截图\集合截图\集合的继承结构图3.png)

**总结：**

* ArrayList:底层是数组

* LinkedList：底层是双向链表

* Vector：底层是数组，线程安全的（synchronized修饰）,效率较低，使用较少

* HashSet：底层是HashMap，放到HashSet集合中的元素等同于放到HashMap集合key部分了

* TreeSet：底层是TreeMap，放到TreeSet集合中的元素等同于放到TreeMap集合key部分了

* HashMap：底层是哈希表数据结构，是非线程安全的。初始化容量为16，默认加载因子为0.75。key值和value值可以为null。在JDK8之后，如果哈希表单向链表中元素超过8个，单向链表这种数据结构会变成红黑树数据结构。当红黑树上的节点数量小于6时，会重新把红黑树变成单向链表结构。这种方式也是为了提高检索效率，二叉树的检索会再次缩小扫描范围，提高效率。

* Hashtable：底层也是哈希表，只不过线程安全的，效率较低，使用较少。key和value值都不能为null。初始化容量为11，默认加载因子为0.75f，扩容：原容量*2+1。
* Properties:是线程安全的，并且key和value只能存储字符串String
* TreeMap：底层是二叉树。TreeMap集合的key可以按照大小顺序排序

**List集合存储元素的特点：**

​	有序可重复

​	有序：存进去的顺序和取出的顺序相同，每一个元素都有下标

​	可重复：存进去1，可以再存储1

**Set（对应Map）集合存储元素的特点：**

​	无序不可重复

​	无序：存进去的顺序和取出的顺序不一定相同。另外Set集合中元素没有下标

​	不可重复：存进去1，不能再存储1

**SortedSet（对应SortedMap）集合存储元素的特点：**

​	首先是无序不可重复的，但是SortedSet集合中的元素是可排序的。

​	可排序：可以按照大小顺序排列

##### 1.6

在java中集合分为两大类：

​	一类是单个方式存储元素：

​		单个方式存储元素，这一类集合中超级父接口：java.util.Collection;

​	一类是以键值对的方式存储元素:

​		以键值对的方式存储元素，这一类集合中超级父接口:java.util.Map;



#### 2、代码测试：

##### **CollectionTest01:**

```java
package com.集合;

import com.oop.demon08.Student;

import java.util.ArrayList;
import java.util.Collection;

/*
关于java.util.Collection接口中常用的方法.
    1、Collection中能存放什么元素？
        没有使用“泛型”之前，Collection中可以存储Object的所有字类型
        使用了“泛型”之后，Collection中只能存储某个具体的类型
        （集合中不能直接存储基本数据类型，也不能存java对象，只是存储java对象的内存地址）
    2、Collection中的常用方法
        boolean add(Object e)   向集合中添加元素
        int size()  获取集合中元素的个数
        void clear()    清空集合
        boolean contains(Object o)  判断当前集合中是否包含元素o，包含返回true，否则返回false
        boolean remove(Object o)    从该集合中删除指定元素的单个实例（如果存在）。
        boolean isEmpty()   判断该集合中元素个数是否为0，为0返回true，否则返回false
        Object[] toArray()  返回一个包含此集合中所有元素的数组。
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection c = new Collection();//接口是抽象的,无法实例化

        //多态
        Collection c = new ArrayList();
        //测试Collection接口中的常用方法
        //1、向集合添加元素 boolean add(Object e)
        c.add(1200);//自动装箱，实际上是放进去了一个对象的内存地址。Integer x = new Integer(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(new Student());
        c.add(true);//自动装箱

        //2、获取集合中元素的个数 int size()
        System.out.println("集合中元素的个数是："+c.size());//5

        //3、清空集合 void clear()
        c.clear();
        System.out.println("集合中元素的个数是："+c.size());

        //再向集合中添加元素
        c.add("hello");
        c.add("world");
        c.add("绿巨人");
        c.add("钢铁侠");

        //4、判断集合中是否有某一元素 boolean contains(Object o)
        boolean flag = c.contains("绿巨人");
        System.out.println(flag?"包含":"不包含");

        //5、删除集合中的某个元素
        //c.remove("蜘蛛侠");
        c.remove("绿巨人");
        System.out.println("集合中的元素个数为"+c.size());

        //6、判断集合是否为空 boolean   isEmpty()
        System.out.println(c.isEmpty());//false
        c.clear();
        System.out.println(c.isEmpty());//true

        //7、将集合中的元素用数组形式输出 Object[] toArray()
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add("HelloWorld");
        Object[] toArray = c.toArray();
        for (int i = 0; i < toArray.length; i++) {
            //System.out.println(toArray[i]);
            Object o = toArray[i];
            System.out.println(o);
        }
    }
}
```

##### **CollectionTest02:**

```java
package com.集合;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
关于集合遍历/迭代专题(重点)
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        //注意：以下讲解的遍历方式/迭代方式，是所有Collection通用的一种方式
        //在Map集合中不能用，在所有的Collection以及子类中使用
        //创建集合对象
        Collection c = new HashSet();//后面的集合无所谓，主要看前面的Collection接口，怎么遍历/迭代
        //添加元素
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        //对集合Collection进行遍历/迭代
        //第一步：获取集合对象的迭代器对象Iterator
        Iterator iterator = c.iterator();
        //第二步：通过以上获取的迭代器对象开始迭代/遍历集合
        /*
        以下两个方法是迭代器对象Iterator中的方法
            boolean    hasNext()   如果迭代具有更多元素，则返回 true 。
            Object next()  返回迭代中的下一个元素。
。
         */
        while(iterator.hasNext()){
            //不管你当初存进去是什么，取出来统一转换成Object
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
```

##### CollectionTest03:

```java
package com.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
关于集合的迭代/遍历
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象，ArrayList集合，有序可重复
        Collection c1 = new ArrayList();//List接口下的实现类都是有序可重复的
        //添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);

        //迭代集合
        Iterator it = c1.iterator();
        while (it.hasNext()){
            //存进去是什么类型，取出来还是什么类型
            Object obj = it.next();
            /*if (obj instanceof Iterator){
                System.out.println("Integer类型数据");
            }*/
            //只不过输出的时候会转换成字符串，调用toString()方法
            System.out.println(obj);
        }

        //HashSet集合:无序不可重复
        //无序：存进去和取出的顺序不一定相同
        //创建HashSet集合对象
        Collection c2 = new HashSet();
        c2.add(100);
        c2.add(90);
        c2.add(50);
        c2.add(888);
        c2.add(200);
        c2.add(666);
        c2.add(100);
        Iterator it2 = c2.iterator();
        while(it2.hasNext()){
            Object obj2 = it2.next();
            System.out.println(obj2);
        }
    }
}
```

##### CollectionTest04:

```java
package com.集合;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合中的contains方法：
    boolean contains(Object o)
    判断集合中是否包含某个对象o，包含返回true，否则返回false

    contains方法是用来判断集合中是否包含某个元素的方法，它在底层调用了equals方法进行比较
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        String s1 = new String("abc");
        c.add(s1);

        String s2 = new String("def");
        c.add(s2);

        //集合中元素的个数
        System.out.println("c集合元素个数"+c.size());

        String x = new String("abc");

        //ArrayList中的方法contains中使用了equals方法比较对象是否相同，有相同则说明包含
        System.out.println(c.contains(x));//true
    }
}
```

![](C:\Users\86187\Desktop\Java\java截图\集合截图\集合中的contains方法.png)

##### CollectionTest05:

```java
package com.集合;

import java.util.ArrayList;
import java.util.Collection;

/*
测试contains方法
测试remove方法
总结：存放在一个集合中的类型，一定要重写equals方法
 */

public class CollectionTest05 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        //创建用户对象
        User user1 = new User("jack");
        User user2 = new User("jack");

        //加入集合
        c.add(user1);
        //判断集合中是否包含user2
        //System.out.println(c.contains(user2));//User中没重写equals方法为false
        System.out.println(c.contains(user2));

        Integer x = new Integer(1000);
        c.add(x);
        Integer y = new Integer(1000);
        System.out.println(c.contains(y));//true,Integer类中的equals方法重写了，比较的是内容

        Collection c1 = new ArrayList();
        String s1 = new String("hello");
        c.add(s1);
        String s2 = new String("hello");
        c1.remove(s2);//s2.equals(s1) java认为s1和s2是一样的。删除s2就是删除s1
        System.out.println(c1.size());//0，remove方法中也重写了equals方法
    }
}

class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public boolean equals(Object o){
        if (o == null || !(o instanceof User)) return false;
        if (o == this) return true;
        User u = (User)o;
        return u.name.equals(this.name);
    }

}
```

##### CollectionTest06：

```java
package com.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素的remove
    重点：当集合的结构发生改变时，迭代器必须重新获取，如果还是用之前的迭代器，会出现
        异常：java.util.ConcurrentModificationException

    重点：在迭代集合元素的过程中，不能调用“集合对象”的remove方法，删除元素

    重点：在迭代元素的过程中，一定要使用迭代器Iterator的remove方法，删除元素，
        不要使用集合中的remove方法
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);//Integer类型
        c.add(2);
        c.add(3);
        //获取迭代器：集合结构只要发生改变，迭代器必须重新获取
        Iterator it = c.iterator();
        while (it.hasNext()){
            //编写代码时next()方法返回值必须是Object
            Object o = it.next();
            System.out.println(o);
        }

        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("xyz");
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            Object o2 = it2.next();
            //删除元素，删除之后，集合的结构发生了变化，应该重新去获取迭代器
            //但是，循环下一次的时候并没有重新获取迭代器，所以会
            // 出现异常：java.util.ConcurrentModificationException
            //c2.remove(o2);//集合对象的remove方法不可用
            //迭代器去删除时，会自动更新迭代器，并且更新集合（删除集合中的元素）
            it2.remove();   //删除的一定是迭代器指向的当前元素
            System.out.println(o2);
        }
        System.out.println(c2.size());//通过迭代器中的remove方法
    }
}
```

##### ListTest01:

```java
package com.集合.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Collection接口的子接口：List
测试List接口中常用的方法：
    1、List集合存储元素特点：有序可重复
        有序：List集合中的元素有下标，从0开始，以1递增
        可重复：存储的元素可以相同
    2、List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法：
        以下只列出List接口特有的常用的方法：
            void add(int index,Object element)
            Object get(int index)
            int indexOf(Object o)
            int lastIndexOf(Object o)
            Object remove(int index)
            Object set(int index,Object element)    修改指定位置元素
 */
public class ListTest01 {
    public static void main(String[] args) {
        //创建List类型的集合
        List myList = new ArrayList();
        //添加元素：默认都是向集合末尾添加元素
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("D");
        //1、在列表的指定位置添加元素。这个方法使用不多，因为对于ArrayList集合来说效率较低，涉及元素位移
        myList.add(1,"hello");

        //迭代
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        //2、根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);
        //因为有下标，所以List集合有自己特有的遍历方法
        //通过下标遍历
        for (int i = 0; i < myList.size(); i++) {
            Object object = myList.get(i);
            System.out.println(object);
        }

        //3、获取指定对象第一次出现处的索引(下标)
        System.out.println(myList.indexOf("C"));//3

        //4、获取指定对象最后一次出现处的索引
        System.out.println(myList.lastIndexOf("C"));//4

        //5、删除指定下标位置的元素
        myList.remove(3);

        //6、修改指定位置元素
        myList.set(1,"钢铁侠");
        Object object1 = myList.get(1);
        System.out.println(object1);

        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }
    }
}
```

##### ArrayListTest01:

```java
package com.集合.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合：
    1、默认初始化容量为10(底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量为10)
    2、集合底层是一个Object[]数组
    3、构造方法：
        new ArrayList();
        new ArrayList(20);
    4、ArrayList集合的扩容：
        增长到原容量的1.5倍。
        ArrayList集合底层是数组，怎么优化？
            尽可能少的扩容。因为数组扩容效率比较低，建议在使用ArrayList集合的时候
            预估计元素的个数，给定一个合适的初始化容量
    5、数组优点：
        检索效率比较高。（每个元素占用空间相同，内存地址是连续的，知道首元素内存地，
        然后知道下标，通过数学表达式计算出元素的内存地址，所以检索效率高）
    6、数组缺点：
        随机增删元素效率比较低
        另外数组无法存储大数据量（很难在内存中找到一块非常巨大的连续的内存空间）
    7、向数组末尾添加元素，效率很高，不受影响。
    8、面试常问？
        这么多的集合，使用最多的是哪个集合？
        答：ArrayList集合
        因为往数组末尾添加元素，效率不受影响，检索/查找某个元素的操作比较多。

 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量为10
        List list1 = new ArrayList();
        //集合的size()方法是获取当前集合中元素的个数。不是获取集合的容量
        System.out.println(list1.size());//0

        //指定初始化容量
        List list2 = new ArrayList(20);
    }
}
```

##### ArrayListTest02:

```java
package com.集合.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/*
集合ArrayList的构造方法
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        //默认初始化容量10
        List list1 = new ArrayList();
        //指定初始化容量100
        List list2 = new ArrayList(100);

        //创建一个HashSet集合
        Collection c = new HashSet();
        //添加元素到Set集合
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);

        //通过这个构造方法就可以将HashSet集合转换成List集合
        List list3 = new ArrayList(c);
        for (int i = 0; i < list3.size(); i++) {
            Object object = list3.get(i);
            System.out.println(object);
        }
    }
}
```

##### LinkedListTest01:

单向链表

![](C:\Users\86187\Desktop\Java\java截图\集合截图\LinkedList-单向链表.png)

**LinkedList底层调用的是双向链表**

```java
package com.集合.Collection.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

/*
链表的优点：
    由于链表上的元素在空间存储上内存地址不连续。
    所以随机增删元素的时候不会有大量元素位移，因此随机增删元素效率较高。
    在以后的开发中，如果遇到随机增删集合中元素的业务比较多时，建议使用LinkedList
链表的缺点：
    不能通过数学表达式计算被查找元素的内存地址，每一次查找都是从头节点开始遍历，
    直到找到为止。所以LinkedList集合检索/查找的效率较低。

    ArrayList：把检索发挥到极致
    LinkedList：把随机增删发挥到极致
    上面两个集合都各有优缺点
    因加元素都是往末尾添加，所以ArrayList用的比LinkedList多
 */
public class LinkedListTest01 {
    public static void main(String[] args) {
        //LinkedList集合底层也是有下标的
        //注意：ArrayList之所以检索效率比较高，不单纯因为有下标的原因。因为底层数组发挥的作用。
        //LinkedList集合照样有下标，但是检索/查找某个元素的时候效率比较低，因为只能从头节点开始一个一个遍历
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }

        //LinkedList集合没有初始化容量
        //最初这个链表没有任何元素。first和last都是null
        //不管是LinkedList还是ArrayList，以后写代码时都不需要具体关心是哪个集合。
        //因为我们需要面向接口编程，调用的方法都是接口中的方法
        //List list1 = new ArrayList();//这样写表示底层使用了数组
        List list1 = new LinkedList();//这样写表示底层使用了双向链表
        list1.add("123");
        list1.add("456");
        list1.add("789");
        for (int i = 0; i < list1.size(); i++) {
            Object object = list1.get(i);
            System.out.println(object);
        }
    }
}
```

##### VectorTest:

```java
package com.集合.Collection.List.Vector;

import java.util.*;
/*
Vector：
    1、底层也是一个数组
    2、初始化容量：10
    3、怎么扩容
        底层自动扩容：为原来的2倍
        10->20->40->80...
    4、ArrayList集合扩容的特点：
        ArrayList集合扩容是原容量的1.5倍
    5、Vector中所有的方法都s线程同步的，都带有synchronized关键字，是线程
    安全的。效率比较低，使用较少了
    6、怎么将一个线程不安全的ArrayList集合转换成线程安全的呢？
        使用集合工具类：
            java.util.Collections;

            java.util.Collection    是集合接口
            java.util.Collections   是集合工具类
 */

public class VectorTest {
    public static void main(String[] args) {
        //初始化容量为10，满了扩容为原容量的两倍

        List vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);

        //满了之后扩容（扩容后容量翻倍为20）
        vector.add(11);
        Iterator it = vector.iterator();
        while(it.hasNext()){
            Object object = it.next();
            System.out.println(object);
        }

        //这个可能以后要使用！
        List myList = new ArrayList();//非线程安全的
        //变成线程安全的
        Collections.synchronizedList(myList);

        //这里myList集合就是线程安全的了
        myList.add("111");
        myList.add("222");
        myList.add("333");
    }
}
```

##### 泛型机制：

###### GenericTest01:

```java
package com.集合.泛型;

import com.oop.demon07.B;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1、JDK5.0之后推出的新特性：泛型
2、泛型这种机制，只在程序编译阶段起作用，只是给编译器参考的。（运行阶段泛型不起作用）
3、使用泛型的好处:
    第一：集合中存储的元素类型统一了
    第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的“向下转型”
4、泛型的缺点：
    导致集合中存储的元素缺乏多样性
 */
public class GenericTest01 {
    public static void main(String[] args) {
       /* //不使用泛型机制，分析程序存在缺点
        List myList = new ArrayList();
        //准备对象
        Cat c = new Cat();
        Bird b = new Bird();
        //将对象添加到集合当中去
        myList.add(c);
        myList.add(b);

        //遍历集合，取出每个Animal，让它move
        Iterator it = myList.iterator();
        while(it.hasNext()){
            //没有这个语法，通过迭代器取出的就是Object
            //Animal a = it.next();

            Object object = it.next();
            //object中没有move方法，无法调用，需要向下转型
            if (object instanceof Animal){
                Animal a = (Animal)it.next();
                a.move();
            }
        }*/

        //使用JDK5之后的泛型机制
        //使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据
        //用泛型来指定集合中存储的数据类型
        List<Animal> animalList = new ArrayList<Animal>();
        Cat cat = new Cat();
        Bird bird = new Bird();

        //指定List集合中只能存储Animal，那么存储String就会编译报错了
        //animalList.add("123");

        animalList.add(cat);
        animalList.add(bird);
        //这个迭代器迭代的是Animal类型
        Iterator<Animal> animalIterator = animalList.iterator();
        while(animalIterator.hasNext()){
            //使用泛型机制之后，每一次迭代返回的数据都是Animal类型
            /*Animal a = animalIterator.next();
            a.move();*/

            //调用子类特有的方法还是需要向下转型的
            Animal a = animalIterator.next();
            if (a instanceof Cat){
                Cat cat1 = (Cat)a;
                cat1.catchMouse();
            }
            if (a instanceof Bird){
                Bird bird1 = (Bird)a;
                bird1.fly();
            }
        }

    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}
```

###### GenericTest02:

```java
package com.集合.泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK8之后引入了：自动类型推断机制。（又被称为钻石表达式）
 */
public class GenericTest02 {
    public static void main(String[] args) {
        //ArrayList<这里的类型会自动推断>();  前提是JDK8之后才允许
        //自动类型推断，钻石表达式
        List<Animal> myList = new ArrayList<>();
        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());
        //遍历
        Iterator<Animal> iterator = myList.iterator();
        while(iterator.hasNext()){
            Animal a = iterator.next();
            a.move();
        }

        List<String> strList = new ArrayList<>();
        //strList.add(new Cat());//类型不匹配
        strList.add("http://www.baidu.com");
        strList.add("http://www.126.com");
        strList.add("http://www.bilibili.com");
        Iterator<String> iterator1 = strList.iterator();
        while(iterator1.hasNext()){
            String s = iterator1.next();
            String s1 = s.substring(7);
            System.out.println(s1);
        }
    }
}
```

###### GenericTest03:

```java
package com.集合.泛型;

/*
自定义泛型
    自定义泛型的时候，<>尖括号中的是一个标识符，可以随便写。
    java源代码中经常出现的是：
       <E>和<T>
       E是Element单词首字母
       T是Type单词首字母
 */
public class GenericTest03<标识符随便写> {
    public void doSome(标识符随便写 o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        //new对象的时候指定了泛型是：String类型
        GenericTest03<String> gt = new GenericTest03<>();

        //类型不匹配
        //gt.doSome(100);
        gt.doSome("123");

        //-------------------------------------------------------
        GenericTest03<Integer> gt2 = new GenericTest03<>();
        gt2.doSome(100);
        //类型不匹配
        //gt2.doSome("abc");

        MyIterator<String> mi = new MyIterator<>();
        String s1 = mi.get();

        MyIterator<Animal> mi2 = new MyIterator<>();
        Animal a = mi2.get();
    }
}
class MyIterator<T>{
    public T get(){
        return null;
    }
}
```

##### 增强for循环：for-each

###### ForEachTest01:

```java
package com.集合.增强for循环;

public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {432,4,65,54,76,54};
        //遍历数组（普通的for循环）
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //增强for循环(for-each)语法
        /*
        for(元素类型 变量名:数组或集合){
            System.out.println(变量名)
        }
         */
        System.out.println("================================");

        //for-each有个缺点：没有下标
        for (int data :
                arr) {//data代表数组中的每一个元素
            System.out.println(data);
        }
    }
}
```

###### ForEachTest02:

```java
package com.集合.增强for循环;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//集合使用for-each
public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("钢铁侠");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        //使用下标方式（只针对有下标的集合）
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        
        //使用for-each
        for (String s: stringList) {//因为泛型使用的是String类型
            System.out.println(s);
        }

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
```

##### Set集合：

###### HashSetTest01：

```java
package com.集合.Collection.Set;

import java.util.HashSet;
import java.util.Set;

/*
HashSet集合：
    无序不可重复
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        //演示一下HashSet集合特点
        Set<String> stringSet = new HashSet<>();
        //添加元素
        stringSet.add("hello3");
        stringSet.add("hello4");
        stringSet.add("hello1");
        stringSet.add("hello2");
        stringSet.add("hello3");
        stringSet.add("hello3");
        stringSet.add("hello3");
        //遍历
        for (String s:stringSet){
            System.out.println(s);
        }
    }
}
```

###### TreeSetTest01:

```java
package com.集合.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet集合存储元素特点：
    1、无序不可重复。但是存储的元素可以自动按照大小顺序排序！
        称为：可排序集合
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("Z");
        stringSet.add("Y");
        stringSet.add("Z");
        stringSet.add("K");
        stringSet.add("M");
        for (String s:stringSet){
            System.out.println(s);
        }
    }
}
```

##### Map集合：

###### MapTest01:

```java
package com.集合.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
java.util.Map接口中常用方法：
    1、Map和Collection没有继承关系
    2、Map集合以Key和value的方式存储数据：键值对
        key和value都是引用数据类型
        key和value都是存储对象的内存地址
        key起到主导的地位，value是key的一个附属品
    3、Map中常用方法
        V put(K key,V value)    向Map集合中添加键值对
        V get(Object key)   通过key获取value
        int size()  获取Map集合中键值对的个数
        V remove(Object key)    通过key删除键值对
        void clear()    清空Map集合
        boolean containsKey(Object key) 判断Map集合是否包含某个key
        boolean containsValue(Object value) 判断Map集合是否包含某个value
        boolean isEmpty()   判断Map集合中元素个数是否为0
        Collection<V> values()  获取Map集合中所有的value，返回一个Collection

        Set<K> keySet() 获取Map集合中所有的key（所有的键是一个Set集合）

        Set<Map.Entry<K,V>> entrySet()  Map.Entry是一个类名
            将Map集合转换成Set集合
            假设现在有一个Map集合，如下所示：
            map1集合对象
            key             value
            ----------------------------
            1               zhangsan
            2               lisi
            3               wangwu
            4               zhaoliu

            Set set = map1.entrySet();
            set集合对象
            1=zhangsan
            2=lisi
            3=wangwu
            4=zhaoliu
 */
public class MapTest01 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer,String> map = new HashMap<>();
        //1.V put(K key,V value)    向Mao集合添加键值对
        map.put(1,"张三");//1在这里自动装箱
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");

        //2.V get(Object key)通过key获取value
        String value1 = map.get(1);//张三
        System.out.println(value1);

        //3.int size()获取键值对的数量
        System.out.println("键值对的数量为："+map.size());//4

        //4.V remove(Object key)    通过key删除键值对
        map.remove(4);
        System.out.println("键值对的数量为："+map.size());//3

        //5.判断是否包含某个key
        //contains方法底层调用的都是equals进行比较的，所以自定义的类型都需要重写equals方法
        System.out.println(map.containsKey(1));//true
        System.out.println(map.containsKey(4));//false

        //6.判断是否包含某个value
        System.out.println(map.containsValue("张三"));//true
        System.out.println(map.containsValue("赵六"));//false

        //7.Collection<V> values()  获取Map集合中所有的value，返回一个Collection
        Collection<String> values = map.values();
        for (String s:values){
            System.out.println(s);
        }

        //8. void clear()清空map集合
        map.clear();
        System.out.println("键值对的数量为："+map.size());

        //9.boolean isEmpty()   判断Map集合中元素个数是否为0判断是否为空
        System.out.println(map.isEmpty()?"map集合为空":"map集合不为空");

        //10.
    }
}
```

###### MapTest02:

```java
package com.集合.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历【非常重要】
 */
public class MapTest02 {
    public static void main(String[] args) {
        //第一种方式：Set<K> keySet() 获取Map集合中所有的key（所有的键是一个Set集合）
        // 获取所有的key，通过遍历key来遍历value
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");
        //遍历map集合
        //获取所有的key，所有的key是一个Set集合
        Set<Integer> keys = map.keySet();
        //遍历key，通过key获取value
        //迭代器方式
        /*Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            //取出其中一个key
            Integer key = it.next();
            //通过key获取value
            String value = map.get(key);
            System.out.println(key+"="+value);
        }*/
        //foreach方式
        for (Integer key:keys){
            System.out.println(key+"="+map.get(key));
        }

        //第二种方式：Set<Map.Entry<K,V>> entrySet()  Map.Entry是一个类名
        //这种方式是把Map集合直接全部转换成Set集合
        //Set集合中元素的类型是：Map.Entry
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        /*Iterator<Map.Entry<Integer, String>> it2 = entries.iterator();
        while(it2.hasNext()){
            Map.Entry<Integer, String> next = it2.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"="+value);
        }*/
        for (Map.Entry me:entries){
            System.out.println(me);
        }
    }
}
```

###### HashMapTest01:

```java
package com.集合.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap集合：
    1、HashMap集合底层是哈希表/散列表的数据结构
    2、哈希表是一个怎样的数据结构呢？
        哈希表是一个数组和单向链表的结合体
        数组：在查询方面效率很高，随机增删方面效率很低。
        单向链表：在随机增删方面效率很高，在查询方面效率很低。
        哈希表将以上的两种数据结构融合在一起，充分发挥它们各自的优点。
    3、HashMap集合底层的源代码：
        public class HashMap{
        //HashMap底层实际上就是一个数组（一维数组）
        Node<K,V>[] table;
        //静态的内部类HashMap.Node
        static class Node<K,N>{
            final int hash;//哈希值（哈希值是key的hashCode()方法的执行结果。hash值通过哈希函数/算法，可以转换存储成数组的下标。）
            final K key;    //存储到Map集合中的那个key
            V value;    //存储到Map集合中的那个value
            Node<K,V> next; //下一个节点的内存地址
         }
       }
        哈希表/散列表：一维数组。这个数组中每一个元素都是一个单向链表。（数组和链表的结合体）
     4、最主要掌握的是：
        map.put(k,v)
        v = map.get(k)
        以上这两个方法的实现原理必须要掌握
     5、HashMap集合的key部分特点：
        无序，不可重复。
        为什么无序？因为不一定挂到哪个单向链表上
        不可重复是怎么保证的？equals方法保证HashMap集合的key不可重复
        如果key重复了，value会覆盖

        放到HashMap集合key部分的元素其实就是放到HashSet集合中了。
        所以HashSet集合中的元素也需要同时重写hashCode()和equals()方法
      6、哈希表HashMap使用不当时无法发挥性能
        假设将所有的hashCode()方法返回值固定为某个值，那么会导致哈希表变成了
        纯单向链表。这种清空我们称为：散列分布不均匀。
        什么是散列分布均匀？
            假设有100个元素，10个单向链表，那么每个单向链表上有10个节点，这是最好的，是散列分布均匀的。
            假设将所有的hashCode()方法返回值都设定为不一样的值有什么问题？
                这样的话导致底层哈希表就成为一维数组了，没有链表的概念了，也是散列分布不均匀。
         散列分布均匀需要重写hashCode()方法时有一定的技巧。
      7、重点：放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写hashCode和equals方法
      8、HashMap集合的默认初始化容量是16，默认加载因子是0.75
        这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容

        重点：记住：HashMap集合初始化容量必须是2的倍数，这是官方推荐的
        这是因为达到散列均匀，为了提高HashMap集合的存取效率所必须的
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //测试hashMap集合key部分的元素特点
        //Integer是key，它的hashCode和equals都重写了
        Map<Integer,String> map = new HashMap<>();
        map.put(1111,"张三");
        map.put(6666,"李四");
        map.put(7777,"王五");
        map.put(2222,"赵六");
        map.put(2222,"钢铁侠");//key重复的时候value会自动覆盖
        System.out.println(map.size());//4
        //遍历map集合
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> m:entries){
            System.out.println(m);
        }
    }
}
```

![](C:\Users\86187\Desktop\Java\java截图\集合截图\HashMap底层哈希表数据结构.png)

###### HashMapTest02:

```java
package com.集合.Map.HashMap;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
* 1、向Map集合中存，以及从Map集合中取，都是先调用key的hashCode方法，然后再调用equals方法！
*   equals方法有可能调用，也可能不调用
*       拿put(k,v)举例，什么时候equals不会调用？
*           k.hashCode()方法得到哈希值
*           哈希值经过哈希算法转换成数组下标。
*           数组下标位置上如果是null(没有单向链表)，equals方法不需要调用，直接把这个节点放入哈希表中
*       拿get(k)举例，什么时候equals不会调用？
*           k.hashCode()方法得到哈希值
*           哈希值经过哈希算法转换成数组下标。
*           数组下标位置上如果是null(没有单向链表)，直接返回null，equals方法不需要调用。
* 2、注意：如果一个类的equals方法重写了。那么hashCode方法必须重写！
*       并且equals方法如果返回结果是true，hashCode方法返回的值必须一样。
*       equals方法返回true表示两个对象相同，在同一个单向链表上比较。
*       那么对于同一个单向链表上的节点来说，它们的哈希值都是相同的。
*       所以hashCode方法的返回值也应该相同。
* 3、hashCode方法和equals方法可以使用IDEA工具直接生成，但是这两个方法需要同时生成。
*
* 4、终极结论：
*       放在HashMap集合key部分的，以及放在HashSet集合中的元素，需要同时重写hashCode方法和equals方法
* */
public class HashMapTest02 {
    public static void main(String[] args) {
        student student1 = new student("张三");
        student student2 = new student("张三");
        //重写equals方法之前是false
        //System.out.println(student1.equals(student2));
        //重写equals方法之后是true
        System.out.println(student1.equals(student2));

        //重写hashCode方法之前
        //student1的hashCode=764977973
        //student2的hashCode=1534030866
        /*System.out.println("student1的hashCode="+student1.hashCode());
        System.out.println("student2的hashCode="+student2.hashCode());*/

        //student1.equals(student2)结果已经是true了，表示student1和student2是一样的，相同的，那么往HashSet集合中放的话，
        //按说只能放进去1个。（HashSet集合特点：无序不可重复）
        /*Set<student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students.size());*///这个结果应该是1，但结果是2，显然不符合HashSet集合存储特点

        //重写hashCode方法之后
        System.out.println("student1的hashCode="+student1.hashCode());
        System.out.println("student2的hashCode="+student2.hashCode());
        Set<student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students.size());
    }
}
class student{
    private String name;

    public student(String name) {
        this.name = name;
    }

    public student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
```

###### HashMapTest03:

```java
package com.集合.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
/*
了解：
* HashMap集合key部分允许null吗？
*   允许
*   但是要注意：HashMap集合的key部分，null值只有一个，多的会覆盖
* */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //HashMap集合允许key为null
        map.put(null,null);
        System.out.println(map.size());//1

        //key重复，value覆盖
        map.put(null,100);
        System.out.println(map.size());//1

        //通过key获取value
        System.out.println(map.get(null));//100
    }
}

```

###### HashtableTest01:

```java
package com.集合.Map.Hashtable;

import java.util.Hashtable;
import java.util.Map;
/*
* Hashtable的key可以为null吗？
*       Hashtable的key和value都是不能为null的
*       HashMap的key和value都是可以为null的
* Hashtable方法都带有synchronized：线程安全的
* 线程安全有其它的方案，这个Hashtable对线程的处理导致效率较低，所以使用较少了。
*
* Hashtable和HashMap一样，底层都是哈希表数据结构
* Hashtable的初始化容量为11，默认加载因子为0.75f
* Hashtable的扩容：原容量*2+1
* */
public class HashtableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();
        //Exception in thread "main" java.lang.NullPointerException
        //map.put(null,"123");

        //map.put(100,null);
        System.out.println(map.get(100));
    }
}

```

###### PropertiesTest01:

```java
package com.集合.Map.Hashtable.Properties;

import java.util.Properties;

/*
* Properties继承Hashtable
*
* 目前只需要掌握Properties属性类对象的相关方法即可。
* Properties是一个Map集合，继承Hashtable，Properties的key和value都是“String”类型
*Properties被称为属性类对象
* */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties pro = new Properties();
        //需要掌握Properties的两个方法，一个存，一个取。
        //存，setProperty
        pro.setProperty("111","张三");
        pro.setProperty("222","李四");
        pro.setProperty("333","王五");
        pro.setProperty("444","赵六");
        //取，通过key获取value
        String s1 = pro.getProperty("111");
        String s2 = pro.getProperty("222");
        String s3 = pro.getProperty("333");
        String s4 = pro.getProperty("444");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

```

###### TreeSetTest02:

```java
package com.集合.Map.SortedMap;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
* SortedMap是个接口,继承Map接口
* TreeMap实现了SortedMap接口
* 1、TreeSet集合底层实际上是一个TreeMap
* 2、TreeMap集合底层是一个二叉树。
* 3、放到TreeSet集合中的元素，等同于放到TreeMap集合的key部分了
* 4、TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序。称为：可排序集合。
*
* */
public class TreeSetTest02 {
    public static void main(String[] args) {
        //创建一个TreeSet集合（演示TreeSet对String是可排序的）
        TreeSet<String> treeSet = new TreeSet<>();
        //添加String
        treeSet.add("zhangsan");
        treeSet.add("lisi");
        treeSet.add("wangwu");
        treeSet.add("zhangsi");
        treeSet.add("wangliu");
        for (String string:treeSet){
            //按照字典顺序，升序！
            System.out.println(string);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(200);
        ts2.add(900);
        ts2.add(800);
        ts2.add(600);
        ts2.add(10);
        for (Integer element : ts2){
            //升序
            System.out.println(element);
        }
    }
}

```

###### TreeSetTest03:

```java
package com.集合.Map.SortedMap;

import java.util.TreeSet;

/*
* TreeSet无法对自定义类型排序
*
* 对自定义的类型来说，TreeSet可以排序吗？
*   以下程序中对于Person类型来说，无法排序。因为没有指定Person对象之间的比较规则。
*   谁大谁小并没有说明。
*
*    以下程序运行时出现了这个异常：
*       java.lang.ClassCastException:
*       class com.集合.Map.SortedMap.Person
*       cannot be cast to class java.lang.Comparable
*    出现这个异常的原因是：
*       Person类没有实现java.lang.Comparable接口。
*
* 重点：对于放到TreeSet集合中的自定义类型需要实现Comparable接口才可以进行比较
 * */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        //System.out.println(p1);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(25);

        //创建TreeSet集合
        TreeSet<Person> persons = new TreeSet<>();
        //添加元素
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        //遍历
        for (Person p:persons){
            System.out.println(p);
        }


    }
}
class Person{
    int age;

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }
}
```

###### TreeSetTest04:

```java
package com.集合.Map.SortedMap;

import java.util.TreeSet;
/*
* 自定以类型实现Comparable接口
* */
public class TreeSetTest04 {
    public static void main(String[] args) {
        Customer c1 = new Customer(32);
        Customer c2 = new Customer(20);
        Customer c3 = new Customer(30);
        Customer c4 = new Customer(25);

        //创建TreeSet集合
        TreeSet<Customer> customers = new TreeSet<>();
        //添加元素
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);

        //遍历
        for (Customer c:customers){
            System.out.println(c);
        }
    }

}
//放在TreeSet集合中的元素需要实现java.lang.Comparable接口
//并且实现comparableTo方法，equals方法可以不写，需要重写toString方法。
class Customer implements Comparable<Customer>{
    int age;

    public Customer(int age) {
        this.age = age;
    }

    //需要在这个方法中编写比较的逻辑，或者说比较的规则，按照什么进行比较？
    @Override
    public int compareTo(Customer customer) {
        return this.age-customer.age;//这里按照年龄升序
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }
}

```

###### TreeSetTest05：

```java
package com.集合.Map.SortedMap;

import java.util.TreeSet;

/*
* 先按照年龄升序，如果年龄一样再按照姓名升序
* */
public class TreeSetTest05 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsi",20));
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("king",18));
        vips.add(new Vip("jack",17));
        for (Vip v : vips){
            System.out.println(v);
        }
    }
}
class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Vip vip) {
        if (this.age == vip.age){
            //年龄相同时按照名字排序
            //姓名是String类型，可以直接比，调用compareTo方法来完成比较。
            return this.name.compareTo(vip.name);
        }else{
            //年龄不一样按年龄排
            return this.age-vip.age;
        }
    }
}
```

###### 自平衡二叉树：

![](C:\Users\86187\Desktop\Java\java截图\集合截图\自平衡二叉树.png)

###### TreeSetTest06:

```java
package com.集合.Map.SortedMap;

import java.util.Comparator;
import java.util.TreeSet;

/*
* TreeSet集合中元素可排序的第二种方式：使用比较器的方式。
* 最终结论：
*   放到TreeSet集合或者TreeMap集合key部分的元素要想做到排序，包括以下两种方式：
*       第一种：放在集合中的元素实现java.lang.Comparable接口
*       第二种：在构造TreeSet或者TreeMap集合的时候给它传一个比较器对象。
*
* Comparable和Comparator怎么选择？
*   当比较规则不会发生改变的时候，或者说当比较规则只有一个的时候，建议实现Comparable接口。
*   如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用Comparator接口
*   Comparator接口的设计符合OCP原则
* */
public class TreeSetTest06 {
    public static void main(String[] args) {
        //创建TreeSet集合的时候要使用这个比较器Comparator。
        //TreeSet<WuGui> wuGuis = new TreeSet<>(); //这样不行，没有通过构造方法传递一个比较器进去。

        //给构造方法传递一个比较器
        //TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());

        //使用匿名内部类的方式（这个类没有名字，直接new接口）
        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui wuGui, WuGui t1) {
                return wuGui.age - t1.age;
            }
        });

        wuGuis.add(new WuGui(100));
        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(999));
        wuGuis.add(new WuGui(666));
        for (WuGui wuGui:wuGuis){
            System.out.println(wuGui);
        }
    }
}
//乌龟
class WuGui{
    int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟["+
                "age="+ age +
                "]";
    }
}
//单独在这里编写一个比较器
//比较器实现java.util.Comparator接口。(Comparable是java.lang包下的。Comparator是java.util包下的)
/*class WuGuiComparator implements Comparator<WuGui>{

    @Override
    public int compare(WuGui wuGui, WuGui t1) {
        //指定比较规则
        //按照年龄排序
        return wuGui.age-t1.age;
    }
}*/


```

###### CollectionsTest：

```java
package com.集合.CollectionsTest;

import java.util.*;

/*
* java.util.Collection集合接口
* java.util.Collections集合工具类，方便集合的操作
* */
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的。
        List<String> list = new ArrayList<>();

        //变成线程安全的
        Collections.synchronizedList(list);

        //排序
        list.add("abf");
        list.add("abx");
        list.add("abc");
        list.add("abe");
        Collections.sort(list);
        for (String s:list){
            System.out.println(s);
        }

        List<WuGui2> wuGui2s = new ArrayList<>();
        wuGui2s.add(new WuGui2(1000));
        wuGui2s.add(new WuGui2(8000));
        wuGui2s.add(new WuGui2(6666));
        //注意：对List集合中元素排序，需要保证List集合中的元素实现了Comparable接口
        Collections.sort(wuGui2s);
        for (WuGui2 w:wuGui2s){
            System.out.println(w);
        }

        //对Set集合怎么排序呢？
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingSoft");
        set.add("king2");
        set.add("king1");
        //将set集合转换成List集合
        List<String> myList = new ArrayList<>(set);
        Collections.sort(myList);
        for (String string : myList){
            System.out.println(string);
        }

        //另一种排序方式：Collections.sort(List集合,比较器对象);
    }
}
class WuGui2 implements Comparable<WuGui2>{
    int age;

    public WuGui2(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟["+
                "age="+ age +
                "]";
    }

    @Override
    public int compareTo(WuGui2 wuGui2) {
        return this.age - wuGui2.age;
    }
}

```

