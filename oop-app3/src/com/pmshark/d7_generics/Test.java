package com.pmshark.d7_generics;

import com.pmshark.d5_enum.A;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //泛型
        ArrayList list = new ArrayList();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        //list.add(new cat());

        for (int i = 0; i < list.size(); i++) {
            String e = (String) list.get(i); //强制类型转换
            System.out.println(e);
        }

        System.out.println("----------------------");
        //ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>(); //jdk1.7之后可以省略后面的泛型
        list1.add("Hello1");
        list1.add("Hello2");
        list1.add("Hello3");
        //list1.add(new cat()); //编译错误

        for (int i = 0; i < list1.size(); i++) {
            String e = list1.get(i); //不需要强制类型转换
            System.out.println(e);
        }

        ArrayList<cat> list2 = new ArrayList<>();
        list2.add(new cat());

    }
}

class cat {}
