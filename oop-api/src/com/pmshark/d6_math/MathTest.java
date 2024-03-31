package com.pmshark.d6_math;

public class MathTest {
    public static void main(String[] args) {
        //1. Math.abs: absolute value
        System.out.println(Math.abs(-12)); // 12
        System.out.println(Math.abs(12)); // 12
        System.out.println(Math.abs(-12.4)); // 12.4

        //2. Math.ceil: round up
        System.out.println(Math.ceil(12.00001)); // 13.0
        System.out.println(Math.ceil(12.0)); // 12.0
        System.out.println(Math.ceil(12.99999)); // 13.0

        //3. Math.floor: round down
        System.out.println(Math.floor(12.00001)); // 12.0
        System.out.println(Math.floor(12.0)); // 12.0
        System.out.println(Math.floor(12.99999)); // 12.0

        //4. Math.round: round
        System.out.println(Math.round(3.4999)); // 3
        System.out.println(Math.round(3.5)); // 4
        System.out.println(Math.round(3.50001)); // 4

        //5. Math.max: maximum
        System.out.println(Math.max(12, 23)); // 23
        System.out.println(Math.max(12.3, 12.4)); // 12.4

        //6. Math.min: minimum
        System.out.println(Math.min(12, 23)); // 12
        System.out.println(Math.min(12.3, 12.4)); // 12.3

        //7. Math.pow: power
        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(Math.pow(2, 0)); // 1.0
        System.out.println(Math.pow(2, -1)); // 0.5

        //8. Math.sqrt: square root
        System.out.println(Math.sqrt(16)); // 4.0
        System.out.println(Math.sqrt(2)); // 1.4142135623730951

        //9. Math.random: random number
        System.out.println(Math.random()); // [0.0, 1.0)
        System.out.println(Math.random() * 100); // [0.0, 100.0)
        System.out.println((int) (Math.random() * 100)); // [0, 100)
    }
}
