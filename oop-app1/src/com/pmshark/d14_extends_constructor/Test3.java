package com.pmshark.d14_extends_constructor;

import javax.swing.*;

public class Test3 {
    public static void main(String[] args) {
        //在类的构造器中，通过this(...)调用兄弟构造器
        student student = new student("张三", 18, "清华大学");

        //如果学生没有填写学校，学校默认为北京大学
        student student2 = new student("李四", 20);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getSchoolName());
    }
}

class student {
    private String name;
    private int age;
    private String schoolName;

    public student() {
    }

    public student(String name, int age) {
        this(name, age, "北京大学");
        //super(); //super()和this()不能同时出现在构造器中,因为super()和this()都必顋放在构造器的第一行
    }

    public student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
