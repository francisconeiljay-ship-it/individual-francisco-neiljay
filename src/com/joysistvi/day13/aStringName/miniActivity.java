package com.joysistvi.day13.aStringName;

import java.util.Scanner;
public class miniActivity {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String userName = "NeilGwapo";
        String userPassword = "NeilPogi143";

        System.out.println(" ");
        for (int i = 1; i <= 5; i++){
            System.out.println("Welcome to Pisbook ");
            System.out.print("Enter Username:  ");
            String name = myScanner.nextLine();

            System.out.print("Enter Password: ");
            String password = myScanner.nextLine();

            System.out.println(" ");
            if (password.equals("NeilPogi143") && name.equals("NeilGwapo")){
                System.out.println("Login Successfully! ");
                System.out.println("Hi ! " + userName);
                System.out.println("Willcom 2 Pisbook ");
                break;
            } else {
                System.out.println("Invalid login! ");
                System.out.println("Access Denied");
            }

            System.out.println(" ");
            if (i < 5){
                System.out.println("Attemps Remaining: " + (5-i));
            } else {
                System.out.println("Maximum Attempts reached. ");
            }
        }
        myScanner.close();
    }

}
