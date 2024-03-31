package com.pmshark.d4_stringBuilder;

import java.util.StringJoiner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getArrayData(new int[]{11, 33, 55}));
    }

    public static String getArrayData(int[] arr) {
        if (arr == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(",");
        }
        sb.setCharAt(sb.length() - 1, ']');

        return sb.toString();
    }
}
