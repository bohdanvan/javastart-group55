package com.bvan.javastart.lesson8.storing;

import java.util.Arrays;


/**
 * @author bvanchuhov
 */
public class ArrayMethodStoring {

    public static void main(String[] args) {
        int[] a = new int[10];
        fill(a, 1);
        System.out.println(Arrays.toString(a));
    }

    public static void fill(int[] a, int filler) {
        for (int i = 0; i < a.length; i++) {
            a[i] = filler;
        }
    }
}
