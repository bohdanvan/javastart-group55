package com.bvan.javastart.lesson8.storing;

/**
 * @author bvanchuhov
 */
public class StringMethodIncorrectStoring {

    public static void main(String[] args) {
        String s = "Hello";
        addWorld(s);
        System.out.println(s); // Hello
    }

    public static void addWorld(String s) { // BAD!!!
        s += ", world";
    }
}
