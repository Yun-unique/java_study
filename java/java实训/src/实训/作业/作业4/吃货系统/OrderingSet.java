package 实训.作业.作业4.吃货系统;

public class OrderingSet {
    String[] names = new String[4]; //保存订餐人姓名
    String[] dishMegs = new String[4];  //保存菜品名及订购份数
    int[] times = new int[4];   //保存订餐日期
    String[] addresses = new String[4]; //保存订餐人地址
    int[] states = new int[4];  //保存订单状态,0:已预定；1：已完成
    double[] sumPrices = new double[4]; //保存订单总金额
}
