package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter what calculator you would like to use: ");
        System.out.println(" 1. Mortgage, 2. Future Value, 3. Order Annuity:" );
        int userChoice = scanner.nextInt();
        if (userChoice == 1) {
            System.out.print("Enter the principal: ");
            double principal = scanner.nextDouble();
            System.out.print("Enter the interest rate: ");
            double interest_rate = scanner.nextDouble();
            System.out.print("Enter the loan length: ");
            int loan_length = scanner.nextInt();
            double monthlyPayment = (principal*(interest_rate/12))/(1-(1/(Math.pow((1+(interest_rate/12)),12*loan_length))));
            double totalIP = ((monthlyPayment*12) * loan_length) - principal;
            System.out.println("Your monthly payment is: " + monthlyPayment + "and your total interest paid is: " + totalIP);
            //(monthly payment * 12) * years - (principal)
        }
    }
}