package com.javacourse.se.lesson20;

public enum Music {
    CLASSIC(5, "classic"),ROCK(8, "rock"),POP(12, "pop");

    private int i;
    private String name;

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    Music(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public void foo () {
        System.out.println("It's true");
        System.out.println();
        System.out.println(Music.CLASSIC.getI());
        System.out.println();
        System.out.println(Music.CLASSIC.getName());
    }
}
