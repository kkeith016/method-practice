package com.pluralsight;

public class Format {
    public static void main(String[] args) {
    // Call the method directly in println
    System.out.println(formatName("Bob", "Smith"));

    // Bonus: store the result in a variable and print it
    String formattedName = formatName("Alice", "Johnson");
    System.out.println(formattedName);
}

    // Method that formats the name as "Last, First"
    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}