package com.pmshark.d10_generics_method;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //泛型方法
        String rs = test("hello");
        System.out.println(rs);

        Dog d = test(new Dog());
        System.out.println(d);

        //所有的汽车可以一起参加比赛
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BMW());
        cars.add(new BENZ());
        go(cars);


        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        go(dogs); //编译报错
    }

    //?:通配符，使用泛型的时候表示任意类型 | ? extends Car（上限）| ? super Car（下限）
    public static void go(ArrayList<? extends Car> cars) {
    }

//    public static <T extends Car> void go(ArrayList<T> cars) {
//    }

    //泛型方法
    public static <T> T test(T t) {
        return t;
    }
}
