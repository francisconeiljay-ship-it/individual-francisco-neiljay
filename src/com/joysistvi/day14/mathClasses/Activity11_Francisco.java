package com.joysistvi.day14.mathClasses;

public class Activity11_Francisco {
    public static void main(String[] args) {

        int  a = 65;
        int  b = 85;
        int  c = -20;
        double d = 6.50;
        double e = 36.8;

        int absResult = Math.abs(c);
        System.out.println("Absolute Value: " + absResult);

        int maxResult = Math.max(a , b);
        System.out.println("Maximum Number: " + maxResult);

        int minResult = Math.min(a , b);
        System.out.println("Minimum Number: " + minResult);

        double powResult = Math.pow(a , b);
        System.out.println("Power: " + powResult);

        double sqrtResult = Math.sqrt(a);
        System.out.println("Squareroot: " + sqrtResult);

        long roundResult = Math.round(d);
        System.out.println("Round : " + roundResult);

        double ceilResult = Math.ceil(e);
        System.out.println("Ceil: " + ceilResult);

        double floorResult = Math.floor(e);
        System.out.println("Floor: " + floorResult);

        double randomResult = Math.random();
        System.out.println("Random: " + randomResult);

        double logResult = Math.log(Math.E);
        System.out.println("Logarithmic" + logResult);

        double log10Result = Math.log10(100);
        System.out.println("Logarithmic 10: " + log10Result);

        double expResult = Math.exp(1);
        System.out.println("Exponent: " + expResult);

        double sinResult = Math.sin(Math.toRadians(90));
        System.out.println("Sin: " + sinResult);

        double cosResult = Math.cos(Math.toRadians(0));
        System.out.println("Cosine: " + cosResult);

        double tanResult = Math.tan(Math.toRadians(45));
        System.out.println("Tangent: " + tanResult);

    }
}
