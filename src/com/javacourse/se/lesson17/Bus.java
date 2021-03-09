package com.javacourse.se.lesson17;

public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "#000001";
    public final int SERIAL_NUMBER_2 = 000000001;

    public void go () {
        System.out.println("Go");
    }

    public String showKm () {
        int km = 56;
        String str = "70km";
        return str;
    }

    public void showKM (double km) {
        double kmM = km / 60;
        System.out.println(kmM);
    }
}
