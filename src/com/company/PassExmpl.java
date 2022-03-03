package com.company;

import java.time.LocalDate;

public class PassExmpl {
    public static void main(String[] args) {
        // Classes
        Passport ukPassport = new Passport("1234","UK",LocalDate.of(2025,1,22));

        Passport usPassport = new Passport("12456","USA",LocalDate.of(2027,3,15));

    }
    static class  Passport {
        String number;
        String country;
        LocalDate expiryDate;


        public Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
