package com.javacourse.se.lesson11;

public class OperatorSwitch {

    int value = 2, firstValue = 1, secondValue = 2, thirdValue = 3;

    public void foo () {

        // Оператор множественного выбора.
        // byte, short, int, char, enum, String

        switch (0) {
            case 48:
                System.out.println(48);
                break;
            case 73:
                System.out.println(73);
            case 25:
                System.out.println(25);
            default:
                System.out.println("Not numbers");
        }
    }
}
