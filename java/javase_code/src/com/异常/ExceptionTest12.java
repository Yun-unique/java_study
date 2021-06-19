package com.异常;
/*
finally面试题
 */
public class ExceptionTest12 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);//100
    }
    /*
    java语法规则（有一些规则是不能破环的）
        java中有这样的规则：
            方法体中的代码必须遵循自上而下的顺序依次逐行执行（亘古不变的语法）
        java中还有一条语法：
            return语句一旦执行，整个方法必须结束（亘古不变的语法）
     */
    public static int m(){
        int i = 100;
        try{
            //这行代码出现再int i = 100;的下面，所以最终结果必须是返回100
            //return语句还是保证在finally语句块结束后执行。一旦执行，整个方法结束
            return i;
        }finally {
            i++;
        }
    }
}

/*
反编译之后的结果
public static int m(){
    int i = 100;
    int j = i;
    i++;
    return j;
}
 */
