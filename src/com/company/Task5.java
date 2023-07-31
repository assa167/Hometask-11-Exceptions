package com.company;

//Task5. Throw a NullPointerException from the method iCanThrowException();
//        Handle it in the main method.
//public class Main {
//
//    public static void main(String[] args) {
//        iCanThrowException();
//    }
//
//    public static void iCanThrowException() {
//
//    }
//
//}


public class Task5 {
        public static void iCanThrowException() { throw new NullPointerException("exeption");

    }

    public static void main(String[]args) {
    try {
    Task5.iCanThrowException();
    } catch (Exception l) {
        System.out.println("Exeption " + l);
    }
    }
}

