package com.javacourse.se.lesson9;

public class Operation {
    Integer a = 5, b = 7, c;
    String str1 = "Hot", str2 = "Java", result;

    public void foo () {
        c = a / b;
        // += -+ *+ %=

        //a = a + b; // a += b;
        //a++; // a = a + 1;
        a -= b; // a = a - b;

        result = str1 + str2;

        boolean v = a > b;

        System.out.println(c);
        System.out.println(result);
        System.out.println(a);
        System.out.println(v);
    }
}
