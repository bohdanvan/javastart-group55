package com.bvan.javastart.lesson6.array;

/**
 * @author bvanchuhov
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] array = {10, 5, 30, 10, 20};

//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            int elem = array[i];
//            sum += elem;
//        }

        // for-each, READ ONLY
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }

        for (int elem : array) {
            elem = 1;
        }

        System.out.println("sum = " + sum);
    }
}
