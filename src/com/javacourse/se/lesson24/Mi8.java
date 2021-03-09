package com.javacourse.se.lesson24;

public class Mi8 extends Helicopter implements VertikalTakeoff{
    @Override
    public void fly() {
        System.out.println("Helicopter Mi8");
    }

    @Override
    public void vertikalTakeoff() {
        System.out.println("Helicopter Mi8 implements");
    }
}
