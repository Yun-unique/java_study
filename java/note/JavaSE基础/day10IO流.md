## IO流

### 1、什么是IO流？

I:Input

O:Output

通过IO可以完成硬盘文件的读和写

![](C:\Users\86187\Desktop\Java\java截图\IO流\什么是IO流.png)

---

### 2、IO流的分类

有多种分类方式：

1. 一种方式是按照流的方向进行分类：

   ​	以内存作为参照物，往内存中去，叫做输入（Input）。或者叫做读（Read）。

   ​	从内存中出来，叫做输出（Output），或者叫做写（Write）。

2. 另一种方式是按照读取数据方式不同进行分类：

   ​	有的流是按照字节的方式读取数据，一次读取1个字节byte，等同于一次读取8个二进制位。

   ​	这种流是万能的，==什么类型的文件都可以读取==。包括：文本文件，图片，声音文件，视频文件等。

   ​		假设文件file1.txt，采用字节流的话是这样读的：

   ​			a中国bc张三fe

   ​			第一次读：一个字节，正好读到'a'。

   ​			第二次读：一个字节，正好读到'中'字符的一半。

   ​			第三次读：一个字节，正好读到'中'字符的另一半。

   ​			............

   

   ​	有的流是按照字符的方式读取数据的，一次读取一个字符，这种流是为了方便读取普通文本文件而存在的，

   ​	这种流不能读取：图片、声音、视频等文件。==只能读取纯文本文件（txt后缀）==，连word问价都无法读取。

   ​		假设文本file1.txt，采用字符流的话是这样读的：

   ​			a中国bc张三fe

   ​			第一次读：'a'字符（'a'字符在windows系统中占用1个字节）

   ​			第二次读：'中'字符（'中'字符在windows系统中占用2个字节）



**综上所述：流的分类有**

按流的方向：**输入流、输出流**

按读取数据方式：**字节流、字符流**

### 3、流该如何学习

Java中的IO流都已经写好了，我们程序员不需要关心，我们最主要还是掌握，在Java中已经提供了哪些流？

每个流的特点是什么？每个流对象上的常用方法有哪些？

​	Java中所有的流都是在：java.io.*;包下

​	Java中主要还是研究：

​		怎么new流对象，怎么调用流对象的哪个方法是读，哪个方法是写。

### 4、流的四大家族

​	Java IO流这块有四大家族：

> ​	**java.io.InputStream**	字节输入流
>
> ​	**java.io.OutputStream**  字节输出流

> ​	**java.io.Reader**	字符输入流
>
> ​	**java.io.Writer**	字符输出流

**四大家族的首领都是抽象类（abstract class）**

**所有的==流==都实现了：**

​		**java.io.Closeable接口，都是可关闭的，都有close()方法。流毕竟是一个管道，这个是内存和硬盘之间的通		道，用完之后一定要关闭，不然会耗费（占用）很多资源养成好习惯，用完流一定要关闭！**

**所有的==输出流==都实现了：**

​		**java.io.Flushable接口，都是可刷新的，都有flush()方法。养成一个好习惯，输出流在最终输出之后，一		定要记得flush()刷新以下。这个刷新表示将通道/管道当中剩余未输出的数据强行输出完(清空管道！)刷新的		作用就是清空管道。**

​		**注意：如果没有flush()可能会导致丢失数据！**

**注意：在java中只要“类名”以Stream==结尾==的都是字节流。以”Reader/Writer“==结尾==的都是字符流**

### 5、java.io包下需要掌握的流有16个：

**文件专属：**

> java.io.FileInputStream
>
> java.io.FileOutputStream
>
> java.io.FileReader
>
> java.io.FileWriter

**转换流：（将字节流转换成字符流）**

> java.io.InputStreamReader
>
> java.io.OutputStreamWriter

**缓冲流专属：**

> java.io.BufferedReader
>
> java.io.BufferedWriter
>
> java.io.BufferedInputStream
>
> java.io.BufferedOutputStream

