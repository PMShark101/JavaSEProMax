package com.pmshark.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        //多态的好处：可以统一处理不同的对象

        //1.可以实现解耦合，右边对象可以随时替换，后续业务随机改变
        People p1 = new Student();
        p1.run(); //识别技巧：编译看左边，运行右边
        //people1.test(); //多态下直接存在的问题：无法直接调用子类特有的方法
        Student s1 = (Student) p1; //强制类型转换
        s1.test(); //强制类型转换后可以调用子类特有的方法

        //强制类型转换可能存在的问题，编译阶段有继承或实现关系就可以强制转换，但运行时可能出现类型转换异常
        //Teacher t1 = (Teacher) p1; //编译通过，运行时出现异常 ClassCastException
        //强转前，可以使用instanceof判断对象的类型
        if (p1 instanceof Student) {
            Student s2 = (Student) p1;
            s2.test();
        } else if (p1 instanceof Teacher){
            Teacher t2 = (Teacher) p1;
            t2.teach();
        }

        //2.可以使用父类类型作为方法的形参，传入不同的子类对象
        Student student = new Student();
        go(student);
        Teacher teacher = new Teacher();
        go(teacher);
    }


    public static void go(People p) {
        p.run();
        if (p instanceof Student) {
            Student s = (Student) p;
            s.test();
        } else {
            Teacher t = (Teacher) p;
            t.teach();
        }
    }
}
