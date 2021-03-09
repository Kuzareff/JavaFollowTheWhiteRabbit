package com.javacourse.se.lesson13;

public class ForLoop {

    int [] array = {1,3,4,5,7,8,9,10};

    int a = 1;

    public void foo () {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello - " + a);
            a++;
        }
        System.out.println();

        //Если мы говорим про массивы, то можно записать оператор for разными типами.
        //1 вариант for each
        for (int element: array) {
            System.out.println(element);
        }
        System.out.println("Разделение вариантов");

        //Идентичен написанию класического for
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
