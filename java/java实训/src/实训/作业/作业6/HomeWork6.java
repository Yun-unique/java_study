package 实训.作业.作业6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork6 {
    //1、计算一个键入的字符串的大小写和数字的个数
    public static void test1(){
        /*
         * 键盘录入一个字符串，统计该字符串中
         * 大小写和数字的字符个数
         * 大写字母  ch>='A' && ch <='Z'
         * 小写字母 ch >='a' && ch<='z'
         * 数字 ch >='0' && ch<='9'
         */
        Scanner scanner = new Scanner(System.in);
        int upCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;
        System.out.print("键盘输入一个字符串：");
        String str = scanner.next();
        for (int i = 0;i < str.length();i++){
            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                upCaseCount++;
            }else if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                lowerCaseCount++;
            }else if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                numberCount++;
            }
        }
        System.out.println("大写字母个数："+upCaseCount);
        System.out.println("小写字母个数："+lowerCaseCount);
        System.out.println("数字个数："+numberCount);
    }
    //2、定义一个方法，将数组{1，2，3}按照指定的格式拼接成字符串
    public static void test2(){
        int[] arr = {1,2,3};
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(arr[2]);
        stringBuffer.append(arr[0]);
        stringBuffer.append(arr[1]);
        System.out.println(stringBuffer.toString());//312
    }
    //3、计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
    public static void test3(){
        int count=0;
        double min=-10.8;
        double max=5.9;
        for(int i=(int)min;i<max;i++) {
            int abs = Math.abs(i);
            if(abs>6 || abs<2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("整数的个数为："+count);
    }
    //4、验证for循环打印数字1-9999所需要使用的时间
    public static void test4(){
        long time1 = System.currentTimeMillis();
        for (int i = 1; i < 10000; i++) {
            System.out.println(i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("该打印方法执行完成所需时间为："+(time2-time1));
    }
    //5、计算一个人已经出生了多少天
    public static void test5() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入你的出生日期，格式为“yyyy-MM-dd”：");
        String birthTime = scanner.next();
        System.out.println("格式为yyyy-MM-dd的出生日期："+birthTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthTime2 = sdf.parse(birthTime);
        System.out.println("格式为系统默认的格式为："+birthTime2);
        long birthTimeMillis = birthTime2.getTime();
        System.out.println("1970-01-01 00:00:00 000到你出生的毫秒数："+birthTimeMillis);
        Date nowTime = new Date();
        long nowTimeMillis = nowTime.getTime();
        System.out.println("1970-01-01 00:00:00 000到现在的毫秒数："+nowTimeMillis);
        long birthMillis = nowTimeMillis-birthTimeMillis;
        System.out.println("你出生到现在总共"+(birthMillis/1000/60/60/24)+"天啦！");
    }
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();
        try {
            test5();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
