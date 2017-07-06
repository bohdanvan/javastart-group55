package com.bvan.javastart.lesson8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class NamesExample {

    public static void main(String[] args) {
        String[] names = {
                "John",
                "Bob",
                "Phil"
        };

        char c = names[0].charAt(3);
        System.out.println(c);

        System.out.println(Arrays.toString(names));
    }
}
