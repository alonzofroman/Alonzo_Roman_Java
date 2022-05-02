package com.company;

import com.company.interfaces.Converter;

public class ConverterIf implements Converter {

    public String convertMonth(int monthNumber) {
        String month = null;
        if (monthNumber == 1) {
            month = "January";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 2) {
            month = "February";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 3) {
            month = "March";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 4) {
            month = "April";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 5) {
            month = "May";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 6) {
            month = "June";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 7) {
            month = "July";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 8) {
            month = "August";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 9) {
            month = "September";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 10) {
            month = "October";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 11) {
            month = "November";
            System.out.println(month);
            return month;
        }
        else if (monthNumber == 12) {
            month = "December";
            System.out.println(month);
            return month;
        }
        else {
            month = "No month found";
            System.out.println(month);
            return month;
        }
    }

    public String convertDay(int dayNumber) {
        String day = null;
        if (dayNumber == 1) {
            day = "Sunday";
            System.out.println(day);
            return day;
        }
        else if (dayNumber == 2) {
            day = "Monday";
            System.out.println(day);
            return day;
        }
        else if (dayNumber == 3) {
            day = "Tuesday";
            System.out.println(day);
            return day;
        }
        else if (dayNumber == 4) {
            day = "Wednesday";
            System.out.println(day);
            return day;
        }
        else if (dayNumber == 5) {
            day = "Thursday";
            System.out.println(day);
            return day;
        }
        else if (dayNumber == 6) {
            day = "Friday";
            System.out.println(day);
            return day;
        }
        else if (dayNumber == 7) {
            day = "Friday";
            System.out.println(day);
            return day;
        }
        else {
            day = "No day found.";
            System.out.println(day);
            return day;
        }
    }

}
