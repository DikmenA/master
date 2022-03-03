package com.company;

import java.util.Arrays;

public class ArraysExpl {
    public static void main(String[] args) {
        //Arrays
        
        int [] numbers = new int [5];
        numbers[0] = 99;
        numbers[1] = 88;
        numbers[2] = 77;
        numbers[3] = 66;
        numbers[4] = 55;

        System.out.println(Arrays.toString(numbers));

        // or you can write without limit

        int [] numbers1 = {2,4,6,8,7,3,1};
        System.out.println(Arrays.toString(numbers1));
        System.out.println(numbers1.length);

        //with String
        String [] names= {"Ali", "Veli"};
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

        //index

        int [] numbers2 = {8,4,5,6,99};
        int index = numbers2[0];
        System.out.println(index);
        int lastOne = numbers2[numbers2.length-1];
        System.out.println(lastOne);





    }


}
