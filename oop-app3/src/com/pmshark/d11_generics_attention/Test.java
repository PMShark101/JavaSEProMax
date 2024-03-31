package com.pmshark.d11_generics_attention;

import com.pmshark.d5_enum.A;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        String rs = list.get(2);
        System.out.println(rs);

        //泛型不支持基本数据类型，只支持对象类型（引用数据类型）
        //ArrayList<int> list = new ArrayList<>(); //编译报错, reason: 'int' is a primitive type
        ArrayList<Integer> list1 = new ArrayList<>(); //这里的Integer是对象类型
        list1.add(10);

        ArrayList<Double> list2 = new ArrayList<>(); //这里的Double是对象类型
        list2.add(10.5);
    }
}
