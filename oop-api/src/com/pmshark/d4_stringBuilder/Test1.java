package com.pmshark.d4_stringBuilder;

public class Test1 {
    public static void main(String[] args) {
        //StringBuilder's methods and usage
        //StringBuilder sb = new StringBuilder(); // sb = ""
        StringBuilder sb = new StringBuilder("Hello"); // sb = "Hello"

        //1. append
        sb.append("World"); // sb = "Hello World"
        sb.append(12); // sb = "Hello World12"
        sb.append(true); // sb = "Hello World12true"

        System.out.println(sb); // Hello World12true

        //support method chaining
        sb.append(666).append("abc").append(false);
        System.out.println(sb);

        //2. reverse
        sb.reverse();
        System.out.println(sb); // eurt21dlroW olleHcba666false

        //3. .length()
        System.out.println(sb.length()); // 21

        //4. toString()
        String str = sb.toString();
        System.out.println(str); // eurt21dlroW olleHcba666false∂
    }
}
