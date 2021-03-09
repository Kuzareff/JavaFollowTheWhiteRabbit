package com.javacourse.se.lesson31;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFileInputStream {

    public void readFile () {
        FileInputStream fis = null; //Метод чтения из файла
        InputStreamReader isr = null; //Мметод чтения символов из фалй
        int b = 0; //Переменная типа Инт равная 0 для того чтобы считывать строку

        try {
            fis = new FileInputStream("D:/1.txt"); // Чтение из файла заключяется в трай кеч для отсеивания ошибки
            isr = new InputStreamReader(fis, "UTF-8"); //Чение символов в кодировке Юникод
            while ((b = isr.read()) != -1) { //цикл выполнения пока значение не станет -1
                System.out.print((char) b); //но так как b типа инт, нам необходимо привести его к char
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // При любом раскладе программы, мы выполняем закрытие потоков
            try {
                fis.close(); //Закртие потока фис
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close(); //Закрытие потока иср
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
