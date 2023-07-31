package com.company;
//Task 1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception


public class Task1 {

        public static void checkNumberIsZero ( int number) throws Exception {
            if (number > 0 | number < 0) {
                System.out.println(number > 0 ? "Number > 0" : "Number < 0");
            } else throw new Exception("Number is zero!");
        }

}
