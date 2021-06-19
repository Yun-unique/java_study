# 2、SQL语句

## 2.1、什么是表

表：table

**表：table是数据库的基本组成单元，所有的数据都以表格的形式组织，目的是可读性强**

一个表包括行和列：

​	行：被称为数据/记录（data）

​	列：被称为字段（column）学号（int）姓名（varchar）年龄

| 学号（int） | 姓名（varchar） | 年龄 |
| ----------- | --------------- | ---- |
| 110         | 张三            | 20   |
| 120         | 李四            | 21   |

每一个字段应该包括哪些属性？

​	字段名、数据类型、相关的约束

## 2.2、MySQL语句

### 2.2.1、使用dos窗口用MySQL操作数据库

导入数据

​	第一步：登入mysql数据库管理系统

​		dos命令窗口：

​			mysql  -u root -p

​	第二步：查看有哪些数据库

​		show databases;(分号不能丢！这个不是SQL语句，属于MySQL这个软件的命令)

​	第三步：创建属于自己的数据库

​		create database bjpowernode;(这个不是SQL语句，属于MySQL的命令)

​	第四步：使用bjpowernode数据库

​		use bjpowernode;(这个不是SQL语句，属于MySQL的命令)

​	第五步：查看**当前使用的数据库**中有哪些表？

​		show tables;

​	第六步：初始化数据

​		myql>source C:\Users\86187\Desktop\Java\数据库\bjpowernode\bjpowernode.sql

注意：数据初始化完成之后，有三张表：

show tables;

+------------------------------------+
| Tables_in_bjpowernode |
+------------------------------------+
| dept                  				 |
| emp                   				|
| salgrade               			 |
+------------------------------------+

### 2.2.2、sql脚本

bjpowernode.sql,这个文件以sql结尾，这样的文件被称为“sql脚本“。什么是sql脚本呢？

当一个文件的扩展名是.sql，并且该文件中编写了大量的sql语句，我们称这样的文件为sql脚本。

**注意：直接使用source命令可以直接执行sql脚本。**

**sql脚本中的数据量太大的时候，无法打开，请使用source命令完成初始化**

### 2.2.3、删除数据库

drop database bjpowernode;

## 2.3、表结构

### 2.3.1、

bjpowernode数据库下的三张表

show tables;

+------------------------------------+
| Tables_in_bjpowernode |
+------------------------------------+
| dept                  				 |（部门表）
| emp                   				|（员工表）
| salgrade               			 |（工资等级表）
+------------------------------------+

### 2.3.2、查看表结构：desc 表名;

![](C:\Users\86187\Desktop\Java\DataBase\数据库截图\查看表结构\表结构1.png)

![](C:\Users\86187\Desktop\Java\DataBase\数据库截图\查看表结构\表结构2.png)

### 2.3.3查看表数据：select * from 表名;

![](C:\Users\86187\Desktop\Java\DataBase\数据库截图\查看表数据\表数据1.png)

![](C:\Users\86187\Desktop\Java\DataBase\数据库截图\查看表数据\表数据2.png)

### 2.3.4、MySqL常用命令(换其它DBMS软件可能不一样了)

```mysql
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

--6、创建数据库 bjpowernode
create database bjpowernode;

--7、使用数据库 bjpowernode
use bjpowernode;

--8、查看当前使用的数据库中有哪些表
show tables;

--9、初始化sql脚本文件
source C:\Users\86187\Desktop\Java\数据库\bjpowernode\bjpowernode.sql

--10、删除数据库
drop database bjpowernode;

--11、查看表结构：
desc 表名;

--12、查看表数据：
select 字段,字段2... from 表名;

--13、查询当前使用的数据库
select database();

--14、查询数据库版本
select version();

--15、终止一条语句
--如果想要终止一条正在执行的语句，可以键入\c

--16、退出mysql
exit或者\q或则ctrl+z

--17、查看其它数据库中的表
show tables from 数据库名;

--18、查看表的创建语句
show create table 表名;

--19、单行注释（sql的本来的注释）
--
--20、
/*（sql的多行注释）
hello
database
*/

```

