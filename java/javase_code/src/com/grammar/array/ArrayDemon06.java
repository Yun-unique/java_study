package com.grammar.array;
//数组工具类：Arrays
import java.util.Arrays;

public class ArrayDemon06 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,9090,31231,543,21,3,23};
        System.out.println(a);//哈希码：[I@5fd0d5ae 数组对象地址
        //System.out.println(a.toString());//上面是将toString()方法省略了

        //打印数组元素
        System.out.println(Arrays.toString(a));//数组工具类

        //数组排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //数组填充
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));

        Arrays.fill(a,2,4,10);
        System.out.println(Arrays.toString(a));

    }
}
