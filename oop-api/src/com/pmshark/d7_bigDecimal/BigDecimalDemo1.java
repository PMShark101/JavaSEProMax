package com.pmshark.d7_bigDecimal;

import java.awt.image.DataBufferDouble;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //BigDecimal
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("-------------------------------");

        //1. 把他们变成字符串封装成BigDecimal对象来运算
//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1); // +
        BigDecimal c2 = a1.subtract(b1); // -
        BigDecimal c3 = a1.multiply(b1); // *
        BigDecimal c4 = a1.divide(b1); // /

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);

        //BigDecimal m = i.divide(j); // ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        BigDecimal m = i.divide(j, 2, RoundingMode.HALF_UP); // 2: keep 2 decimal places, RoundingMode.HALF_UP: rounding mode (half up)
        System.out.println(m);

        //put BigDecimal into double
        double rs = m.doubleValue();
        System.out.println(rs);
    }
}
