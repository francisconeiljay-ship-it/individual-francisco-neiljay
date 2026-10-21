package com.joysistvi.day6.conditional;

public class IfElseIfLadder {
    public static void main(String[] args) {

       /* String result;
        int day = 4;

        if (day == 1) {
            result = "Sunday";
        } else if (day == 2){
            result = "Monday";
        } else if (day == 3) {
            result = "Tuesday";
        } else if (day == 4) {
            result = "Wednesday";
        } else if (day == 5) {
            result = "Thursday";
        } else if (day == 6) {
            result = "Friday";
        } else {
            result = "Invalid Day";
        }*/
        
        double grade = 62;
        String result;
        
        if (grade >= 1 && grade <= 70){
            result = "F";
        } else if (grade >= 71 && grade <= 80) {
            result = "C";
        } else if (grade >= 81 && grade <= 90) {
            result = "B";
        } else {
            result = "A";
        }
        //System.out.println("Today is : " + result);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }
}
