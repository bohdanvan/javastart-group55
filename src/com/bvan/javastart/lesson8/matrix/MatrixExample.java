package com.bvan.javastart.lesson8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MatrixExample {

    public static void main(String[] args) {
        int[][] board = new int[3][10];
        printMatrix(board);
    }

    public static void test1() {
        int[][] matrix = {
                {0, 1, 2},
                {3, 4},
                {5, 6, 7}
        };

        int elem = matrix[2][1];
        System.out.println(elem);

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("null");
            return;
        }

        for (int[] row : matrix) {
            printArray(row);
        }
    }

    public static void printArray(int[] row) {
        if (row == null) {
            System.out.println("null");
            return;
        }

        for (int elem : row) {
            System.out.print(elem + "\t|\t");
        }
        System.out.println();
    }
}
