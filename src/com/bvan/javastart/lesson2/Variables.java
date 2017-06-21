package com.bvan.javastart.lesson2;

/**
 * @author bvanchuhov
 */
public class Variables {

    public static void main(String[] args) {
        int age = 25;

        age = age + 10; // 35
        age += 10; // 45
        age -= 5; // 40

        age += 1; // 41
        age++; // 42
        ++age; // 43

        age--; // 42
        --age; // 41

        System.out.println("My age is " + age);

        int x = 10;
        x += x++ + ++x;
        System.out.println("x = " + ++x);
    }
}
