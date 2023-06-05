package org.example;

import javax.swing.*;

public class FormExample extends JFrame {
    private JMenuBar menuBar;
    private JMenu studentMenu;
    private JMenuItem displayItem;
    private JMenuItem addItem;
    private JMenuItem searchItem;

    public FormExample() {
        // 设置窗口标题
        super("学生管理系统");

        // 创建菜单栏
        menuBar = new JMenuBar();

        // 创建学生管理菜单标签
        studentMenu = new JMenu("学生管理");

        // 创建显示全部学生菜单项
        displayItem = new JMenuItem("显示全部学生");
        studentMenu.add(displayItem);

        // 创建增加新学生菜单项
        addItem = new JMenuItem("增加新学生");
        studentMenu.add(addItem);

        // 创建查询学生菜单项
        searchItem = new JMenuItem("查询学生");
        studentMenu.add(searchItem);

        // 将菜单标签添加到菜单栏中
        menuBar.add(studentMenu);

        // 将菜单栏添加到窗口中
        setJMenuBar(menuBar);

        // 设置窗口大小和可见性
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        FormExample frame = new FormExample();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}