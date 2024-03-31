package com.pmshark.d5_enum;

public enum A {
    //主要事项：枚举类的第一行必须是枚举值，最后一个枚举值后面可以有逗号，也可以没有
    X, Y, Z;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
