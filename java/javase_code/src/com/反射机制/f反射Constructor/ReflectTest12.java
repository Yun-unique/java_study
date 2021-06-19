package com.反射机制.f反射Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
* 反编译一个类的Constructor构造方法
* */
public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        Class vipClass = Class.forName("com.反射机制.f反射Constructor.Vip");
        sb.append(Modifier.toString(vipClass.getModifiers()));
        sb.append(" class ");
        sb.append(vipClass.getSimpleName());
        sb.append("{\n");

        //拼接构造方法
        Constructor[] constructors = vipClass.getDeclaredConstructors();
        for (Constructor constructor:constructors){
            sb.append("\t");
            sb.append(Modifier.toString(constructor.getModifiers()));
            sb.append(" ");
            sb.append(vipClass.getSimpleName());
            sb.append("(");
            //拼接参数
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType:parameterTypes){
                sb.append(parameterType.getSimpleName());
                sb.append(",");
            }
            //删除最后下标位置上的字符
            if (parameterTypes.length>0){
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append("){}\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
class Vip{
    int no;
    String name;
    String birth;
    boolean sex;

    public Vip() {
    }

    public Vip(int no) {
        this.no = no;
    }

    public Vip(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Vip(int no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    public Vip(int no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sex=" + sex +
                '}';
    }
}