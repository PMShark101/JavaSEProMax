package com.pmshark.d6_enum2;

public class Test {
    public static void main(String[] args) {
        //掌握枚举的应用场景，做信息标志和分类
        //check(1);
        check(constant2.GIRL);


    }
    public static void check(constant2 sex) {
        switch (sex) {
            case BOY:
                System.out.println("show some videos and pictures");
                break;
            case GIRL:
                System.out.println("show some rich men's information");
                break;

        }
    }

//    public static void check(int sex) {
//        switch (sex) {
//            case constant.BOY:
//                System.out.println("show some videos and pictures");
//                break;
//            case constant.GIRL:
//                System.out.println("show some rich men's information");
//                break;
//
//        }
//    }
}
