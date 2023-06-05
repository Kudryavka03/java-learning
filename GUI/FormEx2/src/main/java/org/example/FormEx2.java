package org.example;

import javax.swing.*;

public class FormEx2 extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JTextField phoneField;
    private JLabel idLabel;
    private JLabel nameLabel;
    private JLabel phoneLabel;
    private JButton saveButton;
    private JButton resetButton;

    public FormEx2() {
        //设置窗口标题
        super("文本框示例");

        //创建文本框和标签
        idField = new JTextField();
        idField.setBounds(200, 30, 150, 30);
        add(idField);

        nameField = new JTextField();
        nameField.setBounds(500, 30, 150, 30);
        add(nameField);

        phoneField = new JTextField();
        phoneField.setBounds(800, 30, 150, 30);
        add(phoneField);

        idLabel = new JLabel("学号：");
        idLabel.setBounds(170, 30, 50, 30);
        add(idLabel);

        nameLabel = new JLabel("姓名：");
        nameLabel.setBounds(470, 30, 50, 30);
        add(nameLabel);

        phoneLabel = new JLabel("手机：");
        phoneLabel.setBounds(770, 30, 50, 30);
        add(phoneLabel);

        //创建按钮
        saveButton = new JButton("保存");
        saveButton.setBounds(1000, 30, 80, 30);
        add(saveButton);

        resetButton = new JButton("重填");
        resetButton.setBounds(1100, 30, 80, 30);
        //控件右边界像素点位置：1180
        //控件底部60px
        add(resetButton);

        //设置窗口大小和可见性
        //1180+200=1380
        //60+30=90
        //高DPI缩放
        setSize(1380, (int) (90+30));
        setLayout(null);
        setVisible(true);

        //怎么写出HTML的感觉出来了...
    }

    public static void main(String[] args) {
        FormEx2 frame = new FormEx2();
    }
}