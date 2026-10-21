package com.joysistvi.day6.conditional;

import java.util.Scanner;
public class Activity4_Francisco {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int myAge = myScanner.nextInt();

        if ( myAge >= 0 && myAge <= 2){
            System.out.println("Baby");
        } else if ( myAge  >= 3 && myAge <= 12) {
            System.out.println("Child");
        } else if ( myAge >= 13 && myAge <= 19 ) {
            System.out.println("Teenager");
        } else if ( myAge >= 20 && myAge <= 29 ) {
            System.out.println("Young Adult");
        } else if ( myAge >= 30 && myAge <= 59 ) {
            System.out.println("Adult");
        } else if ( myAge >= 60 && myAge <= 100 ) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid Age");
        }
    }
}
