package com.joysistvi.day23.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Part 3.5: Create objects using a Pen reference (Runtime Polymorphism)
        Pen p1 = new Pen("Generic", "Blue", 10.0);
        Pen p2 = new Ballpen("Panda", "Green", 20.0, 1.0);
        Pen p3 = new Pencil("Mongol", "Yellow", 8.5, "2B");

        testPen(p1);
        System.out.println();

        testPen(p2);
        System.out.println();

        testPen(p3);
        System.out.println();

        System.out.println("=== Testing Overloading ===");
        p2.write("Hello");
        p2.write("Hello", 3);
    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.refill();
    }
}

/*
 Difference between Overloading and Overriding

 Method overloading nangyayari during compile-time kapag multiple methods share the same name pero magkaiba yung parameter sa loob ng class.
 Method overriding nangyayari during runtime kapag merong specific implementation ng method na defined na on its parent class.

 */
