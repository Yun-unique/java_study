package com.集合.增强for循环;

public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {432,4,65,54,76,54};
        //遍历数组（普通的for循环）
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //增强for循环(for-each)语法
        /*
        for(元素类型 变量名:数组或集合){
            System.out.println(变量名)
        }
         */
        System.out.println("================================");

        //for-each有个缺点：没有下标
        for (int data :
                arr) {//data代表数组中的每一个元素
            System.out.println(data);
        }
    }
}
