package com.bvan.javastart.lesson3.boolean_type;

/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        int x = 10;
        boolean b3 = x < 20; // T
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        System.out.println(x < 20); // T
        System.out.println(x >= 11); // F
        System.out.println(x <= 10); // T
        System.out.println(x == 20); // F
        System.out.println(x != 20); // T
    }
}
