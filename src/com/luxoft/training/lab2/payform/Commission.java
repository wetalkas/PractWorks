package com.luxoft.training.lab2.payform;

import java.io.IOException;


public class Commission extends PayForm {
    public double paymentCalc() throws IOException {

        System.out.println("Enter the sales amount");
        setSalesAmount(Integer.parseInt(reader.readLine()));

        System.out.println("Enter the commission");
        setCommissionValue(Double.parseDouble(reader.readLine()));

        setPayment((getCommissionValue()*getSalesAmount())/100);

        return getPayment();
    }

    public void paymentInfo() {
        System.out.println("sales amount: " + getSalesAmount());
        System.out.println("commission: " + getCommissionValue());
        System.out.println("payment: " + getPayment());
        System.out.println();
    }

}
