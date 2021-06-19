#### 打开CMD的方式

1. 开始+系统+命令提示符
2. Win键+R  输入CMD打开控制台
3. 在任意的文件夹下面，按住shift键+鼠标右键点击，在此处打开命令行窗口
4. 资源管理器的地址栏前面加上 cmd 路径

管理员身份运行：开始+系统+命令提示符  右键点击以管理员身份运行



#### 常用的Dos命令：

```bash
#盘符切换  如进入D盘 D:
#查看当前目录下 dir
#切换目录 cd
	cd..  返回上一级目录
	cd /d E:  跨盘符切换
	cd 目录名  进入该目录
#清理屏幕 cls (clear screen)
#退出终端 exit
#查看电脑ip ipconfig
#打开应用
	calc 打开计算器
	mspaint	打开画板
	notepad	打开记事本
#ping命令查看网站IP地址 如ping www.baidu.com
#文件操作
	md  创建目录
	rd  删除目录
	cd>	创建文件
	del	删除文件
	
```



#### Java:高可用，高性能，高并发



#### Java特性和优势

* 简单性
* 面向对象
* 可移植性
* 高性能
* 分布式
* 动态性
* 多线程
* 安全性
* 健壮性

#### Java三大版本

* Write Once，Run Anywhere
* JavaSE：标准版（桌面程序，控制台开发...）【基础，核心】
* JavaME：嵌入式开发（手机，小家电...）【了解】
* **JavaEE：企业级开发（web端，服务器开发...）**【进阶】



#### JDK、JRE、JVM

* JDK:Java Development Kit
* JRE:Java Runtime Environment
* JVM:Java Virtual Machin

#### 第一个程序：Hello World

1. 随便新建一个文件夹，存放代码
2. 新建一个Java文件
   * 文件后缀名为.java
   * Hello.java

```java
public class Hello{
	public static void main(String[] args){
		System.out.print("Hello World!");
	}
}
```

3. 当前文件目录下输入命令行
   * javac Hello.java
   * java Hello
4. 注意事项：
   * 每个单词的大小写不能出现问题，**Java是大小写敏感的**
   * 尽量使用英文
   * 文件名和类名必须保证一致，并且首字母大写
   * 注意符号中英文使用是否错误