## 2.4、SQL语句

### 2.4.1、SQL语句分类

学习MySQL主要还是学习通用的SQL语句，那么SQL语句包括增删改查，SQL语句怎么分类呢？

DQL（数据**查询**语言）：查询语句，凡是select语句都是DQL

DML（数据**操作**语言）：insert delete update，对表当中的**数据**进行增删改。

DDL（数据**定义**语言）：create drop alter，对表**结构**的增删改

TCL（**事务控制**语言）：commit提交事务，rollback回滚事务（TCL中的T是Transaction）

DCL（**数据控制**语言）：grant授权，revoke撤销权限等

### 2.4.2、简单的查询SQL语句

语法格式：

​	select 字段名1,字段名2,字段名3,...... from 表名;

提示：

​	1、任何一条sql语句以”;“结尾。

​	2、sql语句不区分大小写

查询员工的年薪？（字段可以参与数学运算）

```mysql
select ename,sal * 12 from emp;
```

+-------------+-------------+
| ename   | sal*12   |
+-------------+-------------+
| SMITH   |  9600.00 |
| ALLEN   | 19200.00|
| WARD   | 15000.00|
| JONES   |  35700.00|
| MARTIN| 15000.00 |
| BLAKE   | 34200.00 |
| CLARK   | 29400.00 |
| SCOTT   | 36000.00 |
| KING      | 60000.00 |
| TURNER| 18000.00 |
| ADAMS  | 13200.00 |
| JAMES    | 11400.00 |
| FORD     | 36000.00 |
| MILLER  | 15600.00 |
+-------------+---------------+

给查询结果的列重命名？

```mysql
select ename,sal * 12 as yearsal from emp;
```

别名中有中文？

```mysql
select ename,sal * 12 as '年薪' from emp;
```

注意：标准sql语句中要求字符串使用单引号括起来。虽然mysql支持双引号，但不建议使用。

as关键字可以省略？

```mysql
select empno,ename,sal * 12 yearsal from emp;
```

查询所有字段？

```mysql
select * from emp;//实际开发中不建议使用*，效率较低。但想看里面有哪些字段可以使用。
```

#### 2.4.2.1、条件查询

语法格式：

​	select

​			字段,字段...			**3**

​	from

​			表名						**1**

​	where

​			条件;						**2**

**执行顺序：先from,然后where,最后select**

**????**查询工资等于5000的员工姓名

```mysql
select ename from emp where sal=5000;
```

+------------+
| ename |
+------------+
| KING     |
+-------------+

**????**查询SMITH的工资

```mysql
select sal from emp where ename='SMITH';//字符串使用单引号括起来
```

+-----------+
| sal    	|
+-----------+
| 800.00 |
+------------+

**????**找出工资高于3000的员工

```mysql
select ename from emp where sal>3000;

select ename from emp where sal>=3000;//大于等于3000

select ename from emp where sal<3000;//小于3000

select ename from emp where sal<=3000;//小于等于3000

select ename from emp where sal<>3000;//不等于3000（!=也行）
```

**????**找出工资在1100和3000之间的员工，包括1100和3000？

```mysql
select ename from emp where sal>=1100 and sal<=3000;
```

或者

```mysql
select ename from emp where sal between 1100 and 3000;
```

**between ...and... 是闭区间[1100~3000] 使用时数据要左小右大**

between ...and... 除了可以使用在数字方面之外，还可以使用在字符串方面

```mysql
select ename from emp where ename between 'A' and 'C';
```

**用在字符方面左闭右开。**

**????**找出哪些员工津贴为NULL

​		在数据库中，NULL不是一个值，代表什么都没有为空

​		空不是一个值，不能用等号衡量，必须使用"is null"或者"is not null"

