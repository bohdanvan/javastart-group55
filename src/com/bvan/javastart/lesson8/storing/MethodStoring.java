package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class MethodStoring {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int x = sum(a, b);
        System.out.println("x = " + x); // 30
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
