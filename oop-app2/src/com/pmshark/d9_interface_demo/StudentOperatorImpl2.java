package com.pmshark.d9_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator{

    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("==全班全部学生信息如下==");
        int count1 = 0; //男生人数
        int count2 = 0; //女生人数
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.printf("姓名：%s，性别：%c，分数：%.2f\n", s.getName(), s.getSex(), s.getScore());
            if (s.getSex() == '男') {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.printf("男生人数：%d，女生人数：%d\n", count1, count2);
        System.out.println("-----------------------------");

    }

    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double maxScore = students.get(0).getScore();
        double minScore = students.get(0).getScore();
        double score = 0.0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getScore() > maxScore) {maxScore = students.get(i).getScore();}
            if (students.get(i).getScore() < minScore) {minScore = students.get(i).getScore();}
            score += students.get(i).getScore();
        }
        System.out.printf("全班学生的最高分为：%.2f\n", maxScore);
        System.out.printf("全班学生的最低分为：%.2f\n", minScore);
        System.out.printf("全班学生的平均分为：%.2f\n", (score - maxScore - minScore) / students.size());
    }
}
