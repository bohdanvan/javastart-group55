package com.bvan.javastart.lesson4.conditions;

/**
 * @author bvanchuhov
 */
public class IfChainExample {

    public static void main(String[] args) {
        int age = 10;

        if (age <= 6) {
            System.out.println("young");
        } else if (age <= 18) {
            System.out.println("teenager");
        } else if (age <= 60) {
            System.out.println("adult");
        } else {
            System.out.println("old");
        }
    }
}
