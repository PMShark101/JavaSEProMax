package com.pmshark.d8_generics_class;

import com.pmshark.d5_enum.A;

public class Test {
    public static void main(String[] args) {
        //泛型类
        MyArrayList<String> list = new MyArrayList();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        //list.add(1); //编译报错
        String ele = list.get(1);
        System.out.println(ele);

        MyClass2<Cat, String> c2 = new MyClass2<>();

        //MyClass3<String> c3 = new MyClass3<String>(); //报错
        MyClass3<Animal> c3 = new MyClass3<>();
        MyClass3<Cat> c4 = new MyClass3<>();
    }
}



