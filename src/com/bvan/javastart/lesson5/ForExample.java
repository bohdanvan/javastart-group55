package com.bvan.javastart.lesson5;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        for (int n = 10; n <= 20; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n = 30; n >= 25; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 10; n <= 20; n = n + 2) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 200; n >= 0; n -= 10) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
