package 实训.课堂代码.人机猜拳;

public class User extends Player{
    public User() {
    }

    public User(String name, int count) {
        super(name, count);
    }

    @Override
    public int showFist() {
        System.out.print("请出拳：1.剪刀 2.石头 3.布(输入相应的数字)：");
        int flag = scanner.nextInt();
        switch (flag){
            case 1:
                System.out.println(getName()+"出拳：剪刀");
                break;
            case 2:
                System.out.println(getName()+"出拳：石头");
                break;
            case 3:
                System.out.println(getName()+"出拳：布");
                break;
            default:
                System.out.println("请输入规定的值！");
        }
        return flag;
    }

    @Override
    public void showResult(String name) {
        super.showResult(name);
    }
}
