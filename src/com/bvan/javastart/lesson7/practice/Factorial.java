package com.bvan.javastart.lesson7.practice;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(0)); // 1
        System.out.println(factorial(1)); // 1
        System.out.println(factorial(3)); // 6
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(21));

        System.out.println(factorial(1000));
        System.out.println(factorial(100000));
    }

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("factorial arg is negative: " + n);
        }

        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
