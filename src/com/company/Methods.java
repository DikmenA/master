package com.company;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        char [] letters = {'A', 'A','B','C','D','D','D' };
        int count = countOccurences(letters,'A');
        System.out.println(count);
     }
    public static int countOccurences(char [] letters, char searchLetter){
        /*System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);*/
        int count = 0;
       for(char letter : letters){
           if(letter == searchLetter){
               count++;
           }
       }
        return count;
    }
}
