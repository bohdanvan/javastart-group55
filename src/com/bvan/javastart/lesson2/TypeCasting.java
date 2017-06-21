package com.bvan.javastart.lesson2;

/**
 * @author bvanchuhov
 */
public class TypeCasting {

    public static void main(String[] args) {
        int x = 10; // 4B
        long y = 1234567890123456789L; // 8B
        int z = (int)(x + y); // BAD CODE!!!
        System.out.println("z = " + z);
    }
}
