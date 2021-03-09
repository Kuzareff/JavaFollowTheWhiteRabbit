package com.javacourse.se.lesson5;


import com.javacourse.se.lesson24.Test;
import com.javacourse.se.lesson25.DollySheep;
import com.javacourse.se.lesson26.ClassString;
import com.javacourse.se.lesson27.ClassStringBuilderStringBuffer;
import com.javacourse.se.lesson28.*;
import com.javacourse.se.lesson29.ErrorExample;
import com.javacourse.se.lesson30.PerimeterException;
import com.javacourse.se.lesson30.PerimeterSquare;
import com.javacourse.se.lesson31.TestFile;
import com.javacourse.se.lesson31.TestFileInputStream;
import com.javacourse.se.lesson31.TestFileOutputStream;
import com.javacourse.se.lesson32.Cat;
import com.javacourse.se.lesson32.Serializator;
import com.javacourse.se.lesson34.ClassListAndArrayList;

import javax.imageio.spi.ImageInputStreamSpi;
import java.io.*;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {
//************************************************** lesson 7 ********************************************************
//        Bus skoda = new Bus();
//        Bus ford = new Bus();
//        Bus opel = new Bus();
//
//        skoda.color = "Red";
//        ford.color = "Green";
//        opel.color = "Black";
//
//        skoda.model = "Octavia";
//        ford.model = "Mustang";
//        opel.model = "Vectra";
//
//        skoda.speed = 220;
//        ford.speed = 170;
//        opel.speed = 190;
//
//        skoda.showColor();
//        ford.showColor();
//        opel.showColor();
//
//        skoda.showModel();
//        ford.showModel();
//        opel.showModel();
//
//        skoda.showSpeed();
//        ford.showSpeed();
//        opel.showSpeed();

//************************************************** lesson 9 ********************************************************
//        Operation op = new Operation();
//        op.foo();

//************************************************** lesson 10 *******************************************************
//        ControlOperators co = new ControlOperators();
//        co.foo();

//************************************************** lesson 11 *******************************************************
//        OperatorSwitch op = new OperatorSwitch();
//        op.foo();

//************************************************** lesson 12 *******************************************************
//        LoopControl lc = new LoopControl();
//        lc.foo();

//************************************************** lesson 13 *******************************************************
//        ForLoop fl = new ForLoop();
//        fl.foo();

//************************************************** lesson 14 *******************************************************
//        MyArrays ma = new MyArrays();
//        ma.foo();

//************************************************** lesson 15 *******************************************************
//        Constructor flower = new Constructor();
//        flower.foo();

//************************************************** lesson 16 *******************************************************
//        Modifiers modifiers = new Modifiers();
//        modifiers.foo();
//        String name = modifiers.name;

//************************************************** lesson 17 *******************************************************
//        Bus bus = new Bus();
//        int km = 65;
//        bus.showKM(km);
//        System.out.println(bus.showKm());

//************************************************** lesson 18 *******************************************************
//        StaticVariablesAndMethods s = new StaticVariablesAndMethods();
//        StaticVariablesAndMethods s1 = new StaticVariablesAndMethods();
//        StaticVariablesAndMethods s2 = new StaticVariablesAndMethods();
//
//        StaticVariablesAndMethods.variable = 5;
//
//        s.show();
//        s1.show();
//        s2.show();

//************************************************** lesson 19 *******************************************************
//        Encapsulation encapsulation = new Encapsulation();
//        encapsulation.setA(10);
//        System.out.println(encapsulation.getA());
//************************************************** lesson 20 *******************************************************
//        Music mc = Music.CLASSIC;
//        System.out.println(mc.getI());
//        System.out.println(mc.getName());
//        System.out.println();
//        mc.foo();
//************************************************** lesson 21 *******************************************************
//        Ostrich ostrich = new Ostrich("Gaga","Белые");
//        Crow crow = new Crow("Dora","Крысные");
//************************************************** lesson 22 *******************************************************
//        Birds ostrich2 = new Ostrich();
//        Birds crow = new Crow();
//
//        Test test = new Test();
//        test.foo(crow);
//************************************************** lesson 23 *******************************************************
//        Weapon weapon = new AK47();
//        AK47 ak47 = new AK47();
//************************************************** lesson 24 *******************************************************
//        Mi8 mi8 = new Mi8();
//        Boeing737 boeing737 = new Boeing737();
//
//        Test test = new Test();
//        test.foo(mi8);
//************************************************** lesson 25 *******************************************************
//        DollySheep dollySheep = new DollySheep();
//        DollySheep dollySheep2 = foo(dollySheep);
//
//        dollySheep.setName("Dolly");
//        dollySheep2.setName("Molly");
//
//        System.out.println(dollySheep.getName());
//        System.out.println(dollySheep2.getName());
//    }
//    public static DollySheep foo(DollySheep dollySheep2) {
//        DollySheep sheep = null;
//        try {
//            sheep = (DollySheep) dollySheep2.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return sheep;
//************************************************** lesson 26 *******************************************************
//        ClassString cs = new ClassString();
//        cs.showString();
//************************************************** lesson 27 *******************************************************
//        ClassStringBuilderStringBuffer csbsb = new ClassStringBuilderStringBuffer();
//        csbsb.showSBB();
//************************************************** lesson 28 *******************************************************
//        Body body = new Body();
//
//        SmallHead smallHead = new SmallHead();
//        MediumHead mediumHead = new MediumHead();
//        BigHead bigHead = new BigHead();
//
//        Robot<SmallHead> robot = new Robot<SmallHead>(body, smallHead);
//        Robot<BigHead> robot2 = new Robot<BigHead>(body, bigHead);
//
//        robot.getHead().burn();
//        robot2.getHead().turn();
//************************************************** lesson 29 *******************************************************
//        ErrorExample errorExample = new ErrorExample();
//        try {
//            errorExample.foo();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }   finally {// Позволяет после ошибки всеравно выполнять заданные команды, как правило на закрытие потока и пр.
//        }
//************************************************** lesson 30 *******************************************************
//        PerimeterSquare perimeterSquare = new PerimeterSquare();
//        try {
//            perimeterSquare.getPerimeter("G");
//        } catch (PerimeterException e) {
//            e.printStackTrace();
//        }
//************************************************** lesson 31 *******************************************************
//        TestFileInputStream testFileInputStream = new TestFileInputStream();
//        testFileInputStream.readFile();

//        TestFileOutputStream testFileOutputStream = new TestFileOutputStream();
//        testFileOutputStream.writeFile();

//        TestFile file = new TestFile();
//        file.createFile();
//************************************************** lesson 32 *******************************************************
//        Cat cat = new Cat();
//        cat.setName("Tom");
//
//        Serializator serializator = new Serializator();
//        System.out.println(serializator.serialization(cat));
//
//        Serializator serializator = new Serializator();
//        try {
//            Cat cat = serializator.deserialization();
//            System.out.println(cat.getName());
//        } catch (InvalidObjectException e) {
//            e.printStackTrace();
//        }
//************************************************** lesson 33 *******************************************************
//        Урок был ознакомительный
//************************************************** lesson 34 *******************************************************
//        ClassListAndArrayList classListAndArrayList = new ClassListAndArrayList();
//        classListAndArrayList.getList();
//************************************************** The End *******************************************************
    }
}
