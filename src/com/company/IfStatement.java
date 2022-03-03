package com.company;

import java.util.Locale;

public class IfStatement {
    public static void main(String[] args) {

        //If Statements

        int age = 17;
        if(age >= 18){
            System.out.println("Hooray.... I am an adult");
        }else if  ( age >= 16 && age < 18){
            System.out.println("I am almost an adult");
        } else{
            System.out.println("I am not an adult");
        }

        // Ternary operator
        int age1 = 15;
        String message = age >= 18 ?
                "Hooray ... I am an adult" :
                "I an not  an adult";
        System.out.println(message);



        // Switch Statement
        String  gender = "FEMALE";

        if (gender.equals("FEMALE")) {
            System.out.println("She is a Female");

        }else if (gender.equals("MALE")){
            System.out.println("He is a Male");

        }else {
            System.out.println("There are no Female or Male");
        }

            /* or with switch case */

            String gender1= "UNKNOWN";
            switch (gender1.toUpperCase()){
                case "FEMALE":
                    System.out.println("She is a Female");
                    break;
                case "Male":
                    System.out.println("He is a Male");
                    break;

            }
            System.out.println("There are no Female or Male");

        }








}