```mysql
select ename ,sal,comm from emp where comm is null;
```

找出哪些员工津贴不为null

```mysql
select ename,sal,comm from emp where comm is not null;
```

找出哪些员工没有津贴？

```mysql
select ename,sal,comm from emp where comm is null or comm=0;
```

**????**找出工作岗位是MANAGER和SALESMAN

```mysql
select ename,job from emp where job='MANAGER' or job='SALESMAN';//or或者
```

**????**and和or联合起来使用：找出薪资大于1000的并且部门编号是20或者30部门的员工

```mysql
select ename,sal,deptno from emp where sal>1000 and deptno=20 or deptno=30;//错误的

select ename,sal,deptno from emp where sal>1000 and (deptno=20 or deptno=30);//正确的
```

**注意：当运算符的优先级不确定的时候加小括号。**

**????**in等同于or（具体写法不同）：找出工作岗位是MANAGER和SALESMAN的员工？

```mysql
select ename,job from emp where job='MANAGER' or job='SALESMAN';

select ename,job from emp where job in('MANAGER' , 'SALESMAN');

select ename,sal from emp where sal in(800,5000);//in后面的值不是区间，是具体的值

select ename,sal from emp where sal not in(800,5000);
```

**????**模糊查询like?

​	找出名字当中含有o的？

​		（在模糊查询当中，必须掌握两个特殊的符号，一个是%，一个是_）

​			%代表任意多个字符，_代表任意1个字符

```mysql
select ename from emp where ename like '%o%'
```

​	找出名字中第二个字符是A的？

```mysql
select ename from emp where ename like '_a%';
```

​	找出名字中有下划线的？（\转义作用）

```mysql
select ename from emp where ename like '%\_%;'
```

​	找出名字中最后一个字母是T的？

```mysql
select ename from emp where ename like '%T'
```

#### 2.4.2.2、排序（升序、降序）

**????**按照工资升序，找出员工名和薪资?

```mysql
select ename,sal from emp order by sal;//默认升序
select ename,sal from emp order by sal asc;//升序
select ename,sal from emp order by sal desc;//降序

select ename,sal from emp order by 2;//不建议使用
```

**????**按照工资的降序排列，当工资相同的时候再按照名字的升序排列

```mysql
select ename,sal from emp order by sal desc,ename asc;
--注意：越靠前的字段越能起主导作用。只有当前面的字段无法完成排序的时候，才会启用后面的字段
```

**????**找出工作岗位是SALESMAN的员工，并且要求按照薪资的降序排列

select

​	ename,job,sal					**3**

from

​	emp									**1**

where

​	job='SALESMAN'		   	**2**

order by

​	sal desc;						 	**4**

**执行顺序：先from，然后where，再select,最后order by**

**最后排序输出**

```mysql
select job,sal from emp where job='SALESMAN' order by sal desc;
```

#### 2.4.2.3、分组函数？

**分组函数一共5个**

count	计数

sum	求和

avg	平均值

max	最大值

min	最小值

**记住：所有的分组函数都是对”某一组“数据进行操作的**

**分组函数还有另一个名字：多行处理函数。**

**多行处理函数的特点：输入多行，最终输出的结果是1行**

**分组函数自动忽略NULL**

**????**找出工资总和

```mysql
select sum(sal) from emp;
```

**????**找出最高工资

```mysql
select max(sal) from emp;
```

**????**找出最低工资

```mysql
select min(sal) from emp;
```

**????**找出平均工资

```mysql
select avg(sal) from emp;
```

**????**找出总人数

```mysql
select count(ename) from emp;
select count(*) from emp;
```

**==分组函数自动忽略NULL==**

```mysql
select count(comm) from emp;

--不需要额外添加过滤条件，sum函数自动忽略null，这是错误的写法，虽然不会报错，但whered
select count(comm) from emp where comm is not null;
```

==**????找出工资高于平均工资的员工**？==

**==where 后面不能写分组函数==**

