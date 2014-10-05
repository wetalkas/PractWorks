package com.luxoft.training.lab2.payform;

import java.io.IOException;


public class CommissionAndSalary extends PayForm {
    public double paymentCalc() throws IOException {

        System.out.println("Enter the sales amount");
        setSalesAmount(Integer.parseInt(reader.readLine()));

        System.out.println("Enter the commission");
        setCommissionValue(Double.parseDouble(reader.readLine()));

        System.out.println("Enter the base salary");
        setBaseSalary(Double.parseDouble(reader.readLine()));

        setPayment((getCommissionValue() * getSalesAmount()) / 100 + getBaseSalary());

        return getPayment();
    }

    public void paymentInfo() {
        System.out.println("sales amount: " + getSalesAmount());
        System.out.println("commission: " + getCommissionValue());
        System.out.println("base salary: " + getBaseSalary());
        System.out.println("payment: " + getPayment());
        System.out.println();
    }
}
