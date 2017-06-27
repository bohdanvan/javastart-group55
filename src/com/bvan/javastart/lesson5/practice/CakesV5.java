package com.bvan.javastart.lesson5.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class CakesV5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter people: ");
        int people = scanner.nextInt();

        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt();

        for (int person = 1; person <= people; person++) {
            System.out.println("I'm " + person + " person. " +
                    "I have " + cakes + " cakes");

            for (int cake = 1; cake <= cakes; cake++) {
                System.out.println("I'm " + person + " person. " +
                        "I have eaten " + cake + " cakes");
            }

            System.out.println();
        }
    }
}
