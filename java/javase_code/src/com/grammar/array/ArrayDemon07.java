package com.grammar.array;

import java.util.Arrays;

//冒泡排序
/*
    1、比较数组中，两个相邻的元素如果第一个数比第二个数打，就交换它们的位置
    2、每一次比较就会产生出一个最大，或者最小的数
    3、下一轮则可以少进行一次排序
    4、依次循环，直到结束！
 */
public class ArrayDemon07 {
    public static void main(String[] args) {
        int[] a = {10,2,5,99,88,123,32,65};
        popSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] popSort(int[] array){

        int temp = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

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
                    count1++;
                }
                count2++;
            }
            if (flag==false){
                break;
            }
            count3++;
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        return array;
    }
}
