package com.grammar.array;

//数组的使用
    /*
    1、普通的For循环
    2、For-Each循环        arrays.for      一般用来打印结果
    3、数组作方法传参
    4、数组作返回值
     */

public class ArrayDemon04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //JDK1.5，没有下标
        /*for (int array : arrays) {
            System.out.println(array);
        }*/

        printArray(arrays);
        System.out.println();

        int[] reverse = reverse(arrays);
        printArray(reverse);
    }
    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
        System.out.println();
    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        //反转操作
        for (int i = 0,j = result.length-1; i < arrays.length ; i++,j--) {
            result[j]=arrays[i];
        }
        return result;
    }
}
