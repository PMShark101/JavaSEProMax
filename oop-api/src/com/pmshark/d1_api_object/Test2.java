package com.pmshark.d1_api_object;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(1, "John", "123456", new double[]{90.0, 80.0, 70.0});
        System.out.println(u1.getId());
        System.out.println(u1.getName());
        System.out.println(u1.getPassword());
        System.out.println(u1.getScore()); //prints the reference of the array


        User u2 = (User)u1.clone(); //throws CloneNotSupportedException
        System.out.println(u2.getId());
        System.out.println(u2.getName());
        System.out.println(u2.getPassword());
        System.out.println(u2.getScore());
    }
}
