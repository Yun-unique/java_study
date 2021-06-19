## GUI编程：

**组件：**

* 窗口
* 弹窗
* 面板
* 文本框
* 列表框
* 按钮
* 图片
* 监听事件
* 鼠标
* 键盘事件

### 1、简介

GUI的核心技术：Swing	AWT

不流行的原因：

​	1、因为界面不美观

​	2、需要jre环境

为什么我们要学习？

​	1、可以写出自己心中想要的一些小工具（可以写破解工具）

​	2、工作时，也可能需要维护到swing界面，概率很小

​	3、了解MVC架构，了解监听

​	

### 2、AWT

#### 2.1、Awt介绍

1. 包括了很多类和接口！GUI！
2. 元素：窗口，按钮，文本框
3. java.awt
4. ![](C:\Users\86187\Desktop\Java\GUI编程入门\截图\组件.png)

#### 2.2、组件和容器

##### 1、Frame	框架、界面

###### 单个界面：

```java
package com.lesson01;

import java.awt.*;

//GUI的第一个界面
public class TestFrame01 {
    public static void main(String[] args) {

        //Frame,JDK,看源码！
        Frame frame = new Frame("我的第一个Java图像界面窗口");

        //需要设置可见性
        frame.setVisible(true);

        //设置窗口大小    size
        frame.setSize(400,400);

        //设置背景颜色    color
        frame.setBackground(new Color(85,150,68));

        //弹出的初始位置
        frame.setLocation(200,200);

        //设置大小固定
        frame.setResizable(false);
    }
}
```

![](C:\Users\86187\Desktop\Java\GUI编程入门\截图\Frame界面1.png)

问题：因为没设置窗口关闭监听，关不掉可以停止Java程序！

###### 多个界面：

```java
package com.lesson01;

import java.awt.*;

//设置多个窗口
public class TestFrame02 {
    public static void main(String[] args) {
        new MyFrame(100,100,200,200,Color.blue);
        new MyFrame(300,100,200,200,Color.red);
        new MyFrame(100,300,200,200,Color.green);
        new MyFrame(300,300,200,200,Color.black);
    }
}

class MyFrame extends Frame{
    static int id = 0;//要设置多个窗口，需要一个计数器

    public MyFrame(int x,int y,int w,int h,Color color){//构造器
        super("MyFrame+"+(++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);
        setResizable(false);
    }
}
```

![](C:\Users\86187\Desktop\Java\GUI编程入门\截图\Frame界面2.png)



##### 2、Panel	面板

加了监听事件，可以关闭窗口

```java
package com.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//panel:面板  可以看成是一个空间，但是不能单独存在，需要在Frame上面
public class TestPanel {
    public static void main(String[] args) {

        Frame frame = new Frame();

        //布局(layout)的概念
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(40,161,35));

        //panel设置坐标，相对于frame
        panel.setBounds(50,50,200,200);
        panel.setBackground(new Color(193,15,60));

        //frame.add(panel)
        frame.add(panel);
        frame.setVisible(true);

        //监听事件，监听窗口关闭事件     System.exit(0)
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
```

![](C:\Users\86187\Desktop\Java\GUI编程入门\截图\Panel.png)

##### 3、布局管理器

* 流式布局(FlowLayout)

```java
package com.lesson01;

import java.awt.*;

//流式布局
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setTitle("设置按钮");

        //组件-按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        //设置流式布局
        frame.setLayout(new FlowLayout());//默认居中
        //frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        //frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.setSize(200,200);

        //把按钮添加上去
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
    }
}
```

![](C:\Users\86187\Desktop\Java\GUI编程入门\截图\流式布局.png)

* 东西南北中(BorderLayout)

```java
package com.lesson01;

import java.awt.*;

//东西南北中
//border:边界
public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestBorderLayout");

        Button east = new Button("East");
        Button west = new Button("West");
        Button south = new Button("South");
        Button north = new Button("North");
        Button center = new Button("Center");

        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
```

![](C:\Users\86187\Desktop\Java\GUI编程入门\截图\东西南北中.png)

* 表格布局(GridLayout)

```java
package com.lesson01;

import java.awt.*;

//表格布局
public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestGridLayout");

        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        Button btn6 = new Button("btn6");

        frame.setLayout(new GridLayout(3,2));

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);

        frame.pack();
        frame.setVisible(true);
    }
}
```

