package com.company;

import com.company.interfaces.Converter;

public class ConverterIf implements Converter {

    public String convertMonth(int monthNumber) {
        String month = null;
        if (monthNumber == 1) {
            month = "January";
            return month;
        }
        else if (monthNumber == 2) {
            month = "February";
            return month;
        }
        else if (monthNumber == 3) {
            month = "March";
            return month;
        }
        else if (monthNumber == 4) {
            month = "April";
            return month;
        }
        else if (monthNumber == 5) {
            month = "May";
            return month;
        }
        else if (monthNumber == 6) {
            month = "June";
            return month;
        }
        else if (monthNumber == 7) {
            month = "July";
            return month;
        }
        else if (monthNumber == 8) {
            month = "August";
            return month;
        }
        else if (monthNumber == 9) {
            month = "September";
            return month;
        }
        else if (monthNumber == 10) {
            month = "October";
            return month;
        }
        else if (monthNumber == 11) {
            month = "November";
            return month;
        }
        else if (monthNumber == 12) {
            month = "December";
            return month;
        }
        else {
            return "No month found";
        }
    }

    public String convertDay(int dayNumber) {
        String day = null;
        if (dayNumber == 1) {
            day = "Sunday";
            return day;
        }
        else if (dayNumber == 2) {
            day = "Monday";
            return day;
        }
        else if (dayNumber == 3) {
            day = "Tuesday";
            return day;
        }
        else if (dayNumber == 4) {
            day = "Wednesday";
            return day;
        }
        else if (dayNumber == 5) {
            day = "Thursday";
            return day;
        }
        else if (dayNumber == 6) {
            day = "Friday";
            return day;
        }
        else if (dayNumber == 7) {
            day = "Friday";
            return day;
        }
        else {
            return "No day found.";
        }
    }

}
