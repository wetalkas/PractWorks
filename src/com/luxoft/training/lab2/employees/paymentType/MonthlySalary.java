package com.luxoft.training.lab2.employees.paymentType;




public class MonthlySalary extends PaymentType {

    public MonthlySalary(double baseSalary) {
        setBaseSalary(baseSalary);
    }

    @Override
    public double paymentCalc() {
        setPayment(getBaseSalary());
        return getPayment();
    }

    @Override
    public void paymentInfo() {
        System.out.println("salary: " + getBaseSalary());
        System.out.println("payment: " + getPayment());
        System.out.println();
    }
}
