package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class MethodIncorrectStoring {

    public static void main(String[] args) {
        int x = 10;
        inc(x);
        System.out.println("x = " + x); // 10
    }

    public static void inc(int x) { // BAD!!!
        x++;
    }
}
