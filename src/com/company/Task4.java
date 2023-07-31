package com.company;

//Task4. Fix the program to make it work:
//public static void main(String[] args) {
//        try {
//        int a = 0;
//        int b = 4 / a;
//        } catch (Exception e) {
//        e.printStackTrace();
//        } catch (ArithmeticException e) {
//        e.printStackTrace();
//        }
//        }

public class Task4 {

    public static void goodMethod() {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException l) {
            l.printStackTrace();
        } catch (Exception l) {
            l.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            Task4.goodMethod();
        } catch (Exception l) {
            System.err.println("Exception " + l);
        }
    }
}
