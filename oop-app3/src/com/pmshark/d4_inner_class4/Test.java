package com.pmshark.d4_inner_class4;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test {
    public static void main(String[] args) {
        //匿名内部类的常见应用场景
        //GUI编程
        JFrame win = new JFrame("登陆界面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登陆");
        panel.add(btn);

        //给按钮添加点击事件
//        btn.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win, "登陆成功");
//            }
//        });

        //匿名内部类最终的核心目的是：简化代码
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "登陆成功"));

        win.setSize(400, 400); //设置窗口大小
        win.setLocationRelativeTo(null); //居中
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //关闭窗口的时候，退出程序
        win.setVisible(true); //显示窗口
    }
}
