package com.bvan.javastart.lesson3.double_type;

/**
 * @author bvanchuhov
 */
public class MoneyStoring {

    public static void main(String[] args) {
        // BigDecimal
        long money = 260098317;
        double moneyForOutput = (double)money / 10_000_000;

        System.out.println(moneyForOutput);
    }
}
