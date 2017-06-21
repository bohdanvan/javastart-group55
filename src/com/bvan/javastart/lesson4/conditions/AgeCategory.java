package com.bvan.javastart.lesson4.conditions;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class AgeCategory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // BL
        String ageCategory;
        if (age > 18) {
            ageCategory = "Adult";
        } else {
            ageCategory = "Young";
        }
//        String ageCategory = (age > 18) ? "Adult" : "Young";

        // Output
        System.out.println(ageCategory);
    }
}
