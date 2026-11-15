package com.joysistvi.day20.encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("*         User Account Registration         *");
        System.out.println("*********************************************\n");

        System.out.print("Enter First Name: ");
        String fName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String mName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        UserAccount account = new UserAccount(fName, mName, lName, address, email, password);

        System.out.println("\n" + account.toString());
        scanner.close();
    }

}