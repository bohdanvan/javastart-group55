package com.bvan.javastart.lesson6.array;

/**
 * @author bvanchuhov
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] array = {10, 5, 30, 10, 20};

        int max = array[0];
        for (int elem : array) { // iter
            if (max < elem) {
                max = elem;
            }
        }

        System.out.println("max = " + max);
    }
}
