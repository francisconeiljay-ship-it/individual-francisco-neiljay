package com.joysistvi.day4.operator;

public class Activty2_Francisco {
    public static void main(String[] args) {

      double income = 50000;
      double foodAllowance = 15000;
      double transportation = 2500;
      double rents = 4500;
      double utilityBills = 3500;

      double percentFoodAllowance = (foodAllowance / income) * 100;
      double percentTransportation = (transportation / income) * 100;
      double percentRent = (rents / income) * 100;
      double percentUtilityBills = (utilityBills / income) * 100;

      int myIncome = (int) income;
      int totalExpenses = (int) (foodAllowance + transportation + rents + utilityBills);
      int remainingBalance = (int) income - totalExpenses;

      System.out.println("---------- Expense Tracker ----------");
      System.out.println("Income: " + myIncome);
      System.out.printf("Food Allowance: %.1f%% %n" , percentFoodAllowance);
      System.out.printf("Transportation: %.1f%% %n" , percentTransportation);
      System.out.printf("Rent: %.1f%% %n" , percentRent);
      System.out.printf("Utility Bills: %.1f%% %n" , percentUtilityBills);
      System.out.printf("Remaining Balance: %d %n" , remainingBalance);
    }
}







