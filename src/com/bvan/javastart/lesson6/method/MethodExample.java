package com.bvan.javastart.lesson6.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    public static void main(String[] args) {
        int sum1 = 0;
        for (int n = 100; n <= 200; n++) {
            sum1 += n;
        }

        int sum2 = 0;
        for (int n = 300; n <= 350; n++) {
            sum2 += n;
        }

        int max;
        if (sum1 > sum2) {
            max = sum1;
        } else {
            max = sum2;
        }

        System.out.println("max = " + max);
    }
}