**数据流专属：**

> java..io.DataInputStream
>
> java.io.DataOutputStream

**标准输出流：**

> java.io.PrintWriter
>
> java.io.PrintStream

**对象专属流：**

> java.io.ObjectInputStream
>
> java.io.ObjectOutputStream

## 代码测试：

#### FileInputStreamTest01:

```java
package com.IO流.文件专属流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* java.io.FileInputStream:
*   1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读。
*   2、字节的方式，完成输入的操作，完成读的操作(硬盘-->内存)
*   3、
*
* */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        //创建文件字节输入流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\Users\86187\Desktop\Java\java\JavaIOFile\FileInputStream\\temp1.txt");
            //开始读
            int readData = fis.read();//这个方法的返回值是：读取到的“字节”本身
            System.out.println(readData);//97

            readData = fis.read();
            System.out.println(readData);//98

            readData = fis.read();
            System.out.println(readData);//99

            readData = fis.read();
            System.out.println(readData);//100

            readData = fis.read();
            System.out.println(readData);//101

            readData = fis.read();
            System.out.println(readData);//102

            //已经读到文件的末尾了，再读的时候读取不到任何数据，返回-1
            readData = fis.read();
            System.out.println(readData);//-1


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //在finally语句块中确保流一定关闭
            if (fis!=null){ //避免空指针异常
                //关闭流的前提是：流不是空。流是null的时候没必要关闭
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

#### FileInputStreamTest02:

```java
package com.IO流.文件专属流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
对上一个程序进行改进。FileInputStream循环读
分析这个程序的缺点：
    一次读取一个字节byte，这样内存和硬盘交互太频繁了，基本上时间/资源都耗费在交互上面了
    。能不能一次读取多个字节呢？

 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:\Users\86187\Desktop\Java\java\JavaIOFile\FileInputStream\\temp1.txt");
            //读数据.循环读
           /* while (true){
                int readData = fis.read();
                if (readData==-1){
                    break;
                }
                System.out.println(readData);
            }*/
            //改进while循环
            int readData = 0;
            while ((readData = fis.read()) != -1){
                System.out.println(readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
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

#### FileInputStreamTest03:

```java
package com.IO流.文件专属流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
int read(byte[] b)
    一次最多读取b.length个字节
    减少硬盘和内存的交互，提高程序的执行效率
    在byte[]数组当中读

 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\Users\86187\Desktop\Java\java\JavaIOFile\FileInputStream\\temp1.txt");

            //开始读，采用byte数组，一次读取多个字节。最多读取“数组.length”个字节
            byte[] bytes = new byte[4];//准备一个4个长度的byte数组，一次最多读取4个字节
            //这个方法的返回值是：读取到的字节数量（不是字节本身）
            int readCount = fis.read(bytes);//第一次读到了4个字节
            System.out.println(readCount);//4
            //将字节数组全部转换成字符串
            //System.out.println(new String(bytes));//abcd
            //不应该全部转换，而是应该读取了多少个字节，将多少个字节转换成字符串
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);//第二次读到了2个字节
            System.out.println(readCount);//2
            //System.out.println(new String(bytes));//efcd
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);//第三次一个字节都读不到
            System.out.println(readCount);//-1
            //System.out.println(new String(bytes));//efcd
            //java.lang.StringIndexOutOfBoundsException: offset 0, count -1, length 4
            //System.out.println(new String(bytes,0,readCount));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
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

#### FileInputStreamTest04:

```java
package com.IO流.文件专属流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream最终版:需要掌握
* */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //fis = new FileInputStream("C:\Users\86187\Desktop\Java\java\JavaIOFile\FileInputStream\\temp1.txt");
            fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java实训\\代码\\day12\\Wuli.java");
            //准备一个byte[]数组
            byte[] bytes = new byte[4];
            /*while (true){
                int readCount = fis.read(bytes);
                if (readCount==-1){
                    break;
                }
                //把byte数组转换成字符串，读到多少个转换多少个。
                System.out.print(new String(bytes,0,readCount));
            }*/
            int readCount = 0;
            while ((readCount = fis.read(bytes))!=-1){
                System.out.print(new String(bytes,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
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

#### FileInputStreamTest05:

```java
package com.IO流.文件专属流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类的其它常用方法：
    int available()：返回流当中剩余的没有读到的字节数量
    long skip(long n)：跳过并丢弃n个字节的数据
* */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileInputStream\\temp1.txt");

            /*//1、int available()方法
            System.out.println("该文件总字节数量为："+fis.available());

            //读一个字节
            int readByte = fis.read();
            //还剩多少个字节
            int available = fis.available();
            System.out.println("剩下未读的字节数量为："+available);

            //这个方法有什么用？
            byte[] bytes = new byte[fis.available()];//这种方式不适合太大的文件，因为byte[]数组不能太大。
            //不需要循环了，直接读一次就行了
            int readCount = fis.read(bytes);
            System.out.println(readCount);
            System.out.println(new String(bytes));*/

            //2、long skip(long n)方法
            fis.skip(3);
            System.out.println(fis.read());//100

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
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

#### FileOutputStreamTest01:

```java
package com.IO流.文件专属流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 文件字节输出流，负责写。
* 从内存到硬盘。
*
* */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //myfile文件不存在的时候会自动新建！
            //这种方式谨慎使用，会将原文件内容清空，然后重新写入数据
            //fos = new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\JavaIOtest\\FileOutputStream\\myfile.txt");

            //FileOutputStream构造方法，以追加的方式在文件的末尾写入，不会清空原文件内容
            fos = new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileOutputStream\\myfile.txt",true);
            //开始写
            //fos.write(97);//写出一个字节a
            byte[] bytes = {97,98,99,100};
            fos.write(bytes);

            String s = "我是中国人，我骄傲！";
            //将字符串转换成byte[]数组
            byte[] sBytes = s.getBytes();
            fos.write(sBytes);
            //写完之后，最后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

```

#### 文件的复制原理：

![](C:\Users\86187\Desktop\Java\java截图\IO流\文件的复制原理.png)

##### Copy1:

```java
package com.IO流.文件专属流.文件复制;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
使用FileInputStream+FileOutputStream完成文件的拷贝
拷贝的过程应该是一边读，一边写。
使用以上的字节流拷贝文件的时候，文件类型随意，万能的，什么样的文件都能拷贝
* */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建一个输入流对象
            fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileOutputStream\\myfile.txt");

            //创建一个输出流对象
            //这是将一个文件的内容拷贝到另一个文件
            //fos = new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileInputStream\\temp1.txt",true);

            //这是将一个文件完整的拷贝下来
            fos = new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileInputStream\\myfile.txt");

            //最核心的：一边读，一边写
            byte[] bytes = new byte[1024*1024];//1MB（设置一次最多拷贝1MB）
            int readCount = 0;
            while ((readCount=fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
            }

            //输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分开try，不要一起try
            //一起try的时候，其中一个出现异常，可能会影响到另一个流的关闭
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

```

##### Copy2:

```java
package com.IO流.文件专属流.文件复制;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* 使用FileWriter进行拷贝的话，只能拷贝“普通文本文件”
*
* */
public class Copy02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            //读
            in = new FileReader("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileReader\\myReader");
            //写
            out = new FileWriter("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileWriter\\myReader");

            //一边读，一边写
            char[] chars = new char[1024*512];//1MB(1个字符=2个字节)
            int readCount = 0;
            while ((readCount = in.read(chars))!=-1){
                out.write(chars,0,readCount);
            }

            //刷新
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

```

#### FileReaderTest:

```java
package com.IO流.文件专属流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader:
    文件字符输入流，只能读取普通文本
    读取文本内容时，比较方便，快捷
* */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            //创建一个文件字符输入流对象
            reader = new FileReader("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileReader\\myReader");

            /*//准备一个char数组
            char[] chars = new char[4];
            //往char数组中读
            reader.read(chars);
            for (char c:chars){
                System.out.print(c);
            }*/

            //开始读
            char[] chars = new char[4];//一次读取四个字符
            int readCount = 0;
            while((readCount = reader.read(chars))!=-1){
                System.out.print(new String(chars,0,readCount));
            }

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



#### FileWriterTest:

```java
package com.IO流.文件专属流;

import java.io.FileWriter;
import java.io.IOException;

/*
* FileWriter：
*   文件字符输出流，写。
*   只能输出普通文本。word文档不是普通文本
* */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            //创建文件字符输出流对象
            fileWriter = new FileWriter("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\FileWriter\\myWriter");

            //开始写。
            char[] chars = {'我','是','中','国','人','!'};
            fileWriter.write(chars);
            fileWriter.write(chars,2,3);

            fileWriter.write("我是一名java软件工程师！");
            fileWriter.write("\n");
            fileWriter.write("Hello World!");

            //输出流刷新
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

```

#### BufferedReaderTest01:

```java
package com.IO流.缓冲专属流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* BufferedReader：
*   带有缓冲区的字符输入流。
*   使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲。
* */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\86187\\Desktop\\Java\\java\\javase_code\\src\\com\\IO流\\缓冲专属流\\BufferedReaderTest01.java");
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
        //外部负责包装的这个流叫做：包装流，或者叫做：处理流
        //像当前这个程序来说：FileReader就是一个节点流，BufferedReader就是一个处理流/包装流
        BufferedReader br = new BufferedReader(fileReader);

        //BufferedReader中读一行的方法：String readLine()
        /*String firstLine = br.readLine();
        System.out.println(firstLine);
        String secondLine = br.readLine();
        System.out.println(secondLine);
        String threeLine = br.readLine();
        System.out.println(threeLine);*/

        //br.readLine()方法读取一个文本行，但不带换行符。
        String s = null;
        while((s = br.readLine())!=null){
            System.out.println(s);
        }
        //关闭流
        //对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关闭。（可以从源代码进行分析）
        br.close();
    }
}

```

#### BufferedReaderTest02:

```java
package com.IO流.缓冲专属流;

import java.io.*;

/*
* 节点流和包装流
* 转换流：InputStreamReader
* */
public class BufferedReaderTest02 {
    public static void main(String[] args) throws IOException {
        /*//节点流
        FileInputStream fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\BufferedReader\\br");

        //通过转换字符流（InputStreamReader将字节输入流转换成字符输入流）
        //fis是节点流，inputStreamReader是包装流
        InputStreamReader inputStreamReader = new InputStreamReader(fis);

        //这个构造方法只能传一个字符流，不能传字节流
        //inputStreamReader是节点流，br是包装流
        BufferedReader br = new BufferedReader(inputStreamReader);*/

        //合并使用
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\\\Users\\\\86187\\\\Desktop\\\\Java\\\\java\\\\JavaIOFile\\\\BufferedReader\\\\br")));

        String line = null;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        //关闭流
        br.close();
    }
}

```

#### BufferedWriterTest:

```java
package com.IO流.缓冲专属流;

import java.io.*;

/*
* BufferedWriter:带有缓冲的字符输出流：
* */
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        //带有缓冲的字符输出流
        //BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\BufferedWriter\\bw"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\BufferedWriter\\bw2")));

        //开始写
        bw.write("hello world");
        bw.write("\n");
        bw.write("hello kitty");
        bw.write("我是一名java程序员");
        //刷新流
        bw.flush();
        //关闭流
        bw.close();
    }
}

```

#### DataOutputStreamTest:

```java
package com.IO流.数据流专属;

import java.io.*;

/*
* java.io.DataOutputStream:数据专属字节输出流
* 这个流可以将数据连同数据的类型一并写入文件。
* 注意：这个文件不是普通文本文档。（这个文件使用记事本打不开。）
*
*   可以用来加密文件
* */
public class DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建数据专属的字节输出流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\DataOutputStream\\data"));
        //写数据
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 3.0F;
        double d = 3.14;
        boolean sex = false;
        char c = 'a';
        //写入文件
        dos.writeByte(b);//把数据以及数据的类型一并写入到文件当中
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);

        //刷新流
        dos.flush();
        //关闭流
        dos.close();
    }
}

```

#### DataInputStreamTest:

```java
package com.IO流.数据流专属;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* DataInputSteam:数据字节输入流
* DataOutputStream写的文件，只能使用DataInputStream去读。并且读的时候你需要提前知道写入的顺序。
* 读的顺序需要和写的顺序一致。才可以正常取出数据。
* */
public class DataInputStreamTest {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(""));
        //开始读
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean sex = dis.readBoolean();
        char c = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sex);
        System.out.println(c);

        //关闭流
        dis.close();
    }
}

```

#### PrintStreamTest:

```java
package com.IO流.标准输出流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
* java.io.PrintStream:标准的字节输出流。默认输出到控制台
* */
public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        //联合起来写
        System.out.println("hello");

        //分开写
        PrintStream ps = System.out;
        ps.println("hello zhangsan");
        ps.println("hello lisi");
        ps.println("hello wangwu");

        //标准输出流不需要手动close()关闭
        //可以改变标准输出流的输出方向吗?可以
        /*
        这些是之前System类使用过的方法和属性
        System.gc();
        System.currentTimeMillis();
        System.exit(0);
        System.arraycopy(...);
        */

        //标准输出流不再指向控制台，指向“log”文件
        PrintStream printStream = new PrintStream(new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\PrintStream\\log"));
        //修改输出方向，将输出方向修改到“log”文件
        System.setOut(printStream);
        //再输出
        System.out.println("hello world");
        System.out.println("我是中国人！");
        System.out.println("我是一名java工程师！");

    }
}

```

#### 日志工具类的编写：

##### Logger：

```java
package com.IO流.标准输出流.日志工具;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 日志工具
* */
public class Logger {
    /*
    * 记录日志的方法
    * */
    public static void log(String msg){
        try {
            //标准字节输出指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\PrintStream\\log.txt",true));
            //修改输出方向
            System.setOut(out);
            //获取系统当前时间
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
            String strTime = sdf.format(nowTime);
            System.out.println(strTime+"："+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

##### LogTest:

```java
package com.IO流.标准输出流.日志工具;
/*
* 日志工具类测试
* */
public class LogTest {
    public static void main(String[] args) {
        //测试日志工具类
        Logger.log("调用了System类的gc()方法，建议启动垃圾回收");
        Logger.log("调用了UserService的doSome()方法");
        Logger.log("用户尝试进行登入，验证失败！");
    }
}

```

#### File类的理解：

##### FileTest01:

```java
package com.IO流.File;

import java.io.File;
import java.io.IOException;

/*
* File
*       1、File类和流的四大家族没有关系，所以File类不能完成文件的读和写
*       2、File对象代表什么？
*           文件和路径名的抽象表示形式。
*           一个File对象有可能对应的是目录，也可能是文件。
*       3、需要掌握File类中的常用方法
* */
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        //创建一个File对象
        File f1 = new File("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\File\\file");

        //判断file对象是否存在
        System.out.println(f1.exists());

        //如果C:\Users\86187\Desktop\Java\java\JavaIOFile\File\file不存在
        //以文件的形式创建出来
        /*if (!f1.exists()){
            f1.createNewFile();
        }*/

        //如果C:\Users\86187\Desktop\Java\java\JavaIOFile\File\file不存在
        //以目录的形式创建出来
        /*if (!f1.exists()){
            f1.mkdir();
        }*/
        //可以创建多重目路吗？
        File f2 = new File("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\File\\a\\b\\c");
        if (!f2.exists()){
            f2.mkdir();
        }

        //获取文件的父路径
        File f3 = new File("C:\\Users\\86187\\Desktop\\Java\\java\\JavaIOFile\\File");
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径："+parentFile.getAbsolutePath());
        File f4 = new File("copy1.java");
        System.out.println("绝对路径："+f4.getAbsolutePath());
    }
}

```

##### FileTest02:

```java
package com.IO流.File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* File类的常用方法
* */
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\86187\\Desktop\\Java\\java\\javase_code\\src\\com\\IO流\\File\\FileTest02.java");

        //获取文件名
        System.out.println("文件名："+f1.getName());

        //判断是否是一个目录
        System.out.println(f1.isDirectory());

        //判断是否是一个文件
        System.out.println(f1.isFile());

        //获取文件最后一次修改时间。（毫秒）
        long haoMiao = f1.lastModified();//这个毫米是从1970年到现在的总毫米数
        Date time = new Date(haoMiao);//将毫秒数转换成日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        //获取文件的大小(字节)
        System.out.println(f1.length());

    }
}

```

##### FileTest03:

```java
package com.IO流.File;

import java.io.File;

/*
* File中的listFiles方法
* */
public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles()
        //获取当前目录下的所有的子文件/子目录
        File f = new File("C:\\Users\\86187\\Desktop\\Java\\java");
        File[] files = f.listFiles();
        for (File file:files){
            //System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }
    }
}

```

#### 目录拷贝：

```java
package com.IO流.目录拷贝;

import java.io.*;

/*
* 拷贝目录
* */
public class CopyAll {
    public static void main(String[] args) {
        //拷贝源
        File srcFile = new File("C:\\Users\\86187\\Desktop\\Java\\java\\javase_code\\src\\com\\IO流");
        //拷贝目标
        File destFile = new File("C:\\Users\\86187\\Desktop\\Java\\java\\IO流");
        //调用拷贝方法
        copyDir(srcFile,destFile);

    }

    /**
     * 拷贝目录
     * @param srcFile   拷贝源
     * @param destFile  拷贝目标
     */
    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()){
            //srcFile如果是一个文件的话，递归结束
            //是文件的时候拷贝文件
            //一边读一边写
            FileInputStream in = null;
            FileOutputStream out =null;
            try {
                //读文件
                in = new FileInputStream(srcFile);
                //写文件
                String path = (destFile.getAbsolutePath().endsWith("\\")?destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\")+srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);
                byte[] bytes = new byte[1024*1024];//一次复制1MB
                int readCount = 0;
                while ((readCount = in.read(bytes))!=-1){
                    out.write(bytes,0,readCount);
                }
                //输出流刷新
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in!=null){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out!=null){
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        //获取源下面的子目录（包括文件）
        File[] files = srcFile.listFiles();
        for (File file:files){
            //获取所有文件的（包括目录和文件）绝对路径
            //System.out.println(file.getAbsolutePath());
            if (file.isDirectory()){
                //新建对应的目录
                //System.out.println(file.getAbsolutePath());
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\")?destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\")+srcDir.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            //递归调用
            copyDir(file,destFile);
        }
    }
}

```

#### 对象的序列化和发序列化：

![](C:\Users\86187\Desktop\Java\java截图\IO流\对象的序列化和反序列化.png)

##### 一个java对象

```java
package com.IO流.对象专属流;

import java.io.Serializable;

public class Student implements Serializable {
    //java虚拟机看到Serializable接口之后，会自动生成一个序列化版本号。
    //这里没有手动写出来，java虚拟机会默认提供这个序列化版本号

    private int no;
    private String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}

```

##### 对其进行序列化：ObjectOutputStream:

```java
package com.IO流.对象专属流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* ObjectOutputStream:实现java对象序列化
* ObjectInputStream：实现java对象反序列化
*
* 注意：
*   参与序列化和反序列化的对象，必须实现Serializable接口
*   通过源码发现，Serializable接口只是一个标志接口：
*   public interface Serializable{
*   }
*   这个接口当中什么代码都没有。那么它起到一个什么作用呢？
*       起到标识的作用，标志的作用，java虚拟机看到这个类实现了接口，可能会对这个类进行特殊待遇。
*       Serializable这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口之后，会为该类自动生成
*       一个序列化版本号
*   序列化版本号有什么用呢？
* */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        //创建java对象
        Student student = new Student(111,"张山");
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        //序列化对象
        oos.writeObject(student);

        //刷新
        oos.flush();
        //关闭
        oos.close();
    }
}

```

##### 对其进行反序列化：ObjectInputStream：

```java
package com.IO流.对象专属流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
* ObjectInputStream:
*   反序列化
* */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        //开始反序列化，读
        Object object = ois.readObject();
        System.out.println(object);
        ois.close();
    }
}

