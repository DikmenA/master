package com.company;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Lens lensOne = new Lens("sony","85mm",true);

        Lens lensTwo = new Lens("sony","30mm",false);

        Lens lensThree = new Lens("cannon","24-70mm",true);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println("lensOne.isPrime = " + lensOne.isPrime);
        System.out.println("******");
        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println("lensTwo.isPrime = " + lensTwo.isPrime);
        System.out.println("******");
        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println("lensThree.isPrime = " + lensThree.isPrime);

    }
    static  class  Lens{
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime){
            this.brand=brand;
            this.focalLength= focalLength;
            this.isPrime=isPrime;
        }
    }
}
