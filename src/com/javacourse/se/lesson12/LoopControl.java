package com.javacourse.se.lesson12;

public class LoopControl {

    boolean value = true;
    int a = 0, b = 7;


    public void foo () {

       while (b < 100) {
           System.out.println("Число b = " + b);
           b++;
       }

        System.out.println();

        do {
            a++;
            System.out.println("Число a = " + a);
        }
        while  (a < 100);
    }
}