```mysql
select ename,sal from emp where sal > avg(sal);
--ERROR 1111 (HY000): Invalid use of group function
--无效使用了分组函数
/*原因：SQL语句当中有一个语法规则，分组函数不可直接使用在where子句当中。。why???
怎么解释？
因为分组函数avg(sal)是在分组(group by)后才能使用的
*/
--正确语句
--第一步：找出平均工资
select avg(sal) from emp;
--第二步：找出高于平均工资的员工
select ename,sal from emp where sal>2073.214286;
--将两步结合起来就是!!!!!!!
select ename,sal from emp where sal>(select avg(sal) from emp);
```

==**count(*)和count(具体的某个字段),它们有什么区别？**==

> count(*):不是统计某个字段中**数据**的个数，而是统计总记录条数。（和某个字段无关）
>
> count(comm):表示统计comm字段中不为null的数据总数量。

分组函数也能组合起来使用：

```mysql
select count(*),sum(sal),avg(sal),max(sal),min(sal) from emp;
```

#### 2.4.2.4、单行处理函数

什么是单行处理函数？

​	输入一行，输出一行

ifnull()空处理函数?

​	ifnull(可能为null的数据,被当作什么处理)：属于单行处理函数

```maysql
select ename,ifnull(comm,0) as comm from emp;
```

计算每个员工的年薪？

```mysql
select ename,(sal+comm)*12 as yearsal from emp;
--重点：所有的数据库都是这样规定的，只有有NULL参与的运算结果一定是NULL

--使用ifnull()函数
select ename,(sal+ifnull(comm,0))*12 as yearsal from emp;
```

#### 2.4.2.5、group by 和 having

#### group by:

group by:按照某个字段或者某些字段进行分组

having:having是对分组之后的数据进行再次过滤

**案例：找出每个工资岗位的最高薪资。**

==**记住一个规则：当一条语句中有group by的话，select后面只能跟分组函数和参与分组的字段。**==

```mysql
select max(sal) from emp group by job;

select job,max(sal) from emp group by job;

--报错，select后面的ename字段与分组无关
select ename,max(sal),job from emp group by job;
/*
记住一个规则：当一条语句中有group by的话，select后面只能跟分组函数和参与分组的字段。
*/
```

**????**每个工作岗位的平均薪资？

```mysql
select job,avg(sal) from emp group by job;
```

**注意：分组函数一般都会和group by联合使用，这也是为什么它被称为分组函数的原因。并且任何一个分组函数（count、sum、avg、max、min）都是在group by语句执行之后才会执行的。当一条sql语句没有group by的话，整张表的数据会自成一组。**

==**语句的执行顺序**：==

```mysql
select 		5
...
from		1
...
where		2
...
group by	3
...
having		4
...
order by	6
...
```

**多个字段能不能联合起来一块分组？**

**案例：找出每个部门不同工作岗位的最高薪资**

```mysql
/*
select
	deptno,job,max(sal)
from
	emp
group by
	deptno,job
order by
	deptno asc;
*/
select deptno,job,max(sal) from emp group by deptno,job order by deptno asc;
```

#### having:having的使用服务于group by。

**找出每个部门的最高薪资，要求显示薪资大于2500的数据**

```mysql
--第一步：找出每个部门的最高薪资
select max(sal),deptno from emp group by deptno;
--第二步：找出薪资大于2900(having过滤)
select max(sal),deptno from emp group by deptno having max(sal)>2900;

--相比较上面的效率更高的(where过滤)
--建议能够使用where过滤的尽量使用where过滤
select max(sal),deptno from emp where sal>2900 group by deptno;
```

**不能使用where过滤的例子**

**找出每个部门的平均薪资，要求显示平均薪资大于2000的数据**

```mysql
select deptno,avg(sal) from demp group by deptno having avg(sal)>2000;
```

####  2.4.2.6、总结一个完整的DQL（数据**查询**语言）执行顺序

