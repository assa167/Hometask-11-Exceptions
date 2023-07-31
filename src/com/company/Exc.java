package com.company;

import java.util.Scanner;

public class Exc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getNum();
        int num2 = getNum();
        char opera = getOper();
        int result = calc(num1, num2, opera);
        System.out.println("Результат операции: " + result);
    }

    public static int getNum() {
        System.out.println("Введите число");
        int num;
        if (scanner.hasNextInt()) {   //hasNextInt - начало работать корректно, пока было hasNext вылетал Exception при неправильно введенном значении
            num = scanner.nextInt();
        } else {
            System.out.println("Неверно введенное число. Попробуйте еще раз ");
            scanner.next();
            num = getNum();
        }
        return num;
    }

    public static char getOper() {
        System.out.println("Ввести операцию");
        char opera;
        if (scanner.hasNext()) {
            opera = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе символа");
            scanner.next();
            opera = getOper();
        }
        return opera;
    }

    public static int calc(int num1, int num2, char opera) {
        int result;
        switch (opera) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверно введенная операция. Попробуйте еще раз.");
                result = calc(num1, num2, opera);
        }
        return result;

    }


}
