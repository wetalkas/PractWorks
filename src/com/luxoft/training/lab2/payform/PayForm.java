package com.luxoft.training.lab2.payform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PayForm {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private double commissionValue;
    private int salesAmount;
    private double workingHours;
    private double hourlyRate;
    private double baseSalary;

    private double payment;

    public double paymentCalc() throws IOException {
        return 0;
    }

    public void paymentInfo() {
    }


    public double getCommissionValue() {
        return commissionValue;
    }
    public int getSalesAmount() {
        return salesAmount;
    }
    public double getWorkingHours() {
        return workingHours;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double getPayment() {
        return payment;
    }



    public void setCommissionValue(double commissionValue) {
        this.commissionValue = commissionValue;
    }
    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }
    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void setPayment(double payment) {
        this.payment = payment;
    }
}