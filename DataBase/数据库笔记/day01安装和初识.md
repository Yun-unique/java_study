# 1、数据库：

## 1、初识MySQL

JavaEE：企业级Java开发 web

前端（页面：展示，数据！）

后台（连接点：连接数据库JDBC，链接前端（控制，控制视图跳转，和给前端传递数据））

数据库（存数据，Txt，Excel，word）

---

### 1.1、为什么学习数据库

1、岗位需求

2、现在的世界，大数据时代，的数据库者得天下

3、被迫需求：存数据

==4、数据库是所有软件体系中最核心得存在==  DBA

---

### 1.2、什么是数据库

数据库（DB，Database）

概念：数据仓库，软件，安装在操作系统(window,linux,mac...)之上!SQL,可以存储大量得数据

作用：存储数据，管理数据

---

### 1.3、数据库分类

关系型数据库：

* MySQL,Oracle,Sql Server,DB2,SQLlite
* 通过表和表之间，行和列之间的关系进行数据的存储

非关系型数据库：

* Redis,MongDB
* 非关系型数据库，对象存储，通过对象的自身属性来决定

==DBMS(数据库管理系统)==

* 数据库的管理软件，科学有效的管理我们的数据。维护和获取数据；
* MySQL，数据库管理系统！

### 1.4、sql、DB、DBMS分别是什么、它们之间的关系？

DB:

​	DataBase（数据库，数据库实际上在硬盘上以文件的形式存在）

DBMS：

​	DataBase Management System（数据库管理系统，常见的有：

​	MySQL、Oracle、 DB2、Sybase、SqlServer... ）

SQL： 

​	结构化查询语言，是一门标准通用的语言。标准的sql适合于所有的数据库产品。

​	SQL属于高级语言。只要能看懂英语单词的，写出来的sql语句，可以读懂什么意思。

​	SQL语句在执行的时候，实际上内部也会先进行编译，然会再执行sql。（sql语句的编译由DBMS完成）

**DBMS负责执行sql语句，通过执行sql语句来操作DB当中的数据。**

**DBMS-（执行）->SQL-（操作）->DB**

---

### 1.5、MySQL简介

MySQL是一个**关系型数据库管理系统**

前世：瑞典[MySQL AB]()公司

今生：属于*[Oracle]()*旗下产品

MySQL是最好的[RDBMS](Relational Database Management System,关系数据库管理系统)应用软件之一。

开源的数据库软件

体积小、速度快、总体拥有成本低，招人成本比较低，所有人必须会

中小型网站、或者大型网站，集群

