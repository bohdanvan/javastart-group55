package com.bvan.javastart.lesson7.hw;

/**
 * @author bvanchuhov
 */
public class ArrayPositiveFinder {

    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 10, 15, 30, -6};
        System.out.println(findFirstPositiveElemIndex(arr1) == 2); // 2
        System.out.println(findLastPositiveElemIndex(arr1) == 4); // 4

        int[] arr2 = {-10, -30, 0};
        System.out.println(findFirstPositiveElemIndex(arr2) == -1); // -1
        System.out.println(findLastPositiveElemIndex(arr2) == -1); // -1
    }

    public static int findFirstPositiveElemIndex(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null value");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1; // positive elem is not found
    }

    public static int findLastPositiveElemIndex(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1; // positive elem is not found
    }
}