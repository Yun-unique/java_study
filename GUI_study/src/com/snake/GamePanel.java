package com.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//游戏的面板
//正常游戏界面都应该在面板上
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    //定义蛇的数据结构
    int length;//蛇的长度
    int[] snakeX = new int[600];//蛇的x坐标 25*25
    int[] snakeY = new int[500];//蛇的Y坐标 25*25
    String direction;
    //食物的坐标
    int foodX,foodY;
    Random random = new Random();
    //定义分数
    int score;

    //游戏当前状态：开始，停止
    boolean isStart = false;//默认停止

    //游戏失败
    boolean isFail = false;

    //定时器   以ms为单位  1000ms = 1s
    Timer timer = new Timer(100,this);//100毫米执行一次

    //构造器
    public GamePanel(){
        init();
        //获得焦点和键盘事件
        this.setFocusable(true);//获得焦点事件
        this.addKeyListener(this);//获得键盘监听事件
        timer.start();//游戏开始定时器启动
    }

    //初始化方法
    public void init(){
        length = 3 ;
        snakeX[0] = 100;snakeY[0] = 100;//脑袋的坐标
        snakeX[1] = 75;snakeY[1] = 100;//第一个身体的坐标
        snakeX[2] = 50;snakeY[2] = 100;//第二个身体的坐标
        direction = "R";//默认初始方向向右

        //把食物随机分布在界面上！
        foodX = 25 + 25*random.nextInt(34);
        foodY = 75 + 25*random.nextInt(24);

        score = 0;
    }

    //绘制面板，我们游戏中所有的东西，都是用这个画笔来画
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏的作用
        //绘制静态的面板
        this.setBackground(Color.white);
        GameData.header.paintIcon(this,g,25,11);//将头部广告栏画上去
        g.fillRect(25,75,850,600);//默认游戏界面

        //画积分
        g.setColor(Color.white);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));
        g.drawString("长度"+length,750,35);
        g.drawString("分数"+score,750,50);

        //画食物
        GameData.food.paintIcon(this,g,foodX,foodY);

        //把小蛇画上去
        //蛇头初始向右，需要通过方向来判断
        if (direction.equals("R")){
            GameData.right.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if (direction.equals("L")){
            GameData.left.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if (direction.equals("U")){
            GameData.up.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if(direction.equals("D")){
            GameData.down.paintIcon(this,g,snakeX[0],snakeY[0]);
        }

        for (int i = 1; i < length; i++) {
            GameData.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //游戏状态
        if (isStart == false){
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏",300,300);
        }

        if (isFail){
            g.setColor(Color.red);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("失败，按下空格重新开始",300,300);
        }
    }

    //键盘监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();//获得键盘按下的按键
        if(keyCode==KeyEvent.VK_SPACE){//如果按下的空格键
            if (isFail){
                //重新开始
                isFail = false;
                init();
            }else {
                isStart = !isStart;//取反
            }
            repaint();
        }
        //小蛇移动
        if (keyCode==KeyEvent.VK_UP){
            direction = "U";
        }else if (keyCode==KeyEvent.VK_DOWN){
            direction = "D";
        }else if(keyCode==KeyEvent.VK_LEFT){
            direction = "L";
        }else if(keyCode==KeyEvent.VK_RIGHT){
            direction = "R";
        }
    }
    //事件监听
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (isStart && isFail == false){//如果游戏是开始状态，就让小蛇动起来

            //吃食物
            if (snakeX[0] == foodX && snakeY[0] == foodY){
                //长度+1
                length++;
                //分数+10
                score+=10;
                //在次随机刷新食物
                foodX = 25 + 25*random.nextInt(34);
                foodY = 75 + 25*random.nextInt(24);
            }

            //移动
            for (int i = length-1; i > 0 ; i--) {
                snakeX[i] = snakeX[i-1];
                snakeY[i] = snakeY[i-1];
            }
            //走向
            if (direction.equals("R")) {
                snakeX[0] = snakeX[0] + 25;
                if (snakeX[0] > 850){ snakeX[0] = 25; }//边界判断
            }else if (direction.equals("L")){
                snakeX[0] = snakeX[0]-25;
                if (snakeX[0] < 25) { snakeX[0] = 850; }
            }else if (direction.equals("U")){
                snakeY[0] = snakeY[0]-25;
                if (snakeY[0] < 75) { snakeY[0] = 650; }
            }else if (direction.equals("D")){
                snakeY[0] = snakeY[0]+25;
                if (snakeY[0] > 650){ snakeY[0] = 75;}
            }

            //失败判定，撞到自己
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]){
                    isFail =true;
                }
            }

            repaint();//重画页面
        }
        timer.start();//定时器开始
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

}
