package com.joysistvi.day13.aStringName;

public class Activity10_Francisco {
    public static void main(String[] args) {

        //Contains() Method
        String text = "Neil Jay Pogi";
        boolean result1 = text.contains("Pogi");
        boolean result2 = text.contains("Panget");

        System.out.println("\nContains Method Output");
        System.out.println(result1);
        System.out.println(result2);

        //endsWith() Method
        String filename = "Neil Jay Francisco";
        boolean result3 = filename.endsWith("Francisco");

        System.out.println("\nEnds With Method Output");
        System.out.println(result3);

        //startsWith() Method
        String str = "Neil Jay Francisco";
        boolean result4 = str.startsWith("Neil");

        System.out.println("\nStart With Method Output");
        System.out.println(result4);

        //indexOf() Method
        String name = "Neil Jay Francisco";
        int index = name.indexOf('l');

        System.out.println("\nIndex Of Method Output");
        System.out.println(index);

        //trim() Method
        String names = "     Neil Jay Francisco    ";
        String trimmed = names.trim();

        System.out.println("\nTrim Method Output");
        System.out.println(trimmed);

        //replace() Method
        String remove = "I love you 144";
        String updated = remove.replace("144", "143");

        System.out.println("\nReplace Method Output");
        System.out.println(updated);

        //toCharArray() Method
        String arr = "Neil Jay Francisco";
        char[] chars = arr.toCharArray();

        System.out.println("\nTo Char Array Method Output");
        System.out.println(chars[5]);

        //Stretch Goal
        System.out.println("\n==============================================");
        String country = "Philippines";
        char[] myCountry = country.toCharArray();

        System.out.println("\nStretch Goal Method Output");
        System.out.println("\nThe fist character is " + myCountry[0]);
        System.out.println("The last character is " + myCountry[10]);

        System.out.println();
        int countP = 0;
        int countVowels = 0;

        for (char c : country.toCharArray()) {

            if (c == 'P' || c == 'p') {
                countP++;
            }

            char lowerC = Character.toLowerCase(c);
            if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') {
                countVowels++;
            }
        }

        System.out.println("Count of 'P/p': " + countP);
        System.out.println("Total number of vowels: " + countVowels);
    }
}
