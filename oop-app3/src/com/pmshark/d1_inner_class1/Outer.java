package com.pmshark.d1_inner_class1;

public class Outer {
    private int age = 99;
    public static String a;
    //成员内部类
    public class Inner {
        private String name;

        public static String schoolName; //JDK16之后，内部类中的静态变量可以有了
        private int age = 88;


        public void test() {
            System.out.println(age);
            System.out.println(a);

            int age = 66;
            System.out.println(age); //66
            System.out.println(this.age); //88
            System.out.println(Outer.this.age); //99

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public void test2() {
        System.out.println(age);
        System.out.println(a);
    }

}