![](C:\Users\86187\Desktop\Java\GUI编程入门\截图\表格布局.png)

* 布局综合测试

```java
package com.lesson01;

import java.awt.*;

//练习复杂的布局
public class TestDemon {
    public static void main(String[] args) {
        
        Frame frame = new Frame();

        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setLocation(300,400);
        frame.setBackground(Color.BLACK);
        frame.setLayout(new GridLayout(2,1));

        //4个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));

        //上面
        p1.add(new Button("East-1"),BorderLayout.EAST);
        p1.add(new Button("West-1"),BorderLayout.WEST);
        p2.add(new Button("p2-btn-1"));
        p2.add(new Button("p2-btn-2"));
        p1.add(p2,BorderLayout.CENTER);

        //下面
        p3.add(new Button("East-2"),BorderLayout.EAST);
        p3.add(new Button("West-2"),BorderLayout.WEST);

        //下面中间
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("p4-btn-"+i));
        }
        p3.add(p4,BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);
    }
}
```

![](C:\Users\86187\Desktop\Java\GUI编程入门\截图\布局综合测试.png)

##### 4、事件监听

事件监听：当某个事件发生的时候，要干什么？

```java
package com.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent02 {
    public static void main(String[] args) {
        //两个按钮，实现同一个监听
        //开始    停止
        Frame frame = new Frame();
        Button button1 = new Button("Start");
        Button button2 = new Button("Stop");

        //可以显示的定义触发会返回的命令，如果不显示定义，则会走默认的值！
        //可以写多个按钮只写一个监听类
        button2.setActionCommand("button2-stop");//command:命令、指令

        MyMonitor myMonitor = new MyMonitor();

        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

class MyMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //获取按钮的信息
        System.out.println("按钮被点击了：msg"+actionEvent.getActionCommand());
    }
}
```

##### 5、输入框TextField监听

```java
package com.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestText01 {
    public static void main(String[] args) {
        //启动！
        new MyFrame();
    }
}

class MyFrame extends Frame{

    public MyFrame(){
        TextField textField = new TextField();//field：域
        add(textField);

        //监听这个文本框输入的文字
        MyActionListener2 myActionListener2 = new MyActionListener2();
        //按下enter，就会触发这个输入框的事件
        textField.addActionListener(myActionListener2);

        //设置替换编码（密码的应用，输入的内容被*替代）
        //textField.setEchoChar('*');

        setVisible(true);
        pack();//自适应大小

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionListener2 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TextField field = (TextField)actionEvent.getSource();//获得一些资源,返回的一个对象
        System.out.println(field.getText());//获得输入框中的文本
        field.setText("");//输入内容后回车，清空输入框
    }
}
```



##### 6、简单计算器，组合+内部类回顾复习

**oop原则：组合，大于继承**

**代码1：**

```java
package com.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//简易计算器
public class TestCalculator {
    public static void main(String[] args) {
        new Calculator();
    }
}

//计算器类
class Calculator extends Frame {
    public Calculator(){
        //3个文本框
        TextField textField1 = new TextField();
        TextField textField2= new TextField();
        TextField textField3 = new TextField();

        //1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener(textField1,textField2,textField3));

        //1个标签
        Label label = new Label("+");

        //布局
        setLayout(new FlowLayout());//流式布局

        //组合
        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        //自适应大小
        pack();

        //设置可见
        setVisible(true);

        //监听关闭
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

//监听器类
class MyCalculatorListener implements ActionListener{

    //获取三个变量
    private TextField textField1,textField2,textField3;

    public MyCalculatorListener(TextField textField1, TextField textField2, TextField textField3) {
        this.textField1 = textField1;
        this.textField2 = textField2;
        this.textField3 = textField3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //1.获得加数和被加数
        int n1 = Integer.parseInt(textField1.getText());
        int n2 = Integer.parseInt(textField2.getText());

        //2.将这个值+法运算后，放到第三个框
        textField3.setText(""+(n1+n2));

        //3.清楚前两个框
        textField1.setText("");
        textField2.setText("");
    }

}
```

**代码2：加入组合的方式**

