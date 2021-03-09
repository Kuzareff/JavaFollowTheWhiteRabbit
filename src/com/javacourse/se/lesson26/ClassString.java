package com.javacourse.se.lesson26;

public class ClassString {

    public void showString () {
        //        //Статические методы объектов
        String str1 = new String("Hot Java Yes");
        String str2 = "Java";
        String [] strings = str1.split(" ");//Метод принимает разделитель и возвращает строку *
        char [] charArray = str1.toCharArray(); //Метод разбивает строку на символы и записывает все отдельно построчно **

        //Статические методы класса

        //String.valueOf(); - необходимо полное уточнение
        //String.copyValueOf(); * необходимо полное уточнение

        //Примеры вывода
        System.out.println(str1.charAt(0) + " 1"); // Метод charAt() позволяет вызвать символ в строке под его иднексом.
        System.out.println(str1.codePointAt(1) + " 2"); //Данный метод возвращает символ в системе Юникод
        System.out.println(str1.compareTo(str2) + " 3"); //Метод сравнивает лексически строки которые мы передаем
        System.out.println(str1.compareToIgnoreCase(str2) + " 4"); //Метод что и ыше но не учитывает регистр букв.
        System.out.println(str1.concat(str2) + " 5"); //Метод предназначен для сложения строк (Конкатенация) и подобен str1+str2
        System.out.println(str1.equals(str2) + " 6"); //Сравнение содержимого объекта , но возврат булевой true/false
        System.out.println(str1.equalsIgnoreCase(str2) + " 7"); //То же что и выше но без регистра букв.
        System.out.println(str1.hashCode() + " 8"); //Метод возвращает hashCode объекта
        System.out.println(str1.indexOf(65) + " 9"); //Метод проверки символа в строке по Юникоду и возвращает -1 в случае false и 1 если true
        System.out.println(str1.isEmpty() + " 10"); //Метод проверяет строку на наличие символов. Если пустая - true, если нет - false
        System.out.println(str1.length() + " 11");  //Метод проверяет длину строки и возращает число символов

        for (String elemenet : strings) {   //Метод принимает разделитель и возвращает строку *
            System.out.println(elemenet + " 12");   //Метод принимает разделитель и возвращает строку *
        }                                   //Метод принимает разделитель и возвращает строку *

        System.out.println(str1.substring(2,8) + " 13"); //Метод принимает индексы и удаляет все символы строки за пределами

        for (char elemenet : charArray) {        //Метод разбивает строку на символы и записывает все отдельно построчно **
            System.out.println(elemenet + " 14");//Метод разбивает строку на символы и записывает все отдельно построчно **
        }

        System.out.println(str1.toLowerCase() + " 15"); //Метод делающий все буквы в строке в нижний регистр
        System.out.println(str1.toUpperCase() + " 16"); //Метод поднимающий все буквы в верхний регистр
        System.out.println(str1.trim() + " 17"); //Метод обрезает пробелы впереди и вконце строки
    }

}
