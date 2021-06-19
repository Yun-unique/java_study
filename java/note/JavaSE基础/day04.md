### Java方法：

![](C:\Users\86187\Desktop\Java\java截图\方法（1）.png)

![](C:\Users\86187\Desktop\Java\java截图\方法（2）.png)

![](C:\Users\86187\Desktop\Java\java截图\方法重载.png)

![](C:\Users\86187\Desktop\Java\java截图\命令行传参.png)

![](C:\Users\86187\Desktop\Java\java截图\命令行传参（2）.png)

![](C:\Users\86187\Desktop\Java\java截图\可变参数.png)

![](C:\Users\86187\Desktop\Java\java截图\递归.png)

### 数组定义：

* 数组是相同类型数据的有序集合。
* 数组描述的是相同类型的若干个数据，按照一定的先后顺序排列组合而成。
* 其中，每一个数据称作一个数组元素，每个数组元素可以通过一个下标来访问它们。

![](C:\Users\86187\Desktop\Java\java截图\Array声明创建.png)

![](C:\Users\86187\Desktop\Java\java截图\Array边界.png)

![](C:\Users\86187\Desktop\Java\java截图\Array初始化.png)

![](C:\Users\86187\Desktop\Java\java截图\Array边界.png)

![](C:\Users\86187\Desktop\Java\java截图\Array多维.png)

### Arrays类：

![](C:\Users\86187\Desktop\Java\java截图\Arrays类.png)

### 数组排序：冒泡排序

```java
public static int[] popSort(int[] array){
        int temp = 0;
        //外层循环
        for (int i = 0; i < array.length-1; i++) {
        boolean flag = false;//通过flag标识位减少没必要的比较
        //内层循环
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if (flag==false){
                break;
            }
        }
        return array;
    }
```



### 稀疏数组：

![](C:\Users\86187\Desktop\Java\java截图\Array(稀疏数组).png)

### 内存分析：

![](C:\Users\86187\Desktop\Java\java截图\内存分析.png)

![](C:\Users\86187\Desktop\Java\java截图\JVM内存管理.jpg)