```java
package com.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//简易计算器
//使用组合的方式
public class TestCalculator2 {
    public static void main(String[] args) {
        new Calculator2().loadFrame();
    }
}

//计算器类
class Calculator2 extends Frame {

    TextField textField1,textField2,textField3;

    public void loadFrame(){
        //3个文本框
        textField1 = new TextField(10);
        textField2 = new TextField(10);
        textField3 = new TextField(20);

        //1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener2(this));

        //1个标签
        Label label = new Label("+");

        //布局
        setLayout(new FlowLayout());//流式布局

        //组合
        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        //自适应大小
        pack();

        //设置可见
        setVisible(true);

        //监听关闭
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}

//监听器类
class MyCalculatorListener2 implements ActionListener{

    //获取计算器这个对象，在一个类中组合另外一个类
    Calculator2 calculator2 = null;

    public MyCalculatorListener2(Calculator2 calculator2) {
        this.calculator2 = calculator2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n1 = Integer.parseInt(calculator2.textField1.getText());
        int n2 = Integer.parseInt(calculator2.textField2.getText());

        calculator2.textField3.setText(""+(n1+n2));

        calculator2.textField1.setText("");
        calculator2.textField2.setText("");
    }

}
```

**代码3：使用内部类**

* 更好的包装
* 使用内部类最大的好处，就是可以畅通无阻的访问外部类的属性和方法

```java
package com.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//简易计算器
//使用内部类:内部类最大的好处，就是可以畅通无阻的访问外部类的属性和方法
public class TestCalculator3 {
    public static void main(String[] args) {
        new Calculator2().loadFrame();
    }
}

//计算器类
class Calculator3 extends Frame {

    TextField textField1,textField2,textField3;

    public void loadFrame(){

        textField1 = new TextField(10);
        textField2 = new TextField(10);
        textField3 = new TextField(20);

        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener3());

        Label label = new Label("+");

        setLayout(new FlowLayout());//流式布局

        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        pack();

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //监听器类
    private class MyCalculatorListener3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int n1 = Integer.parseInt(textField1.getText());
            int n2 = Integer.parseInt(textField2.getText());
            textField3.setText(""+(n1+n2));
            textField1.setText("");
            textField2.setText("");
        }
    }
}
```

##### 7、画笔

```java
package com.lesson03;

import java.awt.*;

//画笔
public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame {

    public void loadFrame(){
        setBounds(200,200,600,500);
        setVisible(true);
    }

    //画笔
    @Override
    public void paint(Graphics g) {
        //画笔颜色
        g.setColor(Color.red);
        //g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100);

        g.setColor(Color.green);
        g.fillRect(150,200,200,200);
        //养成习惯，画笔用完，将它还原为最初的颜色
    }
}
```

##### 8、鼠标监听

目的：实现鼠标画画

```java
package com.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

//鼠标监听事件
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

class MyFrame extends Frame{
    //画画需要画笔，需要监听鼠标当前位置，需要集合来存储这个点
    ArrayList points;

    public MyFrame(String title) {
        super(title);
        setBounds(200,200,400,300);

        //存鼠标点击的点
        points = new ArrayList<>();

        //鼠标监听器，针对这个窗口
        this.addMouseListener(new MyMouseListener());

        setVisible(true);

        windowListener(this);
    }

    public void windowListener(MyFrame myFrame){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标事件
        Iterator iterator = points.iterator();
        while (iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.green);
            g.fillOval(point.x,point.y,10,10);
        }
    }

    //添加一个点到界面上
    public void addPaint(Point point){
        points.add(point);
    }

    //用适配器模式
    private class MyMouseListener extends MouseAdapter {
        //鼠标：按下，弹起，按住不放三种动作

        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame)e.getSource();
            //我们点击的时候，就会在界面上产生一个点！画
            //这个点就是鼠标的点
            myFrame.addPaint(new Point(e.getX(),e.getY()));

            //每次点击鼠标都需要重新画一次
            myFrame.repaint();//刷新
        }
    }
}
```

![](C:\Users\86187\Desktop\Java\GUI编程入门\截图\鼠标监听_画图.png)

##### 9、窗口监听

```java
package com.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame{
    //构造器用来初始化
    public WindowFrame(){
        setBackground(Color.blue);
        setBounds(100,100,200,200);
        setVisible(true);
        //addWindowListener(new MyWindowListener());
        this.addWindowListener(
                //匿名内部类
                new WindowAdapter() {
            //关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("winClosing");
                System.exit(0);
            }
            //激活窗口
            @Override
            public void windowActivated(WindowEvent e) {
                WindowFrame source = (WindowFrame)e.getSource();
                source.setTitle("被激活了");
                System.out.println("windowActivated");
            }
        });
    }
}
```

