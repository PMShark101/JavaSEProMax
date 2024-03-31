package com.pmshark.d8_extends_application;

public class Test {
    public static void main(String[] args) {
        //继承的好处
        Teacher teacher = new Teacher();
        teacher.setName("张老师");
        teacher.setSkill("教学");
        System.out.println(teacher.getName());
        System.out.println(teacher.getSkill());
        teacher.printInfo();
    }
}
