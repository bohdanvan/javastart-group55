package com.bvan.javastart.lesson7.repetition;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] array = {30, 50, 100, 300, 200};

        array[1] = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        for (int elem : array) { // READ-ONLY
            System.out.println(elem);
        }

        System.out.println(Arrays.toString(array));
    }
}
