package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int balance = 5000, withdraw, deposit;
        Scanner input = new Scanner(System.in);
        int pin = 1234;


        while (true) {
            System.out.print("Please Enter Your ATM Pin Code:");
            int u = input.nextInt();
            if (u == pin) {
                while (true) {
                    System.out.println("Welcome SYED MINHAJ-UL-HASSAN to ATM Service");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Choose 1 for Withdraw");
                    System.out.println("Choose 2 for Deposit");
                    System.out.println("Choose 3 for Check Balance");
                    System.out.println("Choose 4 for EXIT");
                    System.out.print("Choose the operation you want to perform:");
                    int n = input.nextInt();
                    switch (n) {
                        case 1:
                            System.out.print("Enter money to be withdrawn:");
                            withdraw = input.nextInt();
                            if (balance >= withdraw) {
                                balance = balance - withdraw;
                                System.out.println("Please collect your money of Rs: "+withdraw);
                                System.out.println("Your remaining Balance : "+balance);
                                System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                            } else {
                                System.out.println("Insufficient Balance");
                                System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                            }
                            System.out.println("");
                            break;

                        case 2:
                            System.out.print("Enter money to be deposited:");
                            deposit = input.nextInt();
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully depsited");
                            System.out.println("Now Your Balance : "+balance);
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                            System.out.println("");
                            break;

                        case 3:
                            System.out.println("Your Balance : " + balance);
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                            System.out.println("");
                            break;

                        case 4:
                            System.exit(0);
                    }
                }
            }
            else {
                System.out.print("You Entered invalid Pin Code ");
            }
        }
    }
}