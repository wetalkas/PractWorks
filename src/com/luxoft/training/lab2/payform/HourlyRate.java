package com.luxoft.training.lab2.payform;

import java.io.IOException;


public class HourlyRate extends PayForm {
    public double paymentCalc() throws IOException {

        System.out.println("Enter the working hours");
        setWorkingHours(Double.parseDouble(reader.readLine()));

        System.out.println("Enter the hourly rate");
        setHourlyRate(Double.parseDouble(reader.readLine()));

        setPayment(getWorkingHours() * getHourlyRate());

        return getPayment();
    }

    public void paymentInfo() {
        System.out.println("working hours: " + getWorkingHours());
        System.out.println("hourly rate: " + getHourlyRate());
        System.out.println("payment: " + getPayment());
        System.out.println();
    }
}
