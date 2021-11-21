package com.geekBrains;

public class Main {
    public static void main(String[] args) {
        System.out.println(resultSum(10, 20));
        positiveAndNegative(-2);
        System.out.println(posAndNeg(0));
        sizeAndNumber("Hello", 3);
        System.out.println(leapYear(4));
    }

    public static boolean resultSum(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void positiveAndNegative(int x) {
        System.out.println(x >= 0 ? "Число положительное!" : "Число отрицательное!");
    }

    public static boolean posAndNeg(int x) {
        return x >= 0;
    }

    public static void sizeAndNumber(String size, int number) {
        for (int i = 0; i < number; i++ ) {
            System.out.println(size);
        }
    }

    public static boolean leapYear(int year){
        return year == 400 || year % 4 == 0 && year % 100 != 0;
    }
}
