package com.bvan.javastart.lesson7.repetition;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{10, 30, 20}) == 60); // 60
        System.out.println(sum(new int[]{}) == 0); // 0
        System.out.println(sum(new int[]{-1, 3, -10}) == -8); // -8
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