```mysql
select 		5
...
from		1
...
where		2
...
group by	3
...
having		4
...
order by	6
...
```

### 2.4.3、关于查询结果的去重？

```mysql
--在字段select后的字段前面加distinct:关键字去除重复记录
select distinct job from emp;

--下面的sql语句是错误的
--记住：distinct只能出现在所有字段的最前面
select ename,distinct job from emp;

--distinct表示后面所有的字段联合起来去重
select distinct deptno,job from emp order by deptno;
```

**????**统计岗位的数量

```mysql
select count(distinct job) from emp;
```

### 2.4.4、连接查询

#### 2.4.4.1、什么是连接查询？

在实际开发中，大部分的情况下都不是从单表中查询数据，一般都是多张表联合查询取出最终的结果。在实际的开发中，一般一个业务都会对应多张表，比如：学生和班级，起码两张表。

| stuno | stuname | classno | classname       |
| ----- | ------- | ------- | --------------- |
| 1     | zs      | 1       | 第二中学高三1班 |
| 2     | ls      | 1       | 第二中学高三1班 |

#### 2.4.4.2、连接查询的分类？

根据语法出现的年代来划分的话，包括：

​	SQL92（一些老的DBA可能还在使用这种语法。DBA:Database Administrator,数据库管理员）

​	SQL99（比较新的语法）

根据表的连接方式来划分，包括：

​	内连接：

​			等值连接

​			非等值连接

​			自连接

​	外连接：

​			左外连接（左连接）

​			右外连接（右连接）

​	全连接（很少用）

#### 2.4.4.3、笛卡尔积现象

在表的连接查询方面有一种现象被称为：**笛卡尔积现象**。

笛卡尔积现象：当N张表进行连接查询的时候，没有任何条件限制，最终的查询结果是N张表记录条数的乘积

**案例：找出每一个员工的部门名称，要求显示员工名和部门名。**

```mysql
--需要dept和emp两个表
--没加过滤条件，笛卡尔积现象
select ename,dname from emp,dept;
```

关于表的别名：

```mysql
select e.ename,d.dname from emp e,dept d;
```

表的别名有什么好处？

​	第一：执行效率高

​	第二：可读性好

#### 2.4.4.4、怎么避免笛卡尔积现象？

加条件进行过滤

思考：避免了笛卡尔积现象，会减少记录的匹配次数吗？

​	不会，次数不会减少，只不过显示的是有效记录（从总记录中选出符合要求的）

**案例：找出每一个员工的部门名称，要求显示员工名和部门名。**

```mysql
--SQL92(太老，不用了)
select e.ename,d.dname from emp e,dept d where e.deptno=d.deptno;
```

#### 2.4.4.5、内连接

##### ==内连接之等值连接==

**等值连接的最大特点是：连接条件中的关系是==等量==关系**

**案例：查询每个员工的部门名称，要求显示员工名和部门名**

```mysql
--SQL92(太老，不用了)
select e.ename,d.dname from emp e,dept d where e.deptno=d.deptno;

--SQL99(常用的)
select e.ename,d.dname from emp e join dept e on e.deptno=d.deptno;

/*
语法：
...
	A
(inner)join	//inner可以省略，带着inner目的是可读性好一些
	B
on
	连接条件
(where)		还可以加where筛选条件
	...
	
SQL99语法结构更清晰一些，
*/
```

##### ==内连接之非等值连接==

**非等值连接的最大特点是：连接条件中的关系是==非等量==关系**

**案例：找出每个员工的工资等级，要求显示员工名，工资，工资等级**

```mysql
select e.ename,e.sal,s.grade from emp e join salgrade s on e.sal between s.losal and s.hisal;
```

##### ==内连接之自连接==

**自连接：最大的特点是：一张表看作两张表，自己连接自己**

**案例：找出每个员工的上级领导，要求显示员工名和对应的上级领导名**

```mysql
s'l
```

