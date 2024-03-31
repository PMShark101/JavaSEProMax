package com.pmshark.d14_extends_constructor;

class Father {
//    public Father() {
//        System.out.println("Father的无参构造器");
//    }

    public Father(String name, int age) {
        System.out.println("Father的有参构造器");
    }
}

class Son extends Father {
    public Son() {
        super("张三", 18); //默认调用父类的无参构造器,如果父类没有无参构造器，必须手动调用父类的有参构造器
        System.out.println("Son的无参构造器");
    }

    public Son(String name) {
        super("张三", 18); //默认调用父类的无参构造器,如果父类没有无参构造器，必须手动调用父类的有参构造器
        System.out.println("Son的有参构造器");
    }
}

public class Test {
    public static void main(String[] args) {
        //子类构造器的特点
        Son son = new Son(); //先调用父类的构造器，再调用子类的无参构造器
        Son son2 = new Son("张三"); //先调用父类的构造器，再调用子类的有参构造器
    }
}
