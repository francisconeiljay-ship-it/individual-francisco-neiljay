package com.joysistvi.day16.methodSample;

import java.util.Scanner;

public class loadRegistration {

    private static double loadBalance = 100.0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println ("\n================Simple load Registration=============");

        while (true) {

            System.out.println("\nWelcome, please dial *143# to access Globe Services.");
            System.out.print("Enter USSD Code: ");
            String ussd = scanner.nextLine().trim();

            if (ussd.equals("*143#")) {
                showMainMenu();
                break;
            } else {
                System.out.println("Invalid USSD Code. Please try again.\n");
            }
        }
        scanner.close();
    }

    private static void showMainMenu() {
        while (true) {
            System.out.println("\n====== Please select your Promo ======");
            System.out.println("[1] GO ");
            System.out.println("[2] GO + ");
            System.out.println("[3] GO Extra ");
            System.out.println("[4] Check Balance");
            System.out.println("[5] Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    handlePromoCategory("GO ", 10, 30, 50);
                    break;
                case "2":
                    handlePromoCategory("GO + ", 15, 40, 70);
                    break;
                case "3":
                    handlePromoCategory("GO Extra ", 20, 50, 90);
                    break;
                case "4":
                    System.out.println("\nYour current load balance is: " + loadBalance);
                    pressEnterToContinue();
                    break;
                case "5":
                    System.out.println("Thank you for using our service!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handlePromoCategory(String promoName, int price1Day, int price3Days, int price5Days) {
        while (true) {
            System.out.println("\n====== Enjoy " + promoName + "services and select duration of your promo ======");
            System.out.println("[1] 1 Day for " + price1Day);
            System.out.println("[2] 3 Days for " + price3Days);
            System.out.println("[3] 5 Days for " + price5Days);
            System.out.println("[4] Back");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    confirmSubscription(promoName, 1, price1Day);
                    return;
                case "2":
                    confirmSubscription(promoName, 3, price3Days);
                    return;
                case "3":
                    confirmSubscription(promoName, 5, price5Days);
                    return;
                case "4":
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void confirmSubscription(String promoName, int days, int price) {
        while (true) {
            System.out.println("\nGet " + promoName + "good for " + days + "Day/s for only " + price);
            System.out.println("[1] Subscribe");
            System.out.println("[2] Back");
            System.out.println("[3] Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    if (loadBalance >= price) {
                        loadBalance -= price;
                        System.out.println("\nYou have successfully registered to " + promoName + ".");
                        System.out.println("Promo duration: " + days + " day/s.");
                        System.out.println("Remaining load balance: " + loadBalance);
                        System.out.println("Thank you for using our service!");
                    } else {
                        System.out.println("\nInsufficient load balance. Your current balance is " + loadBalance);
                    }
                    pressEnterToContinue();
                    return;
                case "2":
                    return;
                case "3":
                    System.out.println("Thank you for using our service!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void pressEnterToContinue() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }
}