##### 10、键盘监听

```java
package com.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//键盘监听
public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame {
    public KeyFrame(){
        setBounds(1,2,300,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            //键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                //获得键盘按下的键是哪一个
                int keyCode = e.getKeyCode();
                //System.out.println(keyCode);
                if (keyCode==KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }
                //根据按下不同的键位，产生不同的结果
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
```

### 3、Swing:比AWT更高级

#### 3.1、窗口、面板

```java
package com.lesson04;

import javax.swing.*;

//Swing
public class JframeDemon {
    //init();初始化
    public void init(){
        JFrame jf = new JFrame("这是一个Jframe窗口");
        jf.setVisible(true);
        jf.setBounds(100,100,200,200);

        //设置文字：JLabel
        JLabel label = new JLabel("哈哈");
        jf.add(label);

        //关闭事件
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        //建立一个窗口
        new JframeDemon().init();
    }
}
```

标签居中：

```java
package com.lesson04;

import javax.swing.*;
import java.awt.*;

public class JframeDemon02 {
    public static void main(String[] args) {
        new MyJframe2().init();
    }
}

class MyJframe2 extends JFrame{
    public void init(){
        this.setTitle("Jframe窗口");
        this.setBounds(10,10,200,300);
        this.setVisible(true);

        JLabel label = new JLabel("哈哈哈");
        this.add(label);

        //让文本标签居中，设置水平对其
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //获得一个容器，可以对其添加颜色
        Container container = this.getContentPane();
        container.setBackground(Color.YELLOW);
    }
}
```

#### 3.2、弹窗	dialog

JDialog,用来设置弹窗，默认有关闭事件

```java
package com.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//主窗口
public class DialogDemon extends JFrame {
    public static void main(String[] args) {
        new DialogDemon();
    }

    public DialogDemon(){
        this.setVisible(true);
        this.setSize(700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JFrame    放东西，容器
        Container container = this.getContentPane();
        //绝对布局
        container.setLayout(null);

        //按钮
        JButton button = new JButton("点击弹出一个对话框");//创建
        button.setBounds(30,30,200,50);

        //点击这个按钮的时候，弹出一个弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //弹窗
                new MyDialogDemon();
            }
        });

        container.add(button);
    }
}

//弹窗窗口
class MyDialogDemon extends JDialog{
    public MyDialogDemon() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.add(new JLabel("秦老师带你学java",SwingConstants.CENTER));
    }
}
```

#### 3.3、标签

文本标签：JLabel

```java
new JLabel("xxx");
```

图标标签：ICON

```java
package com.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

//图片标签
public class ImageIconDemon extends JFrame {
    public static void main(String[] args) {
        new ImageIconDemon();
    }
    public ImageIconDemon(){
        //获取图片的地址
        JLabel label = new JLabel("ImageIcon");
        URL url = ImageIconDemon.class.getResource("tt.jpg");

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setBounds(100,100,200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
```

#### 3.4、面板

**JPanel:**

```java
package com.lesson05;

import javax.swing.*;
import java.awt.*;

public class JPanelDemon extends JFrame {
    public JPanelDemon(){
        Container container = this.getContentPane();

        container.setLayout(new GridLayout(2,1,10,10));

        JPanel panel1 = new JPanel(new GridLayout(1,3));
        JPanel panel2 = new JPanel(new GridLayout(1,2));
        JPanel panel3 = new JPanel(new GridLayout(2,1));

        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));

        panel2.add(new JButton("2"));
        panel2.add(new JButton("2"));

        panel3.add(new JButton("3"));
        panel3.add(new JButton("3"));

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JPanelDemon();
    }
}
```

**JScrollPane:**

```java
package com.lesson05;

import javax.swing.*;
import java.awt.*;

public class JScrollDemon extends JFrame {
    public JScrollDemon(){
        Container container = this.getContentPane();

        //文本域
        JTextArea textArea = new JTextArea(20,50);
        textArea.setText("欢迎学习狂神说java");

        //JScroll面板
        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,300,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemon();
    }
}
```

#### 3.5、按钮

**图片按钮：**

