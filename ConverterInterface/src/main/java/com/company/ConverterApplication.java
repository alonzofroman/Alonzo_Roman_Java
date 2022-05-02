package com.company;

import com.company.interfaces.Converter;
import com.company.ConverterIf;
import com.company.ConverterSwitch;
import java.util.Scanner;

public class ConverterApplication {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    Converter ifConverter = new ConverterIf();

        System.out.println("Enter a number of a month (1-12).");
        int monthNumber = Integer.parseInt(scan.nextLine());
        ifConverter.convertMonth(monthNumber);

        System.out.println("Enter a number of a day (1-7)");
        int dayNumber = Integer.parseInt(scan.nextLine());
        ifConverter.convertDay(dayNumber);




    Converter switchConverter = new ConverterSwitch();

        
    }
}
