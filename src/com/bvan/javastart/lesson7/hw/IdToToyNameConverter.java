package com.bvan.javastart.lesson7.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IdToToyNameConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number toy: ");
        int toy = scan.nextInt();
        if (toy < 0 || toy > 3) {
            System.out.println("Sorry, illegal toy id: " + toy);
            System.exit(0);
        }

        String name = getToyName(toy);
        System.out.println(name);
    }

    private static String getToyName(int toy) {
        if (toy == 0)
            return "Car";
        if (toy == 1)
            return "Lego";
        if (toy == 2)
            return "Doll";
        if (toy == 3)
            return "Puzzle";
        throw new IllegalArgumentException("IllegalArgumentException");
    }
}