```java
package com.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

//用Swing需要设置容器Container
public class JButtonDemon01 extends JFrame {

    public JButtonDemon01(){
        Container container = this.getContentPane();
        //将一个图片变为图标
        URL url = JButtonDemon01.class.getResource("tt.jpg");
        Icon icon = new ImageIcon(url);

        //把这个图标放在按钮上
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");

        container.add(button);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new JButtonDemon01();
    }
}
```

**单选按钮**：

```java
package com.lesson05;

import javax.swing.*;
import java.awt.*;

//单选按钮
public class JButtonDemon02 extends JFrame {

    public JButtonDemon02(){
        Container container = this.getContentPane();

        //单选框
        JRadioButton radioButton1 = new JRadioButton("JRadioButton1");
        JRadioButton radioButton2 = new JRadioButton("JRadioButton2");
        JRadioButton radioButton3 = new JRadioButton("JRadioButton3");

        //由于单选框只能选择一个，分组，一个组中只能选择一个,不分组就可以都选上
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        container.add(radioButton1,BorderLayout.NORTH);
        container.add(radioButton2,BorderLayout.CENTER);
        container.add(radioButton3,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonDemon02();
    }
}
```

**复选按钮:**

```java
package com.lesson05;

import javax.swing.*;
import java.awt.*;
//复选按钮
public class JButtonDemon03 extends JFrame {

    public JButtonDemon03(){
        Container container = this.getContentPane();

        //多选框
        JCheckBox jCheckBox1= new JCheckBox("jCheckBox1");
        JCheckBox jCheckBox2= new JCheckBox("jCheckBox2");

        container.add(jCheckBox1,BorderLayout.NORTH);
        container.add(jCheckBox2,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemon03();
    }
}
```

#### 3.6、列表

* 下拉框

```java
package com.lesson06;

import javax.swing.*;
import java.awt.*;

//下拉框
public class TestComboboxDemon01 extends JFrame {
    public TestComboboxDemon01(){
        Container container = this.getContentPane();

        JComboBox jComboBox = new JComboBox();

        jComboBox.addItem(null);
        jComboBox.addItem("正在热映");
        jComboBox.addItem("已下架");
        jComboBox.addItem("即将上映");

        container.add(jComboBox);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboboxDemon01();
    }
}
```

* 列表框

```java
package com.lesson06;

import com.lesson02.TestCalculator2;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

//列表框
public class TestComboboxDemon02 extends JFrame {
    public TestComboboxDemon02(){
        Container container = this.getContentPane();
        
        //生成列表的内容
        //String[] contents = {"1","2","3"};//静态数据

        Vector contents = new Vector();//生成动态数据

        //列表中需要放入内容
        JList jList = new JList(contents);

        contents.add("张三");
        contents.add("李四");
        contents.add("王二");

        container.add(jList);

        this.setVisible(true);
        this.setSize(200,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboboxDemon02();
    }
}
```

应用场景：

1. 选择地区，或者一些单个选项
2. 列表，展示信心，一般是动态扩容

#### 3.7、文本框

* 文本框

```java
package com.lesson06;

import javax.swing.*;
import java.awt.*;

//文本框
public class TestTextDemon01 extends JFrame {
    public TestTextDemon01(){
        Container container = this.getContentPane();

        JTextField textField = new JTextField("hello");
        JTextField textField1 = new JTextField("world",20);

        container.add(textField,BorderLayout.NORTH);
        container.add(textField1,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemon01();
    }
}
```

* 密码框

```java
package com.lesson06;

import javax.swing.*;
import java.awt.*;
//密码框
public class TestTextDemon02 extends JFrame {
    public TestTextDemon02(){
        Container container = this.getContentPane();

        JPasswordField jPasswordField = new JPasswordField();//******
        jPasswordField.setEchoChar('*');

        container.add(jPasswordField);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemon02();
    }
}
```

* 文本域

```java
package com.lesson05;

import javax.swing.*;
import java.awt.*;
//scroll:滚动
public class JScrollDemon extends JFrame {
    public JScrollDemon(){
        Container container = this.getContentPane();

        //文本域
        JTextArea textArea = new JTextArea(20,50);
        textArea.setText("欢迎学习狂神说java");

        //JScroll面板
        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,300,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemon();
    }
}
```

### 贪吃蛇:

帧，如果时间片足够小，就是动画，一秒30帧、30帧，连起来就是动画，拆开就是静态的图片

需要掌握的内容：

键盘监听

定时器Timer



