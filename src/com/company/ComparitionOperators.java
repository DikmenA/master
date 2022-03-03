package com.company;

public class ComparitionOperators {

    public static void main(String[] args) {

        int halidAge = 18;
        int mariamAge = 20;

        boolean isBigger = halidAge > mariamAge;
        System.out.println(isBigger);

        System.out.println(halidAge < mariamAge);
        System.out.println(halidAge > mariamAge);
        System.out.println(halidAge == mariamAge);
        System.out.println(halidAge != mariamAge);

        boolean a = false;
        boolean b = true;
        boolean c = true;

        String name = "Mark";

        System.out.println((a || b) && c);
        System.out.println((a || b) && !c);
        System.out.println((10 > 8 || 2 < 2) && c && name.contains("M"));





    }
}
