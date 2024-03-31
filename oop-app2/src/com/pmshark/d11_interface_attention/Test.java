package com.pmshark.d11_interface_attention;

public class Test {
    public static void main(String[] args) {
        //接口的多继承


    }

    interface A {
        void test1();
    }

    interface B {
        void test2();
    }

    interface C {
    }

    interface D extends A, B, C {
    }
    class E implements D {
        @Override
        public void test1() {

        }

        @Override
        public void test2() {

        }
    }
}
