package com.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//简易计算器
public class TestCalculator {
    public static void main(String[] args) {
        new Calculator();
    }
}

//计算器类
class Calculator extends Frame {
    public Calculator(){
        //3个文本框
        TextField textField1 = new TextField();
        TextField textField2= new TextField();
        TextField textField3 = new TextField();

        //1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener(textField1,textField2,textField3));

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
class MyCalculatorListener implements ActionListener{

    //获取三个变量
    private TextField textField1,textField2,textField3;

    public MyCalculatorListener(TextField textField1, TextField textField2, TextField textField3) {
        this.textField1 = textField1;
        this.textField2 = textField2;
        this.textField3 = textField3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //1.获得加数和被加数
        int n1 = Integer.parseInt(textField1.getText());
        int n2 = Integer.parseInt(textField2.getText());

        //2.将这个值+法运算后，放到第三个框
        textField3.setText(""+(n1+n2));

        //3.清楚前两个框
        textField1.setText("");
        textField2.setText("");
    }

}