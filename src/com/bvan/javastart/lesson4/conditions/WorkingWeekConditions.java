package com.bvan.javastart.lesson4.conditions;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class WorkingWeekConditions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (1..7): ");
        int day = scanner.nextInt();

        if (day <= 5) {
            System.out.println("Work");
        } else {
            System.out.println("Friends");
            System.out.println("Party");
        }

        System.out.println("Java Courses");
    }
}
