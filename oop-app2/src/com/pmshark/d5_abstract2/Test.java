package com.pmshark.d5_abstract2;

import com.pmshark.d4_abstract.A;

public class Test {
    public static void main(String[] args) {
        //抽象类的好处
        Animal a = new Cat();
        a.setName("Tom");
        a.cry(); //更好的支持多态
    }
}
