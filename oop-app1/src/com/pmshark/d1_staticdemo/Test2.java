package com.pmshark.d1_staticdemo;

public class Test2 {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(User.number); // 1

        User u2 = new User();
        System.out.println(User.number); // 2

        User u3 = new User();
        System.out.println(User.number); // 3
    }
}
