package com.常用类.random;

import java.util.Arrays;
import java.util.Random;

/*
编写程序，生成5个不重复的随机数[0~100]，重复的话重新生成
最终生成的5个随机数放到数组中，要求数组中的这5个随机数不重复
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];//默认值为0，注意和随机生成的0区分开
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        //循环，生成随机数
        int index = 0;
        while (index < array.length){
            int num = random.nextInt(10);
            System.out.println("生成的随机数为："+num);
            if (!contains(array,num)) {
                array[index++] = num;
            }
        }
        Arrays.sort(array);
        //遍历数组
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("]");
    }

    /**
     * 单独编写一个方法，专门用来判断数组中是否包含某个元素
     * @param arr   数组
     * @param key   元素
     * @return  true表示包含，false表示不包含
     */

    public static boolean contains(int[] arr,int key){
       /*
       这种方法有bug(判断排序后交换位置使得数组默认取值-1被换到数组第一位，无法改变了)
        //对数组进行升序
        Arrays.sort(arr);
        //进行二分法查找，结果>=0表示找到
        return Arrays.binarySearch(arr, key) >= 0;
        */

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}

