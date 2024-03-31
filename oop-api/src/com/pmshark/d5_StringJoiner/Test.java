package com.pmshark.d5_StringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        //StringJoiner
        StringJoiner s = new StringJoiner(", ", "[", "]");
        s.add("Java1");
        s.add("Java2");
        s.add("Java3");
        System.out.println(s);

        System.out.println(getArrayData(new int[]{11, 33, 55}));


    }

    public static String getArrayData(int[] arr) {
        if (arr == null) {
            return null;
        }

        StringJoiner s = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            s.add(String.valueOf(arr[i]));
        }

        return s.toString();
    }
}
