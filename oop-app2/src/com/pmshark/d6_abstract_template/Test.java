package com.pmshark.d6_abstract_template;

public class Test {
    public static void main(String[] args) {
        //模板方法模式(抽象类)
        //场景：学生和老师都要写一篇作文，第一段相同，正文不同，结尾相同
        People t = new Teacher();
        t.write();

        People s = new Student();
        s.write();
    }
}
