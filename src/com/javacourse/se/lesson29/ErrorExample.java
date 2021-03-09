package com.javacourse.se.lesson29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorExample {

    public ABC abc  = new ABC(); // abc присваивается значение null так как в методе ничего нет

    public void foo () throws FileNotFoundException {
        //System.out.println(1 / 0); - ошибка ArithmeticException нельзя делить на 0
        //int [] array = {1,2,3}; - error ArrayIndexOutOfBoundsException - ошибка так как в массиве 3 значения
        //array[5] = 3; - error ArrayIndexOutOfBoundsException, а пытаемся добавить в массив значение 3 под индексом 5
        //        try {
        //            abc.show();//NullPointerException - error пустого метода, так как abc
        //            System.out.println(1 / 0);
        //        } catch (NullPointerException | ArithmeticException e) {
        //            e.printStackTrace();
        //        }
        FileInputStream fileInputStream = new FileInputStream("");

    }
}
