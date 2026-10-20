package com.joysistvi.day5.operator;

public class Activity3_Francisco {
    public static void main(String[] args) {


        int myAge = 22;
        int validAge = 18;
        boolean hasValidID = true;
        String allowed = myAge >= validAge && hasValidID ? "Yes" : "No";

        System.out.println(" ");
        System.out.println("--- Event Entry Check ---");
        System.out.println( "Allowed to enter the event: " + allowed );


        boolean isWeekend = false;
        boolean isHoliday = false;
        String classSuspended = isWeekend || isHoliday ? "Yes" : "No" ;

        System.out.println(" ");
        System.out.println("--- Class Status Check ---");
        System.out.println("Are there no clasess today? " + classSuspended + "," + " no classes. ");


        int score = 50;
        String passedOrFail = score >= 75 ? "Passed " : "Failed ";

        System.out.println(" ");
        System.out.println("--- Pass or Fail Number Check ---");
        System.out.println("Score: " + score ) ;
        System.out.println("Result: " + passedOrFail);

        int num = 1000;
        int num2 = 500;
        int largerNum = num > num2 ? num : num2;

        System.out.println(" ");
        System.out.println("--- Larger Number Check ---");
        System.out.println("Number 1: " + num + ", Number 2: " + num2);
        System.out.println("The larger number is: " + largerNum);



    }

}
