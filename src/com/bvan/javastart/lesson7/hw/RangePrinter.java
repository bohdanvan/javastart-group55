package com.bvan.javastart.lesson7.hw;

/**
 * @author bvanchuhov
 */
public class RangePrinter {

    public static void main(String[] args) {
        printRange(1, 5); // 1 2 3 4 5
        printRange(5, 1); // 5 4 3 2 1
        printRange(1, 1); // 1
    }

    //the method is here:
    public static void printRange(int first, int last) {
        if (first < last) {
            for (int c = first; c <= last; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        } else {
            for (int c = first; c >= last; c--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}