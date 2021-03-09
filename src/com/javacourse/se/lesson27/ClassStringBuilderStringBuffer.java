package com.javacourse.se.lesson27;



// ************ StringBuilder и StringBuffer используется при сложении большого колличеста строк **********************


public class ClassStringBuilderStringBuffer {

    public void showSBB () {
        String str = new String();
        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.ensureCapacity(17); //Метод позволяющий зарезервировать конкрентное значение символов в памяти
        System.out.println(stringBuilder.capacity() + " 1"); //Проверяем сколько места в памяти зарезервированно = 16 символов
        System.out.println(stringBuilder.append(" Hot") + " 2"); // Метод прибавляющий к выываемой строке свою строку указываемую в методе.

        stringBuilder.setLength(15); // Метод увеличивающий длинну строки
        System.out.println(stringBuilder.capacity() + " 3");

        stringBuilder.insert(1,"G");   //Метод позволяющий вставлять в указанный индекс указанный символ *
        System.out.println(stringBuilder + " 4");      //Метод позволяющий вставлять в указанный индекс указанный символ *

        stringBuilder.deleteCharAt(1); //Метод удаляет символ из строки под указанным индексом **
        System.out.println(stringBuilder + " 5"); //Метод удаляет символ из строки под указанным индексом **

        //stringBuilder.reverse();
        //System.out.println(stringBuilder);
        //Можно записать и так
        System.out.println(stringBuilder.reverse()); //Метод разварачивающий строку задом на перед  ( можно писать в одну строку.)













    }


}
