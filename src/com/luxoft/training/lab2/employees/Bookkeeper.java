package com.luxoft.training.lab2.employees;

import com.luxoft.training.lab2.employees.paymentType.PaymentType;
import com.luxoft.training.utils.Date;


public class Bookkeeper extends Employee {

    public Bookkeeper(String firstName, String lastName, Date birthDate, PaymentType paymentType) {
        super(firstName, lastName, birthDate, paymentType);
        setPosition("bookkeeper in department Finance Department");
        setStrPaymentType("monthly salary");
        getPaymentType().paymentCalc();
    }


}
