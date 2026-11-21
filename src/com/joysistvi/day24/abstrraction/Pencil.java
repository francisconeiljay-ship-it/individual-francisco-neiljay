package com.joysistvi.day24.abstrraction;

public class Pencil extends Pen implements Refillable {
    private boolean isPermanent;

    public Pencil(String brand, String color, double weightInGrams, boolean isPermanent) {
        super("Marker", brand, color, weightInGrams);
        this.isPermanent = isPermanent;
    }

    @Override
    public void write() {
        System.out.println("Writing boldly with a marker.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the marker ink.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nPermanent: " + (isPermanent ? "Yes" : "No");
    }
}
