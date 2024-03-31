package com.pmshark.d1_api_object;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Override equals method
    @Override
    public boolean equals(Object o) {
        //1. check if the object is the same object
        if (this == o) return true;
        //2. check if the object is null, or the class is different
        //getClass() returns the runtime class of this Object
        if (o == null || this.getClass() != o.getClass()) return false;
        //3. check if the content of the object is the same
        Student student = (Student) o;
        return this.age == student.age && Objects.equals(this.name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
