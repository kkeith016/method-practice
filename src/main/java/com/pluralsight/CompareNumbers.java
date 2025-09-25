package com.pluralsight;

import java.sql.SQLOutput;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isEven(8));

        // Test isPositive method
        System.out.println(isPositive(-3.5));
        System.out.println(isPositive(2.0));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }


}
