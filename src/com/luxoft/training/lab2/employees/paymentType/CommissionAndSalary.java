package com.luxoft.training.lab2.employees.paymentType;




public class CommissionAndSalary extends PaymentType {

    public CommissionAndSalary(int salesAmount, double commissionValue, double baseSalary) {
        setSalesAmount(salesAmount);
        setCommissionValue(commissionValue);
        setBaseSalary(baseSalary);
    }

    @Override
    public double paymentCalc() {
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
