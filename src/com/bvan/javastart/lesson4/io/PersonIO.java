package com.bvan.javastart.lesson4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonIO {

    public static void main(String[] args) {
        // Input
        // 1. Create object Scanner
        Scanner scan = new Scanner(System.in);

        // 2. Read string
        System.out.print("Enter name: ");
        String name = scan.next();

        // 3. Read int
        System.out.print("Enter age: ");
        int age = scan.nextInt();

        // 4. Close Scanner (optional)
        scan.close();

        // BL
        String message = "Hello, I'm " + name + ", " + age
                 + " years old";

        // Output
        System.out.println(message);
    }
}
