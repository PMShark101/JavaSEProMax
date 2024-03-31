package com.pmshark.d1_staticdemo;

public class Test {
    public static void main(String[] args) {
        // 类变量
        Student.name = "张三";

        Student s1 = new Student();
        s1.name = "李四"; //不推荐这样使用

        Student s2 = new Student();
        s1.name = "王五";

        System.out.println(s1.name); //王五
        System.out.println(Student.name); //王五

        // 实例变量
        s1.age = 20;
        s2.age = 21;
        System.out.println(s1.age);
        System.out.println(s2.age);

        //System.out.println(Student.age); //编译错误


    }
}
