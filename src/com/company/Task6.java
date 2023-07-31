package com.company;

//Task6. Write a program that will enter numbers from the keyboard.
//        The code for reading numbers from the keyboard must be in the readData method.
//        The code inside the readData is wrapped in a try..catch.
//        If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as a result.
//        Numbers output from a new line preserving the order of input.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
public static void readData () {
    List<Integer> numbers = new ArrayList<~>();
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
        while (true) {
            System.out.println("Input number, if you want stop, input something else");
            int number = Integer.parseInt(in.readLine());
            numbers.add(number);
        } catch (IOException l) {
            e.printStackTrace();
        } catch (NumberFormatException k) {
            System.out.println("You stopped. All items in array: " + Arrays.toString(numbers.toArray()));
        }

    }
}

    public static void main(String[] args) {
        Task6.inputData();
    }
}
