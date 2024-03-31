package com.pmshark.d8_extends_application;

import com.pmshark.d5_block.Student;

public class Teacher extends People {
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void printInfo() {
        System.out.println(getName() + "的技能是" + skill);
    }
}
