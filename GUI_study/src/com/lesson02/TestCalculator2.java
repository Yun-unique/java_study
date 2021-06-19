package com.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//简易计算器
//使用组合的方式
public class TestCalculator2 {
    public static void main(String[] args) {
        new Calculator2().loadFrame();
    }
}

//计算器类
class Calculator2 extends Frame {

    TextField textField1,textField2,textField3;

    public void loadFrame(){
        //3个文本框
        textField1 = new TextField(10);
        textField2 = new TextField(10);
        textField3 = new TextField(20);

        //1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener2(this));

        //1个标签
        Label label = new Label("+");

        //布局
        setLayout(new FlowLayout());//流式布局

        //组合
        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        //自适应大小
        pack();

        //设置可见
        setVisible(true);

        //监听关闭
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}

//监听器类
class MyCalculatorListener2 implements ActionListener{

    //获取计算器这个对象，在一个类中组合另外一个类
    Calculator2 calculator2 = null;

    public MyCalculatorListener2(Calculator2 calculator2) {
        this.calculator2 = calculator2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n1 = Integer.parseInt(calculator2.textField1.getText());
        int n2 = Integer.parseInt(calculator2.textField2.getText());

        calculator2.textField3.setText(""+(n1+n2));

        calculator2.textField1.setText("");
        calculator2.textField2.setText("");
    }

}