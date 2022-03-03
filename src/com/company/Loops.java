package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        //Loops
        int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("-------------");
        //Reverse order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println("Enhanced for loop");

        for (int number : numbers) {
            System.out.println(number);

            System.out.println("---------------------");

            String[] names = {"Anna", "Ali"};
            for (String n : names) {
                System.out.println(n);

                System.out.println("-----------------");

                Arrays.stream(numbers).forEach(System.out::println);
                Arrays.stream(names).forEach(System.out::println);

                System.out.println("------------------");

                // Break and Continue

                String[] names1 = {"Anna", "Ali", "Bob", "Mike"};
                for (String name1 : names1) {
                    System.out.println(name1);
                    break; // just Anna written, loop break

                }
                System.out.println("-----------");
                for (String s : names1) {
                    if (s.equals("Bob")) {
                        break;
                    }
                    System.out.println(s);

                }
                System.out.println("-------------------------");

                for (String s : names1) {
                    if (s.startsWith("A")) {
                        continue;
                    }
                    System.out.println(s);


                }
                System.out.println("--------------");
                //While loop
                int count = 0;

                while (count <= 20) {
                    System.out.println("count = " + count);
                    count++;
                }
                System.out.println("---------------");
                // Do While loop---execute at least one even if the condition is false
                int count1 = 21;
                do {
                    System.out.println(count1);
                    count1++;
                }while (count <= 20);
            }


        }


    }
}
