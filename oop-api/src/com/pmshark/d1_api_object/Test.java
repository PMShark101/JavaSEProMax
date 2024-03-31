package com.pmshark.d1_api_object;

public class Test {
    public static void main(String[] args) {
        //Object
        Student s1 = new Student("John", 20);
        //System.out.println(s1.toString());
        System.out.println(s1);

        Student s2 = new Student("John", 20);
        System.out.println(s2);

        System.out.println(s2.equals(s1)); //compare the content of the object
        System.out.println((s1 == s2)); //compare the reference of the object
    }
}
