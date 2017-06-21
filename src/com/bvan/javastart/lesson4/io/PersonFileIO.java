package com.bvan.javastart.lesson4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonFileIO {

    public static void main(String[] args) throws FileNotFoundException {
        // Input
        // 1. Create object Scanner
        File file = new File("files/person.txt");
        Scanner scan = new Scanner(file);

        // 2. Read string
        String name = scan.next();

        // 3. Read int
        int age = scan.nextInt();

        // 4. Close Scanner
        scan.close();

        // BL
        String message = "Hello, I'm " + name + ", " + age + " years old";

        // Output
        System.out.println(message);
    }
}
