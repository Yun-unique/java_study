package com.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//简易计算器
//使用内部类:内部类最大的好处，就是可以畅通无阻的访问外部类的属性和方法
public class TestCalculator3 {
    public static void main(String[] args) {
        new Calculator2().loadFrame();
    }
}

//计算器类
class Calculator3 extends Frame {

    TextField textField1,textField2,textField3;

    public void loadFrame(){

        textField1 = new TextField(10);
        textField2 = new TextField(10);
        textField3 = new TextField(20);

        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener3());

        Label label = new Label("+");

        setLayout(new FlowLayout());//流式布局

        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        pack();

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //监听器类
    private class MyCalculatorListener3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int n1 = Integer.parseInt(textField1.getText());
            int n2 = Integer.parseInt(textField2.getText());
            textField3.setText(""+(n1+n2));
            textField1.setText("");
            textField2.setText("");
        }
    }
}

