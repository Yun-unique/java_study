package 实训.作业.作业5_吃货系统;

import java.util.Scanner;

public class OrderingUtil {
    OrderingSet oSet = new OrderingSet();
    Scanner scanner = new Scanner(System.in);
    String[] dishNames = new String[3];
    double[] singlePrice = new double[3];
    int[] praiseNumber = new int[3];

    //初始化菜品信息方法
    public void initialDish(){
        String[] id = new String[3];
        dishNames[0] = "红烧带鱼";
        dishNames[1] = "鱼香肉丝";
        dishNames[2] = "时令鲜蔬";
        singlePrice[0] = 38.0;
        singlePrice[1] = 20.0;
        singlePrice[2] = 10.0;
        /*praiseNumber[0] = 0;
        praiseNumber[1] = 0;
        praiseNumber[2] = 0;*/
        System.out.println("序号"+"\t"+"菜名"+"\t\t"+"单价"+"\t\t"+"点赞数");
        for (int i = 0; i < id.length; i++){
            id[i] = (i+1)+"\t\t"+dishNames[i]+"\t\t"+singlePrice[i]+"元\t\t"+praiseNumber[i];
            System.out.println(id[i]);
        }
    }
    //初始化订单信息
    public void initialOrdering(){
        String[] order = new String[4];
        System.out.println("序号"+"\t"+"订餐人"+"\t"+"餐品信息"+"\t\t\t"
                +"送达时间"+"\t\t"+"送餐地址"+"\t\t\t"+"总金额"+"\t\t"+"订单状态");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order.length; j++) {
                String flag = oSet.states[i]==1?"已预定":"已完成";
                order[i] = (i + 1) + "\t\t" + oSet.names[i] + "\t" + oSet.dishMegs[i] + "\t\t" + oSet.times[i] + "点\t\t"
                        + oSet.addresses[i] + "\t\t" + oSet.sumPrices[i] + "\t\t" + flag;
                if (oSet.names[i]!=null){
                    System.out.println(order[i]);
                    break;
                }
            }
        }

        /*oSet.names[0] = "张晴";
        oSet.names[1] = "张晴";
        oSet.dishMegs[0] = "红烧带鱼 2份";
        oSet.dishMegs[1] = "鱼香肉丝 2份";
        oSet.times[0] = 3;
        oSet.times[1] = 10;
        oSet.addresses[0] = "天成路207号";
        oSet.addresses[1] = "天成路207号";
        oSet.sumPrices[0] = 76.0;
        oSet.sumPrices[1] = 45.0;
        oSet.states[0] = 1;
        oSet.states[1] = 0;*/
    }
    //系统功能菜单
    public void startMenu(){
        System.out.println("欢迎使用“吃货联盟订餐系统”");
        System.out.println("***************************************");
        System.out.println("1、我要订餐\n2、查看餐袋\n3、签收订单\n4、删除订单\n5、我要点赞\n6、退出系统");
        System.out.println("***************************************");
        System.out.print("请选择：");
        int flag = scanner.nextInt();
        switch (flag){
            case 1 :   //我要订餐
                addOrder();
                System.out.print("输入0返回：");
                int flag1 = scanner.nextInt();
                if (flag1==0){
                    startMenu();
                }else {
                    System.out.println("输入错误!");
                    return;
                }
                break;
            case 2 :    //查看餐袋
                display();
                System.out.print("输入0返回：");
                int flag2 = scanner.nextInt();
                if (flag2==0){
                    startMenu();
                }else {
                    System.out.println("输入错误!");
                    return;
                }
                break;
            case 3 :    //签收订单
                sign();
                System.out.print("输入0返回：");
                int flag3 = scanner.nextInt();
                if (flag3==0){
                    startMenu();
                }else {
                    System.out.println("输入错误!");
                    return;
                }
                break;
            case 4 :    //删除订单
                delete();
                System.out.print("输入0返回：");
                int flag4 = scanner.nextInt();
                if (flag4==0){
                    startMenu();
                }else {
                    System.out.println("输入错误!");
                    return;
                }
                break;
            case 5 :    //我要点赞
                praise();
                System.out.print("输入0返回：");
                int flag5 = scanner.nextInt();
                if (flag5==0){
                    startMenu();
                }else {
                    System.out.println("输入错误!");
                    return;
                }
                break;
            case 6 :    //退出系统
                exitSystem();
                break;
            default:
                System.out.println("请根据需要选择对应的功能！");
                startMenu();
        }
    }
    //1、“我要点餐”功能方法
    public void addOrder(){
        System.out.println("***我要订餐***");
        System.out.print("请输入订餐人姓名：");
        String[] name = new String[4];
        for (int i = 0; i < name.length; i++) {
            if (oSet.names[i]==null) {
                name[i] = scanner.next();
                oSet.names[i] = name[i];
                break;
            }
        }

        initialDish();

        System.out.print("请选择您要点的菜品编号：");
        int chooseDish = scanner.nextInt();

        System.out.print("请选择您需要的份数：");
        int number = scanner.nextInt();

        String[] dishMeg = new String[4];
        for (int i = 0; i < dishMeg.length ; i++) {
            if (oSet.dishMegs[i]==null) {
                dishMeg[i] = dishNames[chooseDish - 1] + " " + number + "份";
                oSet.dishMegs[i] = dishMeg[i];
                break;
            }
        }

        System.out.print("请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
        int[] time = new int[4];
        for (int i = 0; i < time.length; i++) {
            if (oSet.times[i]==0){
                time[i] = scanner.nextInt();
                oSet.times[i] = time[i];
                break;
            }
        }

        System.out.print("请输入送餐地址：");
        String[] address = new String[4];
        for (int i = 0; i < address.length; i++) {
            if (oSet.addresses[i]==null){
                address[i] = scanner.next();
                oSet.addresses[i] = address[i];
                break;
            }
        }

        System.out.println("订餐成功！");
        int[] state = new int[4];
        for (int i = 0; i < state.length ; i++) {
            if (oSet.states[i]==0){
                state[i] = 1;
                oSet.states[i] = state[i];
                break;
            }
        }
        for (int i = 0; i < dishMeg.length; i++) {
            if (oSet.dishMegs[i]==null){
                System.out.println("您订的是："+oSet.dishMegs[i-1]);
                break;
            }
        }
        /*System.out.println("您订的是："+oSet.dishMegs[id-1]);*/
        for (int i = 0; i < time.length; i++) {
            if (oSet.times[i]==0){
                System.out.println("送餐时间："+oSet.times[i-1]+"点");
                break;
            }
        }
        //System.out.println("送餐时间："+oSet.times[id-1]+"点");

        double[] sumPrice = new double[4];
        for (int i = 0; i < sumPrice.length ; i++) {
            if (oSet.sumPrices[i]==0.0){
                sumPrice[i] = singlePrice[chooseDish-1]*number;
                double deliCharge = (sumPrice[i]>=50)?0:5;
                oSet.sumPrices[i] = sumPrice[i]+deliCharge;
                System.out.println("餐费："+sumPrice[i]+"元，送餐费："+deliCharge+"元，总计："+(sumPrice[i]+deliCharge)+"元。");
                break;
            }
        }
    }
    //2、“查看餐袋”功能方法
    public void display(){
        System.out.println("***查看餐袋***");
        if (oSet.names[0]==null){
            System.out.println("还没有点餐哦，转到点餐功能");
            addOrder();
        }else {
            initialOrdering();
        }
    }
    //3、“签收订单”功能方法
    public void sign(){
        System.out.println("***签收订单***");
        if (oSet.names[0]==null){
            System.out.println("还没有点餐哦，转到点餐功能");
            addOrder();
        }else {
            System.out.print("请输入要签收的订单编号：");
            int num = scanner.nextInt();
            if (num<=0 || num>4){
                System.out.println("请选择正确的订单编号！");
            }else {
                System.out.print("是否确认签收？输入0否，输入1是：");
                int flag = scanner.nextInt();
                if (flag==0){
                    oSet.states[num-1] = 1;
                }else{
                    oSet.states[num-1] = 2;
                    System.out.println("签收成功！");
                }
            }
        }
    }
    //4、“删除订单”功能方法
    public void delete(){
        System.out.println("***删除订单***");
        if (oSet.names[0]==null){
            System.out.println("还没有点餐哦，转到点餐功能");
            addOrder();
        }else{
            System.out.print("请选择要删除的订单编号：");
            int num = scanner.nextInt();
            if (num<=0 || num>4){
                System.out.println("请选择正确的订单编号");
            }else {
                for (int i = num-1 ; i < oSet.names.length-1; i++) {
                    oSet.names[i] = oSet.names[i+1];
                    oSet.dishMegs[i] = oSet.dishMegs[i+1];
                    oSet.times[i] = oSet.times[i+1];
                    oSet.addresses[i] = oSet.addresses[i+1];
                    oSet.sumPrices[i] = oSet.sumPrices[i+1];
                    oSet.states[i] = oSet.states[i+1];
                }
                int lastNum = oSet.names.length - 1;
                oSet.names[lastNum] = null;
                oSet.dishMegs[lastNum] = null;
                oSet.times[lastNum] = 0;
                oSet.addresses[lastNum] = null;
                oSet.sumPrices[lastNum] = 0.0;
                oSet.states[lastNum] = 0;
            }
            System.out.println("删除订单成功！");
        }
    }
    //5、“我要点赞”功能方法
    public void praise(){
        System.out.println("***我要点赞***");
        if (oSet.names[0]==null){
            System.out.println("还没有点餐哦，转到点餐功能");
            addOrder();
        }else {
            System.out.print("请选择您要点赞的餐品编号：");
            int id = scanner.nextInt();
            if (id <= 0 || id > 3) {
                System.out.println("请输入正确的餐品编号!");
            } else {
                praiseNumber[id - 1] += 1;
                System.out.println("点赞成功！");
            }
            initialDish();
        }
    }
    //6、“退出系统”方法
    public void exitSystem(){
        System.out.println("谢谢使用，欢迎下次光临！");
        System.exit(0);
    }
}
