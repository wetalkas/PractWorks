package com.luxoft.training.lab2.employees.paymentType;




public class HourlyRate extends PaymentType {

    public HourlyRate(double workingHours, double hourlyRate) {
        setWorkingHours(workingHours);
        setHourlyRate(hourlyRate);
    }

    @Override
    public double paymentCalc() {
        setPayment(getWorkingHours() * getHourlyRate());
        return getPayment();
    }

    @Override
    public void paymentInfo() {
        System.out.println("working hours: " + getWorkingHours());
        System.out.println("hourly rate: " + getHourlyRate());
        System.out.println("payment: " + getPayment());
        System.out.println();
    }

}
