package com.bvan.javastart.lesson6.method;

/**
 * @author bvanchuhov
 */
public class MaxMethod {

    // Client
    public static void main(String[] args) {
        int x = max(10, 20);
        int y = max(5, 1);
        System.out.println(x); // 20
        System.out.println(y); // 5
    }

    // Creator
    public static int max(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
}
