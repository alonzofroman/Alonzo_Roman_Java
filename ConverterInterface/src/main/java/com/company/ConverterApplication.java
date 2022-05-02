package com.company;

import com.company.interfaces.Converter;
import com.company.ConverterIf;
import com.company.ConverterSwitch;
import java.util.Scanner;

public class ConverterApplication {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    Converter ifConverter = new ConverterIf();

        System.out.println("Enter a number of a month (1-12). (If case)");
        int monthNumber = Integer.parseInt(scan.nextLine());
        ifConverter.convertMonth(monthNumber);

        System.out.println("Enter a number of a day (1-7) (If case)");
        int dayNumber = Integer.parseInt(scan.nextLine());
        ifConverter.convertDay(dayNumber);
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);

        Converter switchConverter = new ConverterSwitch();

        System.out.println("Enter a number of a month (1-12) (Switch case)");
        int monthNumber = Integer.parseInt(scan.nextLine());
        switchConverter.convertMonth(monthNumber);

        System.out.println("Enter a number of a day (1-7) (Switch case)");
        int dayNumber = Integer.parseInt(scan.nextLine());
        switchConverter.convertDay(dayNumber);

    }
}
