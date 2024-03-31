package com.pmshark.d1_staticdemo;

public class User {
    public static int number; // 类变量

    public User() {
        //User.number++;
        number++; //注意：这里可以省略User，因为在同一个类中
    }

}
