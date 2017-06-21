package com.bvan.javastart.lesson4.conditions;

/**
 * @author bvanchuhov
 */
public class RangeExample {

    public static void main(String[] args) {
        int x = -10;

        if (x > 5 && x < 30) {
            System.out.println("1");
        }

        if (x < 1 || x > 50) {
            System.out.println("2");
        }

        System.out.println("Goodbye");
    }
}
