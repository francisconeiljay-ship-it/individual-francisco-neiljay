package com.joysistvi.day8;

import java.util.Scanner;

public class Activity6_Francisco_part2 {
    private static final int firstTable = 1;
    private static final int lastTable = 10;
    private static final int maxMultiplier = 10;

    public static void main(String[] args) {
        for (int number = firstTable; number <= lastTable; number++) {
            System.out.println("Multiplication Table of " + number);

            for (int multiplier = 1; multiplier <= maxMultiplier; multiplier++) {
                System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            }

            System.out.println();
        }
    }
}
