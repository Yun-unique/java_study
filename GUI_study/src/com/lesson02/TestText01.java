package com.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestText01 {
    public static void main(String[] args) {
        //启动！
        new MyFrame();
    }
}

class MyFrame extends Frame{

    public MyFrame(){
        TextField textField = new TextField();//field：域
        add(textField);

        //监听这个文本框输入的文字
        MyActionListener2 myActionListener2 = new MyActionListener2();
        //按下enter，就会触发这个输入框的事件
        textField.addActionListener(myActionListener2);

        //设置替换编码（密码的应用，输入的内容被*替代）
        //textField.setEchoChar('*');

        setVisible(true);
        pack();//自适应大小

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionListener2 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TextField field = (TextField)actionEvent.getSource();//获得一些资源,返回的一个对象
        System.out.println(field.getText());//获得输入框中的文本
        field.setText("");//输入内容后回车，清空输入框
    }
}
