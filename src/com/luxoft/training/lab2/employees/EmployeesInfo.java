package com.luxoft.training.lab2.employees;



public class EmployeesInfo extends Staff {
    public static void printEmployeesInfo(Staff[] employeesList) {
        for (int i = 0; i < employeesList.length; i++) {
            System.out.println("first name: " + employeesList[i].firstName);
            System.out.println("last name: " + employeesList[i].lastName);
            System.out.println("position: " + employeesList[i].position);
            System.out.println("date of birth: " + employeesList[i].birthDate.printDate());
            System.out.println("payment type: " + employeesList[i].paymentType);
            employeesList[i].payForm.paymentInfo();
        }
    }
}
