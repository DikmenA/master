package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


public class DateDifferent {

    public static void main(String[] args) {

        String s = new String();

        Date date = new Date();
        java.sql.Date dateSql = new java.sql.Date(1);
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(dateSql);
        System.out.println(localDate);
        System.out.println(localDateTime);

    }
}
