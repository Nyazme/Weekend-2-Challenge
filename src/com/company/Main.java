package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// build a bank account class that contains different pieces of information.
        // "Bank Account Number", "Account Holder Name", and "Balance".
        // All three member fields should be set in the constructor method,
        // using arguments to set the values. Make two methods named "Withdraw" and "Deposit".
        // Withdraw should deduct money from the account, deposit should add money to the account.
        // Both of the methods should accept an argument to altar the account. write your code here
        //class Bank Account extends {}

                Boolean ask = true;

        Scanner sc = new Scanner(System.in);

        while(ask) {
            System.out.println("Welcome to the BankAccount.");
            System.out.println("***BankAccount - Balance***");

            String[] questions = {
                    "Please enter Bank Account Number:",
                    "Please enter Employee Full Name:",
                    "Please enter Checking Account Balance:",
                    "Please enter deposit:",

                    };

            List<String> answers = new ArrayList<>();

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                String userEntry = sc.nextLine();
                answers.add(userEntry);
            }

            //String BalanceString = answers.get(3);
            //int Balance = Integer.parseInt(balanceString);

            //int balanceBankAccount = balance/3;

            //System.out.println("Paid every two weeks Salary: " + everyTwoWeeksSalary);

            System.out.println("Do you want to enter another employee?");
            String responseFromUser = sc.nextLine();
            if (responseFromUser.equalsIgnoreCase("yes") ||
                    responseFromUser.equalsIgnoreCase("y")) {
                ask = true;
            } else
                {
                ask = false;
            }
        }
    }
}



