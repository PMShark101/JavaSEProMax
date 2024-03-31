package com.pmshark.d6_abstract_template;

public abstract class People {
    //设计模版方法设计模式
    //1.定义一个方法，写作文
    public final void write() { //final修饰，不让子类重写
        //2.第一段：今天天气真好!
        System.out.println("写作文：第一段：今天天气真好!");
        //3.正文：我爱学习，我爱学校，我爱老师，我爱同学!
        System.out.println(writeContent());
        //4.结尾：希望每天都是好天气!
        System.out.println("写作文：结尾：希望每天都是好天气!");
    }

    //定义一个抽象方法，写正文
    public abstract String writeContent();
}
