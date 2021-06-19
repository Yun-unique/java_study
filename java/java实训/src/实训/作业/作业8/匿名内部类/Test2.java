package 实训.作业.作业8.匿名内部类;
abstract class A{
    public abstract void show();
}
public class Test2 {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void show() {
                System.out.println("抽象类用匿名内部类");
            }
        };
        a.show();
    }
}
