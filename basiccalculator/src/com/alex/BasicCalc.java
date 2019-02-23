package com.alex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BasicCalc {
    public static void basic(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Basic calculator , Enter a value , 'X' TO STOP");

        double number1 = scanner.nextDouble();
        System.out.println("recieved first number: " + number1 + " please input operator");

        String operator = scanner.next();

        System.out.println("recieved operator: " + operator + " input second number");

        double number2 = scanner.nextDouble();
        System.out.println("second number:  " + number2 );


        double total = 0;
        if (operator.contains("-")) {
            total = number1 - number2;

        } else if (operator.contains("+")) {
                total = number1 + number2;

        } else if (operator.contains("*")) {
            total = number1 * number2;

        } else if (operator.contains("/")) {
            total = number1 / number2;

        } else {
            System.out.println("no operator selected");
        }

        System.out.println("this is the total " + total);
        basic();
    }
    public static void main(String[] args) {
	// write your code here
        basic();

















    }
}
