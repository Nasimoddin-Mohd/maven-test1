package com.example.javamavenjunithelloworld;

public class Utility {

    public static void nasimoddin() {
        System.out.println("I am Nasimoddin");
    }

    // a. Check if the given number is odd or even
    public static String isEvenOrOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    // b. Check divisibility
    public static boolean isDivisibleBy2(int x) {
        return (x % 2 == 0);
    }

    public static boolean isDivisibleBy3(int y) {
        return (y % 3 == 0);
    }

    public static boolean isDivisibleBy4(int z) {
        return (z % 4 == 0);
    }

    public static boolean isDivisibleBy5(int w) {
        return (w % 5 == 0);
    }

    public static boolean isDivisibleBy6(int a) {
        return (a % 6 == 0);
    }

    public static boolean isDivisibleBy7(int b) {
        return (b % 7 == 0);
    }

    public static boolean isDivisibleBy8(int c) {
        return (c % 8 == 0);
    }

    public static boolean isDivisibleBy9(int d) {
        return (d % 9 == 0);
    }

    // c. Compare the given 2 numbers and return the bigger number
    public static int compareTwoNumbers(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    // d. Find the biggest number among 3 given numbers
    public static int findBiggestOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // e. Write the function to print the numbers from 1 to 10
    public static void printNumbersFrom1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // f. Check if the given year is a leap year or not
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // g. Add 2 numbers
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    // h. Multiply 2 numbers
    public static int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }

    // i. Divide 2 numbers
    public static double divideTwoNumbers(double a, double b) {
        return a / b;
    }

    // j. (a+b)^2
    public static int squareOfSum(int a, int b) {
        return (a + b) * (a + b);
    }

    // k. Find the area of the circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // l. Find the area of the square
    public static double areaOfSquare(double side) {
        return side * side;
    }

    // m. Find the area of the rectangle
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // n. Find the area of a triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // o. Find the square root of the given number
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }
}