```

#### 对多个对象进行序列化：

##### User:

```java
package com.IO流.对象专属流;

import java.io.Serializable;

public class User implements Serializable {
    private int no;
    //transient关键字表示游离的，不参与序列化
    private tString name;

    public User() {
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}

```

##### ObjectOutputStreamTest02:

```java
package com.IO流.对象专属流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
* 如何一次序列化多个对象
*   可以将对象放入集合当中；序列化集合
* 提示：
*   参与序列化的ArrayList集合以及集合中的元素User对象都需要实现Serializable接口
* */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws IOException {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"张三"));
        userList.add(new User(2,"李四"));
        userList.add(new User(3,"王五"));
        userList.add(new User(4,"赵六"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));
        oos.writeObject(userList);
        oos.flush();
        oos.close();
    }
}

```

##### ObjectInputStreamTest02:

```java
package com.IO流.对象专属流;

import java.io.*;
import java.util.List;

/*
* 反序列化集合
* */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users"));
        List<User> userList = (List<User>)ois.readObject();//向下转型
        for (User user:userList){
            System.out.println(user);
        }
        ois.close();
    }
}

```

#### IO+Properties联合使用

IO流：文件的读和写

Properties：是一个Map集合，key和value都是String类型。

##### IoPropertiesTest01:

```java
package com.IO流.IoProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
* IO+Properties的联合应用.
* 非常好的一个设计理念：
*   以后经常改变的数据，可以单独写到一个文件中，使用程序动态读取。
*   将来只需要修改这个文件的内容，java代码不需要改动，不需要重新编译，
*   服务器也不需要重启。就可以拿到动态的信息。
*
*   类似于以上机制的这种文件被称为配置文件。
*   并且当配置文件中的内容格式是：
*       key1=value
*       key2=value
*   的时候，我们把这种配置文件叫做属性配置文件。
*   java规范中有要求：属性配置文件建议以.properties结尾，但这不是必须的。
*   这种以.properties结尾的文件在java中被称为：属性配置文件。
*   其中Properties是专门存放属性配置文件内容的一个类
*
* */
public class IoPropertiesTest01 {
    public static void main(String[] args) {
        /*
        * Properties是一个Map集合，key和value都是String类型
        * 想将userinfo文件中的数据加载到Properties对象当中。
        * */
        //新建一个输入流对象
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\86187\\Desktop\\Java\\java\\javase_code\\userinfo.properties");
            //新建一个Map集合
            Properties pro = new Properties();

            //调用Properties对象的load方法将文件中的数据加载到Map集合中.
            //文件中的数据顺着管道加载到Map集合中，其中等号=左边作key，右边作value
            pro.load(fis);

            //通过key来获取value
            String username = pro.getProperty("username");
            System.out.println(username);

            String password = pro.getProperty("password");
            System.out.println(password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
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

配置文件：userinfo

```java
username=admin
################ 在属性配置文件中“#”是注释 ############################
#password=111   key值重复，value覆盖
password=123
```

