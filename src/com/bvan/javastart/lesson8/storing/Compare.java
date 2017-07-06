package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class Compare {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println(x == y); // true

        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("ref: " + (s1 == s2)); // false
        System.out.println("content: " + s1.equals(s2)); // true
    }
}
