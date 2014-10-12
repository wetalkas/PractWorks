package com.luxoft.training.lab2.employees;

import com.luxoft.training.lab2.employees.paymentType.PaymentType;
import com.luxoft.training.utils.Date;


public class Tester extends Employee {

    public Tester(String firstName, String lastName, Date birthDate, PaymentType paymentType) {
        super(firstName, lastName, birthDate, paymentType);
        setPosition("tester in department IT Department");
        setStrPaymentType("hourly rate");
        getPaymentType().paymentCalc();
    }
}