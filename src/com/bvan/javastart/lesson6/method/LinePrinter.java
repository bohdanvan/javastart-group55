package com.bvan.javastart.lesson6.method;

/**
 * @author bvanchuhov
 */
public class LinePrinter {

    public static void main(String[] args) {
        printLine(10);
        printTriangle(5);
    }

    public static void printTriangle(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        for (int count = 1; count <= size; count++) {
            printLine(count);
        }
    }

    public static void printLine(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("negative count: " + count);
        }

        for (int i = 0; i < count; i++) {
            System.out.print("x");
        }
        System.out.println();
    }
}
