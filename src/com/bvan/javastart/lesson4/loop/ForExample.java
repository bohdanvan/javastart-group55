package com.bvan.javastart.lesson4.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        for (int a = 1, b = 20; a < b ; a += 2, b -= 3) {
            System.out.println("a = " + a + ", b = " + b);
        }
    }
}

/*
a = 1, b = 20
a = 3, b = 17
a = 5, b = 14
a = 7, b = 11
 */