package com.company;

//Task2. Fix the method with try-catch to get the correct result of division:
//2. Fix the method with try-catch to get the correct result of division:
public class Task2 {

    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        int a = 5;
        int b = 2;
        int rez = 0;
        try {
            rez =  a / b;
        } catch (Exception t) {

        }
        return rez;
    }
}

