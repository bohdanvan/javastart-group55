package com.bvan.javastart.lesson5.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class CakesV3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt();

        System.out.print("Enter critical cakes: ");
        int criticalCakes = scanner.nextInt();

        System.out.println("I have " + cakes + " cakes");
        for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++) {
            System.out.println("I have eaten " + cakeIndex + " cake");

            if (cakeIndex > criticalCakes) {
                System.out.println("I feel bad");
            }
        }
    }
}
