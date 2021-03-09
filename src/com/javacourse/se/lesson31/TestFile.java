package com.javacourse.se.lesson31;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {

    public void createFile() {
        FileWriter fr = null;
        File file = new File("D:/2.txt"); //Метод создания файлов
        String str = "Это новый файл";
        try {
            fr = new FileWriter(file, true); // При значении true будет добавляться данные , при false также перезаписываться
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
