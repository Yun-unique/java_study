package com.grammar.array;

public class ArrayDemon05 {
    public static void main(String[] args) {
        //[4][2]
        /*
            1,2     array[0]
            2,3     array[1]
            3,4     array[2]
            4,5     array[3]
         */
        int[][] arrays = {{1,2},{2,3},{3,4},{4,5}};
        System.out.println(arrays[0]);//输出一个数组对象内存地址
        System.out.println(arrays[0][1]);//2

        printArray(arrays[0]);


        //打印二维数组
        for (int i = 0; i < arrays.length ; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println();
        }
    }

    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
        System.out.println();
    }
}
