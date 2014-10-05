package com.luxoft.training.lab2.payform;

import java.io.IOException;


public class MonthlySalary extends PayForm {
    public double paymentCalc() throws IOException {

        System.out.println("Enter the base salary");
        setBaseSalary(Double.parseDouble(reader.readLine()));

        setPayment(getBaseSalary());

        return getPayment();
    }

    public void paymentInfo() {
        System.out.println("salary: " + getBaseSalary());
        System.out.println("payment: " + getPayment());
        System.out.println();
    }
}
