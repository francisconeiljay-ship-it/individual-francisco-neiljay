package com.joysistvi.day24.abstrraction;

public class Ballpen extends Pen implements Refillable, Clickable {
    private double pointSize;

    public Ballpen(String brand, String color, double weightInGrams, double pointSize) {
        super("Ballpen", brand, color, weightInGrams);
        this.pointSize = pointSize;
    }

    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    @Override
    public void refill() {
        System.out.println("Replacing the ballpen ink refill.");
    }

    @Override
    public void click() {
        System.out.println(CLICK_SOUND + " The ballpen tip comes out.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nPoint Size: " + pointSize;
    }
}
