package com.company;

//3. Finish the program to handle all the possible exceptions:
//public class Main {
//
//    public static void main(String[] args) {
//        int a = args.length;
//        System.out.println(a);
//
//        int b = 10 / a;
//        int[] c = {1};
//        System.out.println(c[1]);
//
//    }
//
//}
//    Print the cause of the exception to the console.

public class Task3 {
        public static void exept(String[] args) {
                try {
                        int a = args.length;
                        System.out.println(a);

                        int b = 10 / a;
                        int[] c = {1};
                        System.out.println(c[1]);
                } catch (ArithmeticException | ArrayIndexOutOfBoundsException h) {
                        System.out.println("Exceptions:" + h);
                }
    }

        public static void main(String[] args) {
                try {
                        Task3.exept(args);
                        args = new String[15];
                        Task3.exept(args);
                } catch (Exception h) {
                        System.out.println("Exception" + h);
                }
        }
}
