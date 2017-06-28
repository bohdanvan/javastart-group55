package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySeqFiller {

    public static void main(String[] args) {
        int[] array = new int[100];

        // fori
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 * (i + 1);
        }

        System.out.println(Arrays.toString(array));
    }
}
