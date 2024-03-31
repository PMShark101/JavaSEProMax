package com.pmshark.d9_interface_demo;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl2();

    public ClassManager() {
        students.add(new Student("张三", '男', 89.5));
        students.add(new Student("李四", '女', 78.5));
        students.add(new Student("王五", '男', 67.5));
        students.add(new Student("赵六", '女', 56.5));
    }

    //打印全班全部学生的信息
    public void printInfo() {
        studentOperator.printAllInfo(students);
    }


    //打印全班全部学生的平均分
    public void printScore() {
        studentOperator.printAvgScore(students);
    }

}
