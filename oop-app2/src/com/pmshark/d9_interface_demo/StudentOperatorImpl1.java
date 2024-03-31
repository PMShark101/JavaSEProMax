package com.pmshark.d9_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl1 implements StudentOperator {

    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("==全班全部学生信息如下==");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.printf("姓名：%s，性别：%c，分数：%.2f\n", s.getName(), s.getSex(), s.getScore());
        }
        System.out.println("-----------------------------");

    }

    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double score = 0.0;
        for (int i = 0; i < students.size(); i++) {
            score += students.get(i).getScore();
        }
        System.out.printf("全班学生的平均分为：%.2f\n", score / students.size());
    }
}
