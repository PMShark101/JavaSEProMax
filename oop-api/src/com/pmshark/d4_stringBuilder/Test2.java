package com.pmshark.d4_stringBuilder;

public class Test2 {
    public static void main(String[] args) {
        // StringBuilder's advantage is that it can be modified directly
        //splice_abc_10m_times
//        String rs = "";
//        for (int i = 1; i <= 1000000; i++) {
//            rs += "abc";
//        }
//        System.out.println(rs);

        //StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
        //StringBuilder is not thread-safe, but it is faster than StringBuffer
    }

}
