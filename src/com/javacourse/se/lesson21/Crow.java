package com.javacourse.se.lesson21;

public class Crow extends Birds {

    public void fly () {
        System.out.println("I Crow and i can fly");
    }

    @Override
    public void walk() {
        System.out.println("Crow");
    }
}
