/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */
import java.util.Scanner;

public class SimpleMath {


    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        float num1, num2;

        System.out.print("What is the first number? ");
        num1 = user_input.nextFloat();
        System.out.printf("What is the second number? ");
        num2 = user_input.nextFloat();

        System.out.print("\nAddition: " +num1+ " + " +num2+ " = " +(num1+num2));
        System.out.print("\nSubtraction: " +num1+ " - " +num2+ " = " +(num1-num2));
        System.out.print("\nMultiplication: " +num1+ " * " +num2+ " = " +(num1*num2));
        System.out.print("\nDivision: " +num1+ " / " +num2+ " = " +(num1/num2));

    }

}
