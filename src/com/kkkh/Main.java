package com.kkkh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

   static Scanner scanner = new Scanner(System.in);
   static Bank myBank= new Bank();

    public static void main(String[] args) {
        // write your code here


        int initial;
        do {
            System.out.println("Welcome to YCI Bank.\n" +
                    "_____________________\n" +
                "1. Open New Account.\n" +
                "2. Login\n" +
                "3. Quit.");
            initial = scanner.nextInt();

            switch (initial) {
                case 1:
                    createAcc();
                    break;
                case 2:
                   login();
                    break;
            }
        }while (initial != 3);
    }

    private static void login() {
        System.out.println("Enter account name.");
        String accName = scanner.next();

        System.out.println("Enter password.");
        String password = scanner.next();

        if (myBank.isFound(accName, password) ) {
            System.out.println("Successfully login.");

        }else {
            System.out.println("Authentication fail.");
        }
    }

    private static void createAcc() {
        System.out.println("Enter account name.");
        String accName = scanner.next();

        System.out.println("Enter password.");
        String password =scanner.next();

        System.out.println("Enter initial balance.");
        double balance = scanner.nextDouble();

        if (balance < 30) {
            System.out.println("Account create fail.");
            System.out.println("Reason: You need to fill at least 30.0$");
        }else{
            myBank.openNewAcc(accName, password, balance);
        }
    }
}
