package com.pmshark.d14_extends_constructor;

public class Test2 {
    public static void main(String[] args) {
        //子类构造器为什么要调用父类的构造器
        Teacher teacher = new Teacher("张三", 36, "Java");
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getSkill());
    }
}

class Teacher extends People {
    private String skill;

    public Teacher(String name, int age, String skill) {
        super(name, age); //默认调用父类的无参构造器,如果父类没有无参构造器，必须手动调用父类的有参构造器
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
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
