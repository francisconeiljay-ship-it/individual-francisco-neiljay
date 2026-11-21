package com.joysistvi.day24.abstrraction;

public class Main {
    public static void main(String[] args) {

        Ballpen ballpen = new Ballpen("Pilot", "Black", 20.0, 1.0);
        Pencil pencil = new Pencil("Pentel", "Red", 35.0, true);

        System.out.println("=== testPen() ===");
        testPen(ballpen);
        System.out.println();
        testPen(pencil);

        System.out.println("\n=== testRefillable() ===");
        testRefillable(ballpen);
        System.out.println();
        testRefillable(pencil);

        System.out.println("\n=== testClickable() ===");
        testClickable(ballpen);
    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();
    }

    public static void testRefillable(Refillable refillable) {
        refillable.refill();
        System.out.println("Maximum refills: " + Refillable.MAX_REFILLS);
    }

    public static void testClickable(Clickable clickable) {
        clickable.click();
    }
}