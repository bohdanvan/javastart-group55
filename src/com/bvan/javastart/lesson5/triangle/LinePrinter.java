package com.bvan.javastart.lesson5.triangle;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class LinePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count: ");
        int count = scanner.nextInt();

        for (int n = 1; n <= count; n++) {
            System.out.print("x");
        }
        System.out.println();
    }
}
