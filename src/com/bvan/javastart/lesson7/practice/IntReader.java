package com.bvan.javastart.lesson7.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class IntReader {

    public static void main(String[] args) {
        int index = readIntInRange("index", 0, 99);
        System.out.println(index);
    }

    public static int readIntInRange(String name, int min, int max) {
        int res = readInt(name);
        while (res < min || res > max) {
            System.out.println("Sorry, illegal range: " + res);
            res = readInt(name);
        }
        return res;
    }

    public static int readInt(String name) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter " + name + ": ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // idle

            System.out.println("Illegal " + name);
            System.out.print("Enter " + name + ": ");
        }
        return scanner.nextInt();
    }
}
