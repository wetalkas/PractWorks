package com.luxoft.training.lab2;

import com.luxoft.training.lab2.employees.Staff;
import com.luxoft.training.lab2.employees.Staff.*;
import com.luxoft.training.lab2.employees.EmployeesInfo;
import com.luxoft.training.utils.Date;
import com.luxoft.training.utils.Utils;

import java.io.IOException;


public class PaymentCalcDemo {

    public static void main(String[] args) throws IOException {
        Staff[] employeesList = new Staff[4];
        employeesList[0] = new Director("James", "Hetfield", new Date(3, 8, 1963));
        employeesList[1] = new Tester("Mark", "Zuckerberg", new Date(14, 5, 1984));
        employeesList[2] = new Manager("Ivan", "Ivanov", new Date(2, 11, 1978));
        employeesList[3] = new Bookkeeper("Dale", "Carnegie", new Date(1, 10, 1955));

        Utils.sort(employeesList);

        Staff.paymentEntry(employeesList);

        EmployeesInfo.printEmployeesInfo(employeesList);
    }
}