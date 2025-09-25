package com.pluralsight;

public class MethodPractice {
    public static void main(String[] args) {
        sayHello();
        sayGoodbye();
        sayGoodMorning();
        sayMenu();
        sayMenu();

    }
    public static void sayHello(){
        System.out.println("Hello World!");
    }
    public static void sayGoodbye(){
        System.out.println("Goodbye World!");
    }
    public static void sayGoodMorning(){
        System.out.println("Good morning!");
    }

    //Menu method
    public static void sayMenu(){
        System.out.println("=== MENU ===");
        System.out.println("1. Coffee - $3.99");
        System.out.println("2. Tea - $2.99");
        System.out.println("3. Cookie - $1.99");
    }
}
