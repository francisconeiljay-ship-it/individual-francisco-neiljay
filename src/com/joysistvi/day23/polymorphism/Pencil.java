package com.joysistvi.day23.polymorphism;

public class Pencil extends Pen {
    private String hardness;

    public Pencil(String brand, String color, double weightInGrams, String hardness) {
        super(brand, color, weightInGrams);
        this.hardness = hardness;
    }

    public String getHardness() { return hardness; }
    public void setHardness(String hardness) { this.hardness = hardness; }

    @Override
    public void write() {
        System.out.println("Sketching lightly with a pencil.");
    }

    @Override
    public void refill() {
        System.out.println("Replacing the pencil lead.");
    }

    @Override
    public String toString() {
        return "=== Pencil ===\nType: Pencil\n" + super.toString() + "\nHardness: " + hardness;
    }
}
