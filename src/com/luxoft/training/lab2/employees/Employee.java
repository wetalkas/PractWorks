package com.luxoft.training.lab2.employees;

import com.luxoft.training.lab2.employees.paymentType.PaymentType;
import com.luxoft.training.utils.Date;


public abstract class Employee implements Comparable {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String position;
    private String strPaymentType;
    private PaymentType paymentType;

    public Employee(String firstName, String lastName, Date birthDate, PaymentType paymentType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.paymentType = paymentType;
    }

    public void printEmployeeInfo() {
        System.out.println("first name: " + getFirstName());
        System.out.println("last name: " + getLastName());
        System.out.println("position: " + getPosition());
        System.out.println("date of birth: " + getBirthDate().printDate());
        System.out.println("payment type: " + getStrPaymentType());
        getPaymentType().paymentInfo();
    }

    @Override
    public int compareTo(Object obj) {
        Employee entry = (Employee) obj;

        int result = lastName.compareTo(entry.lastName);
        if (result != 0) {
            return result;
        }

        return 0;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStrPaymentType() {
        return strPaymentType;
    }

    public void setStrPaymentType(String strPaymentType) {
        this.strPaymentType = strPaymentType;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}