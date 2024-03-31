package com.pmshark.d2_inner_class2;

public class Outer {
    private int age;
    public static String schoolName;

    //静态内部类
    public static class Inner {
        private String name;
        public static int a;

        public void test() {
            System.out.println(schoolName);
            //System.out.println(age); //编译错误, 静态内部类不能访问外部类的非静态成员

        }


        public void setName(String name) {
            this.name = name;
        }
    }

    public static void test2() {
        System.out.println(schoolName);
        //System.out.println(age); //编译错误, 静态内部类不能访问外部类的非静态成员

    }
}
