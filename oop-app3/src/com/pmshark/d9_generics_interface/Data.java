package com.pmshark.d9_generics_interface;

import com.pmshark.d8_generics_class.Animal;

import java.util.ArrayList;

//泛型接口
//public interface Data<T extends Animal> {  //可以继承
public interface Data<T> {
    void add(T t);
    ArrayList<T> getByName(String name);
}
