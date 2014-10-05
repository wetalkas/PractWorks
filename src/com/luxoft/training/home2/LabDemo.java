package com.luxoft.training.home2;


import com.luxoft.training.utils.Date;

public class LabDemo {

    public static void main(String[] args) {
        Date dateWithoutParameters = new Date();
        Date dateWithParameters = new Date(3, 12, 2013);
        Date dateAnotherDate = new Date(dateWithParameters);
        Date exampleDate = new Date();

        System.out.println("дата без параметров: " + dateWithoutParameters.printDate());
        System.out.println("дата с заданнами параметрами: " + dateWithParameters.printDate());
        System.out.println("дата заданная другой датой: " + dateAnotherDate.printDate());


        exampleDate.setDate(14, 10, 1999);
        System.out.println("установка новой даты: " + exampleDate.printDate());

        dateAnotherDate.incDay(78);
        System.out.println("увеличение даты: " + dateAnotherDate.printDate());

        dateWithoutParameters.decDay(59);
        System.out.println("уменьшение даты: " + dateWithoutParameters.printDate());

        System.out.println("колличество месяцев между датами: " + Date.monthCount(new Date(3, 6, 1934), new Date()));

    }
}
