package 实训.作业.作业8.匿名内部类;
interface OuterInter{
    void show();
}
public class Test1 {
    public static void main(String[] args) {
        Out outer = new Out();
        outer.method();
    }
}
class Out{
    public void method(){
        new OuterInter(){
            @Override
            public void show() {
                System.out.println("接口使用匿名内部类1");
            }
        }.show();
        OuterInter oi = new OuterInter() {
            @Override
            public void show() {
                System.out.println("接口使用匿名内部类2");
            }
        };
        oi.show();
    }
}
