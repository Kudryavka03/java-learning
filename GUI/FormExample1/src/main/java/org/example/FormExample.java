package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class FormExample  {

    public FormExample(){
        JFrame frame =new JFrame("学生档案管理窗口");
        //菜单栏
        JMenuBar menuBar = new JMenuBar();
        //菜单加入到菜单栏
        JMenu fileMenu = new JMenu("学生管理");
        JMenuItem showStudent = new JMenuItem("显示全部学生");
        JMenuItem addStudent = new JMenuItem("增加新学生");
        JMenuItem queryStudent = new JMenuItem("查询学生");
        menuBar.add(fileMenu);
        fileMenu.add(showStudent);
        fileMenu.add(addStudent);
        fileMenu.add(queryStudent);
        // 接下来使用匿名类为addStudent添加一个新的ActionListener（监听器）
        addStudent.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new form2();
            }
        });

        /*
         * 匿名类其实顾名思义就是没有名字的类，你也可以把他写成有名字类。
         * 去到下面新建一个类，把代码扔进去
         * class ButtonAction implement ActionListener(){
         *      public ButtonAction(){
         *         @Override
                    public void actionPerformed(ActionEvent e) {
                        new form2();
                    }
         *      }
         * }
         * 然后上面就改成addStudent.addActionListener(new ButtonListener());
         * 即可
         * 或者不用类去储存相关代码
         * class ButtonAction implement ActionListener(){
         *      public ButtonAction(){
         *         @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame = new JFrame("新增学生档案");
                        JLabel id = new JLabel("学号");
                        JTextField id_input =new JTextField();// JTextField是文本框
                        JLabel name = new JLabel("姓名");
                        JTextField name_input =new JTextField();
                        JLabel phone = new JLabel("手机");
                        JTextField phone_input =new JTextField();
                        JButton saveBtn = new JButton("保存");
                        JButton rewriteBtn = new JButton("重填");
                        // y坐标设定为50
                        id.setBounds(50,30,30,25);// 调整出现在屏幕的坐标，以及空间本身的宽度和高度
                        id_input.setBounds(80,30,100,25);
                        name.setBounds(210,30,30,25);
                        name_input.setBounds(270,30,100,25);
                        phone.setBounds(400,30,30,25);
                        phone_input.setBounds(460,30,100,25);
                        saveBtn.setBounds(590,25,70,30);
                        rewriteBtn.setBounds((int)590+70+30,25,70,30);
                        Font font = new Font("黑体", Font.BOLD,15);
                        saveBtn.setFont(font);
                        rewriteBtn.setFont(font);
                        frame.add(id);
                        frame.add(id_input);
                        frame.add(name);
                        frame.add(name_input);
                        frame.add(phone);
                        frame.add(phone_input);
                        frame.add(saveBtn);
                        frame.add(rewriteBtn);
                        frame.setSize(900,130);
                        frame.setLayout(null);
                        frame.setVisible(true);
                    }
         *      }
         * }
         */
        
        frame.setJMenuBar(menuBar);
        frame.setBounds(250,200,400,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new FormExample();

    }
    // 本程序核心代码参考在main函数上面，所有函数名字和方法均仅供参考，请适当的把他搬到main函数中 By otaku 2023.06.05
}
class form2{
    public form2(){
        // 这里放第二个窗口的相关东西，用一个类的方式去储存，也可以通过代码去存
        JFrame frame = new JFrame("新增学生档案");
        JLabel id = new JLabel("学号");
        JTextField id_input =new JTextField();// JTextField是文本框
        JLabel name = new JLabel("姓名");
        JTextField name_input =new JTextField();
        JLabel phone = new JLabel("手机");
        JTextField phone_input =new JTextField();
        JButton saveBtn = new JButton("保存");
        JButton rewriteBtn = new JButton("重填");
        // y坐标设定为50
        id.setBounds(50,30,30,25);// 调整出现在屏幕的坐标，以及空间本身的宽度和高度
        id_input.setBounds(80,30,100,25);
        name.setBounds(210,30,30,25);
        name_input.setBounds(270,30,100,25);
        phone.setBounds(400,30,30,25);
        phone_input.setBounds(460,30,100,25);
        saveBtn.setBounds(590,25,70,30);
        rewriteBtn.setBounds((int)590+70+30,25,70,30);
        Font font = new Font("黑体", Font.BOLD,15);
        saveBtn.setFont(font);
        rewriteBtn.setFont(font);
        frame.add(id);
        frame.add(id_input);
        frame.add(name);
        frame.add(name_input);
        frame.add(phone);
        frame.add(phone_input);
        frame.add(saveBtn);
        frame.add(rewriteBtn);
        frame.setSize(900,130);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}