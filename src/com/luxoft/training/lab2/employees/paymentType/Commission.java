package com.luxoft.training.lab2.employees.paymentType;




public class Commission extends PaymentType {

    public Commission(int salesAmount, double commissionValue) {
        setSalesAmount(salesAmount);
        setCommissionValue(commissionValue);
    }

    @Override
    public double paymentCalc() {
        setPayment((getCommissionValue()*getSalesAmount())/100);
        return getPayment();
    }

    @Override
    public void paymentInfo() {
        System.out.println("sales amount: " + getSalesAmount());
        System.out.println("commission: " + getCommissionValue());
        System.out.println("payment: " + getPayment());
        System.out.println();
    }

}
