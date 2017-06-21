package com.bvan.javastart.lesson4.conditions;

/**
 * @author bvanchuhov
 */
public class ComplexConditionExample {

    public static void main(String[] args) {
        int x = 4;

        if (x < 20) {
            System.out.println("1");

            if (x > 5) {
                System.out.println("3");
            }
        } else {
            System.out.println("2");
        }

        System.out.println("Goodbye");
    }
}
