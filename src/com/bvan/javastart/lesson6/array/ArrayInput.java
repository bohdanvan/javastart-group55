package com.bvan.javastart.lesson6.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ArrayInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
    }
}
