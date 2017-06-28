package com.bvan.javastart.lesson6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        // Create array
        int[] array = new int[5];

        int filler = 3;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }

        // Output array
        System.out.println(Arrays.toString(array));

        int length = array.length;
        System.out.println("length = " + length);
    }
}
