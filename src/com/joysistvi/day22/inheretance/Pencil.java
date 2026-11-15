package com.joysistvi.day22.inheretance;

public class Pencil extends Pen {
    private String hardness;

    public Pencil(String brand, String color, double weightInGrams, String hardness) {
        super(brand, color, weightInGrams);
        this.hardness = hardness;
    }

    // Getter and Setter for hardness
    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    // Overridden write() method
    @Override
    public void write() {
        System.out.println("Sketching lightly with a pencil.");
    }

    // Overridden toString() using super.toString()
    @Override
    public String toString() {
        return "\nType: Pencil\n" + super.toString() + "\nHardness: " + hardness;
    }
}
