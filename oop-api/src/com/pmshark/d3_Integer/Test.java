package com.pmshark.d3_Integer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //how to use Package Object
        //Integer a1 = new Integer(12); // deprecated
        Integer a1 = Integer.valueOf(12);
        System.out.println(a1);

        //auto boxing
        Integer a2 = 15; // Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

        //auto unboxing
        int a3 = a2; // int a3 = a2.intValue();
        System.out.println(a3);

        //Generics and ArrayList don't support primitive types, only support objects
        //ArrayList<int> list = new ArrayList<int>(); // error
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(22);
        list.add(33);

        int rs = list.get(1); // auto unboxing
        System.out.println(rs);
        System.out.println("----------------------");

        //1. Integer to String
        Integer a = 100;

        String rs1 = Integer.toString(a); // "100"
        System.out.println(rs1 + 1); // 1001

        String rs2 = a.toString(); // "100"
        System.out.println(rs2 + 1); // 1001

        String rs3 = a + ""; // "100"
        System.out.println(rs3 + 1); // 1001

        //2. String to basicDataTypes(Integer, Double, Float, Long, Short, Byte)
        //String ageStr =  "29a"; //NumberFormatException
        String ageStr =  "29";
        //int ageI = Integer.parseInt(ageStr); //explain: Integer.valueOf(ageStr).intValue();
        int ageI = Integer.valueOf(ageStr);
        System.out.println(ageI + 1); // 30

        String scoreStr = "99.5";
        //double scoreD = Double.parseDouble(scoreStr);
        double scoreD = Double.valueOf(scoreStr);
        System.out.println(scoreD + 1); // 100.5

    }
}
