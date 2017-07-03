package com.bvan.javastart.lesson7.practice;

/**
 * @author bvanchuhov
 */
public class ArrayEvenElemsFinder {

    public static void main(String[] args) {
        int[] array = {-3, 5, 7};
        int lastEvenElem = findLastEvenElem(array);

        if (lastEvenElem == Integer.MIN_VALUE) {
            System.out.println("Sorry, even elem is not found");
        } else {
            System.out.println(lastEvenElem);
        }
    }


    public static int findLastEvenElem(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] % 2 == 0) {
                return array[i];
            }
        }
        return Integer.MIN_VALUE; // even elem is not found
    }
}
