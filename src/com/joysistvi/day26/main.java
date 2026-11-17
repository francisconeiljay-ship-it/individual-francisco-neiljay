package com.joysistvi.day26;

public class main {
    public static void testAccount(Account account) {
        account.displayAccountInfo();
        System.out.println();
    }

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount(
                        "143143",
                        "Neil Jay Pogi",
                        20000.0);

        CheckingAccount checking =
                new CheckingAccount(
                        "444444",
                        "Jay Neil Gwapo",
                        10000.0);

        testAccount(savings);
        testAccount(checking);

        System.out.println("=== Savings Transactions ===");

        savings.deposit(1000);

        savings.withdraw(5800);

        savings.deposit(500, "Gift");

        savings.withdraw(1500, "Rent");

        System.out.println();

        System.out.println("======== Checking Transactions ========");

        checking.withdraw(2500);

        checking.withdraw(1000);

        System.out.println();

        System.out.println("======== Transfer (Savings to Checking) ========");

        savings.transfer(checking, 1000);

        System.out.println();

        System.out.println("======== Interest ========");

        savings.addInterest();
    }
}

/*
Encapsulation:
Account class uses private fields accountNumber, accountHolder, and balance with getters/setters.

Inheritance:
SavingsAccount extends Account and CheckingAccount extends Account.

Polymorphism (Overriding):
displayAccountInfo() overridden in SavingsAccount and CheckingAccount.

Polymorphism (Overloading):
deposit(double, String) and withdraw(double, String) in SavingsAccount and CheckingAccount.

Abstraction (Abstract Class):
Account is an abstract class and contains the abstract method displayAccountInfo().

Abstraction (Interfaces):
Transaction, Transferable, InterestBearing, and Overdraftable.

Constants:
MIN_BALANCE in SavingsAccount, INTEREST_RATE in InterestBearing, OVERDRAFT_LIMIT in Overdraftable.
*/

