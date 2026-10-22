package com.joysistvi.day7;

import java.util.Scanner;
public class Activity5_Francisco {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String dial = myScanner.nextLine();

        if (!dial.equals("*143#")) {
            System.out.println("Invalid code");
            myScanner.close();
            return;
        }

        System.out.println(" ");
        System.out.println(" *   Load Registration   *");
        System.out.println("[1] Go+");
        System.out.println("[2] Go");
        System.out.println("[3] GoExtra");
        System.out.println("[4] Unli 5G");
        System.out.println("[5] ALLNET");

        System.out.println(" ");
        System.out.print("Enter a choice: ");
        int code = myScanner.nextInt();

        System.out.println(" ");

        if (code == 1) {
            System.out.println(" **** Go+ Promos **** ");
            System.out.println("[1] Go+99");
            System.out.println("[2] Go+129");
            System.out.println("[3] Go+149");

        } else if (code == 2) {
            System.out.println(" **** Go Promos **** ");
            System.out.println("[1] Go50");
            System.out.println("[2] Go90");
            System.out.println("[3] Go120");

        } else if (code == 3) {
            System.out.println(" **** Go Extra Promos **** ");
            System.out.println("[1] GoExtra99");
            System.out.println("[2] GoExtra129");
            System.out.println("[3] GoExtra149");

        } else if (code == 4) {
            System.out.println(" **** UNLI 5G Promos **** ");
            System.out.println("[1] UNLI 5G 99");
            System.out.println("[2] UNLI 5G 149");
            System.out.println("[3] UNLI 5G 199");

        } else if (code == 5) {
            System.out.println(" **** ALLNET Promos **** ");
            System.out.println("[1] ALLNET99");
            System.out.println("[2] ALLNET149");
            System.out.println("[3] ALLNET199");

        } else {
            System.out.println("Invalid code");
            myScanner.close();
            return;
        }

        System.out.print("Enter promo choice: ");
        int choice = myScanner.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid Choice");
            myScanner.close();
            return;
        }

        System.out.println(" ");

        switch (choice) {

            case 1:

                if (code == 1) {
                    System.out.println("Go+99");
                } else if (code == 2) {
                    System.out.println("Go50");
                } else if (code == 3) {
                    System.out.println("GoExtra99");
                } else if (code == 4) {
                    System.out.println("UNLI 5G 99");
                } else {
                    System.out.println("ALLNET99");
                }
                break;

            case 2:

                if (code == 1) {
                    System.out.println("Go+129");
                } else if (code == 2) {
                    System.out.println("Go90");
                } else if (code == 3) {
                    System.out.println("GoExtra129");
                } else if (code == 4) {
                    System.out.println("UNLI 5G 149");
                } else {
                    System.out.println("ALLNET149");
                }
                break;

            case 3:

                if (code == 1) {
                    System.out.println("Go+149");
                } else if (code == 2) {
                    System.out.println("Go120");
                } else if (code == 3) {
                    System.out.println("GoExtra149");
                } else if (code == 4) {
                    System.out.println("UNLI 5G 199");
                } else {
                    System.out.println("ALLNET199");
                }
                break;
        }

        System.out.println("Get 8 GB for all sites");
        System.out.println("[1] Subscribe");
        System.out.println("[2] Exit");
        System.out.print("Enter Choice: ");

        int action = myScanner.nextInt();

        if (action == 1) {

            if (code == 1) {
                if (choice == 1) {
                    System.out.println("You are now subscribed to Go+99");
                } else if (choice == 2) {
                    System.out.println("You are now subscribed to Go+129");
                } else {
                    System.out.println("You are now subscribed to Go+149");
                }

            } else if (code == 2) {
                if (choice == 1) {
                    System.out.println("You are now subscribed to Go50");
                } else if (choice == 2) {
                    System.out.println("You are now subscribed to Go90");
                } else {
                    System.out.println("You are now subscribed to Go120");
                }

            } else if (code == 3) {
                if (choice == 1) {
                    System.out.println("You are now subscribed to GoExtra99");
                } else if (choice == 2) {
                    System.out.println("You are now subscribed to GoExtra129");
                } else {
                    System.out.println("You are now subscribed to GoExtra149");
                }

            } else if (code == 4) {
                if (choice == 1) {
                    System.out.println("You are now subscribed to UNLI 5G 99");
                } else if (choice == 2) {
                    System.out.println("You are now subscribed to UNLI 5G 149");
                } else {
                    System.out.println("You are now subscribed to UNLI 5G 199");
                }

            } else if (code == 5) {
                if (choice == 1) {
                    System.out.println("You are now subscribed to ALLNET99");
                } else if (choice == 2) {
                    System.out.println("You are now subscribed to ALLNET149");
                } else {
                    System.out.println("You are now subscribed to ALLNET199");
                }
            }

        } else if (action == 2) {
            System.out.println("Transaction Cancelled");

        } else {
            System.out.println("Invalid Choice");
        }

        myScanner.close();
    }
}

