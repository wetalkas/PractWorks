package com.luxoft.training.lab2.employees;

import com.luxoft.training.lab2.employees.paymentType.PaymentType;
import com.luxoft.training.utils.Date;


public class Director extends Employee {

    public Director(String firstName, String lastName, Date birthDate, PaymentType paymentType) {
        super(firstName, lastName, birthDate, paymentType);
        setPosition("director in department IT Department");
        setStrPaymentType("commission");
        getPaymentType().paymentCalc();
    }
}