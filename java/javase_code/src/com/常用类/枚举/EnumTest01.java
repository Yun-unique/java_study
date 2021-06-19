package com.常用类.枚举;//标识符，enum是关键字，不能做标识符
/*
采用枚举的方式改造程序:
总结：
    1、枚举是一种引用数据类型
    2、枚举类型怎么定义，语法是？
        enum 枚举类型名{
            枚举值1,枚举值2       //大写，以英文逗号分隔，不以英文;结尾
        }
    3、结果只有两种情况的，建议使用布尔类型
        结果超过两种，并且还是可以一枚一枚列举出来的，建议使用枚举类型
        列如：颜色，四季。星期等都可以使用枚举类型
 */
public class EnumTest01 {
    public static void main(String[] args) {
        Result r = divide(10,0);
        System.out.println(r==Result.SUCCESS?"计算成功":"计算失败");//计算失败
    }

    /**
     * 计算两个int类型数据的商
     * @param a int类型数据
     * @param b int类型数据
     * @return  Result.SUCCESS表示成功，Result.FAIL表示失败
     */
    public static Result divide(int a,int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}
//枚举：可以一枚一枚列举出来的，才建议使用枚举类型
//枚举编译之后也是生成class文件
//枚举也是一种引用数据类型，枚举中的每一个值可以看作是“常量”
enum Result{
    //SUCCESS和FAIL   都是枚举Result类型中的一个值
    SUCCESS,FAIL
}
