package com.luxoft.training.lab2;

import com.luxoft.training.lab2.employees.*;
import com.luxoft.training.lab2.employees.paymentType.*;
import com.luxoft.training.lab2.invoices.Invoice;
import com.luxoft.training.lab2.invoices.Purchase;
import com.luxoft.training.lab2.invoices.Service;
import com.luxoft.training.utils.Date;
import com.luxoft.training.utils.Utils;


public class PaymentCalcDemo {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Employees");
        System.out.println();

        Employee[] employeesList = new Employee[10];
        employeesList[0] = new Director("James", "Hetfield", new Date(3, 8, 1963), new Commission(100000, 12));
        employeesList[1] = new Tester("Mark", "Zuckerberg", new Date(14, 5, 1984), new HourlyRate(20000, 10));
        employeesList[2] = new Tester("Christian", "Bale", new Date(30, 1, 1974), new HourlyRate(200, 10));
        employeesList[3] = new Tester("Jason", "Statham", new Date(26, 7, 1967), new HourlyRate(500, 10));
        employeesList[4] = new Tester("Anthony", "Hopkins", new Date(31, 12, 1937), new HourlyRate(130, 10));
        employeesList[5] = new Manager("Emilia", "Clarke", new Date(1, 5, 1987), new CommissionAndSalary(50000, 5, 3000));
        employeesList[6] = new Manager("Hugh", "Laurie", new Date(11, 6, 1959), new CommissionAndSalary(20000, 5, 3000));
        employeesList[7] = new Bookkeeper("Lena", "Headey", new Date(3, 10, 1973), new MonthlySalary(5000));
        employeesList[8] = new Bookkeeper("Gary", "Oldman", new Date(21, 3, 1958), new MonthlySalary(5000));
        employeesList[9] = new Bookkeeper("Dale", "Carnegie", new Date(1, 10, 1955), new MonthlySalary(5000));

        Utils.sort(employeesList);

        for (Employee employee : employeesList) {
            employee.printEmployeeInfo();
        }



        System.out.println();
        System.out.println("Invoices");
        System.out.println();

        Invoice[] invoicesList = new Invoice[3];
        invoicesList[0] = new Service("Rental", "Mercury", "Luxoft", new Date(5, 10, 2014), 10000);
        invoicesList[1] = new Purchase("Equipment", "Rozetka", "Luxoft", new Date(7, 10, 2014), 150000, new Date(6, 10, 2014), new Date(7, 10, 2014));
        invoicesList[2] = new Service("Internet", "Kyivstar", "Luxoft", new Date(5, 10, 2014), 500);

        for (Invoice invoice : invoicesList) {
            invoice.printInvoiceInfo();
        }

    }
}