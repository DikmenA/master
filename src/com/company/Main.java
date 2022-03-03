package com.company;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int number = 100;
        double theDouble = 56_788_667_776d;

        String brand = "Amigoscode";
        Date date = new Date();

        String name = new String("Amigoscode");

        System.out.println(name.toUpperCase());

        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());

        int a = 10;
        int b = a;
         a = 100;

        System.out.println("a = " + a + " - b = " + b );


        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        alex.name = "Alexander";
        // mariam.name= "Mariam";  //turning Mariam Mariam !!!

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);

    }
    static class Person{
        String name;

        Person(String name){
            this.name=name;
        }



    }


}


