package com.joysistvi.day24.abstrraction;

public abstract class Pen {
        private String type;
        private String brand;
        private String color;
        private double weightInGrams;

        public Pen(String type, String brand, String color, double weightInGrams) {
            this.type = type;
            this.brand = brand;
            this.color = color;
            this.weightInGrams = weightInGrams;
        }

        public abstract void write();

        public void write(String message) {
            System.out.println("Writing: " + message);
        }

        public void write(String message, int times) {
            for (int i = 0; i < times; i++) {
                System.out.println("Writing: " + message);
            }
        }

        public void store() {
            System.out.println("Storing the pen in the pencil case.");
        }

        public String getType() { return type; }
        public String getBrand() { return brand; }
        public String getColor() { return color; }
        public double getWeightInGrams() { return weightInGrams; }

        @Override
        public String toString() {
            return "Type: " + type + "\n" +
                    "Brand: " + brand + "\n" +
                    "Color: " + color + "\n" +
                    "Weight in Grams: " + weightInGrams;
        }
}
