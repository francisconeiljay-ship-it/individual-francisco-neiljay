package com.joysistvi.day22.inheretance;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----------- My Pen's in School  ---------------- ");

        Ballpen myBallpen = new Ballpen("Panda", "Green", 20.0, 2.0);

        Pencil lapis = new Pencil ("Mongol", "Yellow", 35.0, "2B");

        System.out.println(myBallpen);
        myBallpen.write();

        System.out.println();

        System.out.println(lapis);
        lapis.write();

        GelPen gelPen = new GelPen ("Panda", "Black", 18.5, 0.5, true);

        System.out.println("\n----------- GelPen (Stretch Goal) --------------");
        System.out.println(gelPen);
        gelPen.write();

        System.out.println("Point Size from Ballpen: " + gelPen.getPointSize());
        System.out.println("Brand from Pen: " + gelPen.getBrand());

    }
}
