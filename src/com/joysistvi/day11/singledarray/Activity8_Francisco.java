package com.joysistvi.day11.singledarray;

import java.util.Scanner;
public class Activity8_Francisco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int [5];
        int sum = 0;

        System.out.println("Enter five numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println(" ");
        System.out.println("Number you entered ");

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Index " + i + ": " + numbers[i]);
            sum += numbers [i];
        }

        double average = (double) sum / numbers.length;

        System.out.println(" ");
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();

    }
}
