package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.print(isEven(8));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