官网：[https://www.mysql.com]()

### 1.6、安装MySQL 

### 1.7、安装SQLyog

### 1.8、连接数据库

**命令行连接**

```sql
--1、启动mysql
net start mysql

--2、连接数据库
mysql -u root -p

--3、修改用户密码
update mysql.user set authentication_string=password('10191x') where user='root' and Host='localhost';	

--4、刷新权限
flush privileges;		

------------------------------------
--所有的语句都使用;结尾

--5、查看所有的数据库
show databases;	

--6、切换到school数据库，成功显示Database changed
use school;			

--7、查看数据库中所有的表
show tables;		

--8、查看数据库中student表的信息
describe student;

--9、创建一个数据库名为teacher
create database teacher;

--10、推出数据库连接
exit;

--11、单行注释（sql的本来的注释）
--
--12、
/*（sql的多行注释）
hello
database
*/
```



**数据库xxx语言**	CRUD 增删改查！

DDL	定义

DML	操作

DQL	查询

DCL	控制

---



## 2、操作数据库

操作数据库>操作数据库中的表>操作数据库中的表的数据

==mysql==

### 2.1、操作数据库

1、创建数据库

```sql
CREATE DATABASE [IF NOT EXISTS] westos;
```

2、删除数据库

```sql
DROP DATABASE [IF EXISTS] westos;
```

3、使用数据库

```sql
USE `school`;--如果表名或字段名是一个特殊字符，就需要带``
```

4、查看所有的数据库

```sql
SHOW DATABASES;--查看所有的数据库
```

### 2.2、数据库的列类型

> 数值

* tinyint	十分小的数据	1个字节
* smallint   较小的数据      2个字节
* mediumint  中等大小的数据  3个字节
* **int          标准的整数       4个字节   常用的**
* big          较大的数据       8个字节
* float       浮点数             4个字节
* double    浮点数            8个字节
* decimal   字符串形式的浮点数

> 字符串

* char	字符串固定大小的 	0~255
* **varchar  可变字符串       0~65535**      常用的
* tinytext     微型文本         2^8-1
* **text          文本串             2^16-1**           保存大文本

> 时间日期

java中	java.util.Date

* date	YYYY-MM-DD	日期格式
* time    HH:mm:ss          时间格式
* **datetime     YYYY-MM-DD   HH:mm:ss  最常用的时间格式**
* **timestamp    时间戳，1970.1.1到现在的毫秒数！**
* year   年份表示

> null

* 没有值，未知
* ==注意，不要使用NULL进行运算，结果为NULL==



### 2.3、数据库的字段属性（重点）

==Unsigned==:

* 无符号的整数
* 声明了该列不能取负数的值

==zerofill==：

* 0填充的
* 不足的位数，使用0来填充

==自增==：

* 自动在上一条记录的基础上+1（默认）
* 通常用来设计唯一的主键，必须是整数类型
* 可以自定义设计主键的自增的起始值和步长

==非空==：

* 假设设置为非空，如果不给它赋值，就会报错
* NULL，如果不填写值，默认就是null

==默认==：

* 设置默认的值
* 如sex,设置默认值为男，如果不指定该列的值就会默认赋值为男

**拓展：**

```sql
/*每一个表，都必须存在以下五个字段！用来表示一个记录的存在意义
id	主键
`version`	乐观锁
is_delete	伪删除
gmt_create	创建时间
gmt_update	修改时间
*/
```



### 2.4、创建数据库表（命令行）

```sql
-- 目标：创建一个school数据库
-- 创建学生表（列，字段）使用SQL创建
-- 学号int，姓名varchar,登入密码vachar（20），姓名vachar（4），性别vachar（2），
-- 出生日期（datetime），家庭住址，email

-- 注意点，使用英文()，表的名称和字段尽量使用``括起来
-- auto_increment 自增
-- 字符串使用单引号或者双引号
-- 所有的语句后面加,(英文的)，最后一个不用加
-- PRIMARY KEY 主键，一般一个表只有一个唯一的主键！
CREATE TABLE IF NOT EXISTS `student`(
   `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '学号',
   `name` VARCHAR(4) NOT NULL DEFAULT '匿名' COMMENT '姓名',
   `pwd` VARCHAR(20) NOT NULL DEFAULT '123456' COMMENT '密码',
   `sex` VARCHAR(2) NOT NULL DEFAULT '女' COMMENT '性别',
   `birthday` DATETIME DEFAULT NULL COMMENT '出生日期',
   `address` VARCHAR(100) DEFAULT NULL COMMENT '家庭住址',
   `email` VARCHAR(50) DEFAULT NULL COMMENT '邮箱',
   PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8
```

![](C:\Users\86187\Desktop\Java\数据库\数据库截图\创建数据库表.png)

**格式**：

```sql
CREATE TABLE [IF NOT EXISTS] `表名`(
	`字段名` 列类型 [属性] [索引] [注释]，
    ……
    `字段名` 列类型 [属性] [索引] [注释],
    PRIMARY KEY(`字段名`)		--最后结尾不加符号
)[表类型] [字符集设置] [注释]
```

**常用命令**：

```sql
SHOW CREATE DATABASE school	-- 查看创建的数据库的语句
SHOW CREATE TABLE student	--  查看创建的表的定义语句
DESC student				-- 显示表的结构
```

### 2.5、数据表的类型

```sql
--关于数据库引擎
/*
INNODB	默认使用
MYISAM	早些年使用
*/
```

|              | MYISAM | INNODB              |
| ------------ | ------ | ------------------- |
| 事务支持     | 不支持 | 支持                |
| 数据行锁定   | 不支持 | 支持                |
| 外键约束     | 不支持 | 支持                |
| 全文索引     | 支持   | 不支持              |
| 表空间的大小 | 较小   | 较大，约为MYISAM2倍 |

常规使用操作：

* MYISAM	节约空间，速度较快
* INNODB    安全性高，事务的处理，多表多用户操作

> 在物理空间存在的位置

所有的数据库文件都存在data目录下

本质还是文件的存储！

