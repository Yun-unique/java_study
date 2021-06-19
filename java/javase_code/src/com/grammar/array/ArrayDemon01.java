package com.grammar.array;
//数组
//变量的类型     变量的名字  =  变量的值;
public class ArrayDemon01 {
    public static void main(String[] args) {

        int[] nums;//1.声明一个数组
        nums = new int[10];//2.创建一个数组
        //3.给数组元素赋值
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        nums[5]=6;
        nums[6]=7;
        nums[7]=8;
        nums[8]=9;
        nums[9]=10;

        System.out.println(nums[0]);

        //计算所有元素的和
        int sum = 0;
        //获取数组的长度：数组名.length
        for (int i = 0; i < nums.length ; i++) {
            sum=sum+nums[i];
        }
        System.out.println("总数为："+sum);

    }
}
