package com.joysistvi.day12.multiArray;

import java.util.Scanner;
public class Activity9_Francisco {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("====================================");
        System.out.println("       Average Calculator           ");
        System.out.println("====================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number of Students: ");
        int numStudent = scanner.nextInt();

        System.out.print("Enter number of Subjects: ");
        int numSubject = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" ");
        String [] subjects = new String[numSubject];
        System.out.println("----------Subject Details----------");
        System.out.println("Enter the Subject:");

        for (int s = 0; s < numSubject; s++) {
            System.out.print("Subject " + (s + 1) + ": ");
            subjects [s] = scanner.nextLine();
        }

        System.out.println(" ");

        String[] name = new String[numStudent];
        double[][] grades = new double[numStudent][numSubject];
        double[] average = new double[numStudent];


        for (int s = 0; s < numStudent; s++) {
            System.out.println("----------Students Details----------");
            System.out.print("Name of Student " + (s + 1) + ": ");
            name[s] = scanner.nextLine();

            System.out.println("Enter grades for each subject:");
            double sum = 0;
            for (int b = 0; b < numSubject; b++) {
                System.out.print(subjects[b] + ": ");
                grades[s][b] = scanner.nextDouble();
                sum += grades[s][b];
            }

            scanner.nextLine();
            average [s] = sum / numSubject;
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("=====================================================================");
        System.out.println("                         Grade Report                                ");
        System.out.println("=====================================================================");

        System.out.printf("%-18s", "Student");
        for (String subject : subjects) {
            System.out.printf("%-10s", subject);
        }
        System.out.printf("%-10s%n", "Average");

        for (int s = 0; s < numStudent; s++) {
            System.out.printf("%-18s", name[s]);
            for (int b = 0; b < numSubject; b++) {
                System.out.printf("%-10.0f", grades[s][b]);
            }
            System.out.printf("%-10.2f%n", average[s]);
        }

        scanner.close();

    }
}
