package com.javacourse.se.lesson31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileOutputStream {

    public void writeFile () {
        FileWriter fr = null;
        //FileOutputStream fileOutputStream = null; // Метод который перезаписывает данные в файл и полностью удаляет старые данные *
        String str = " Java";


        try {
           fr = new FileWriter("D:/1.txt", true); // При значении true будет добавляться данные , при false также перезаписываться
           fr.write(str);
            //fileOutputStream = new FileOutputStream("D:/1.txt");// Метод который перезаписывает данные в файл и полностью удаляет старые данные *
            //fileOutputStream.write(str.getBytes());// Метод который перезаписывает данные в файл и полностью удаляет старые данные *
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
