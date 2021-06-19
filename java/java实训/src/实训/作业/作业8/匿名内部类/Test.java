package 实训.作业.作业8.匿名内部类;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.show();
    }
    private void show(){
        Outer outer = new Outer(){
            @Override
            void show() {
                System.out.println("this is 匿名内部类的 show方法");
            }
        };
        outer.show();
    }
}
class Outer{
    void show(){
        System.out.println("this is Outer show方法");
    }
}
