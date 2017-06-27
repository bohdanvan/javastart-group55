package com.bvan.javastart.lesson5;

/**
 * @author bvanchuhov
 */
public class IfExample {

    public static void main(String[] args) {
        int x = 150;

        // && - AND
        // || - OR

        if (x < 100 || x > 200) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}
