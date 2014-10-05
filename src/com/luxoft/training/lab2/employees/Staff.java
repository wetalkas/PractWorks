package com.luxoft.training.lab2.employees;

import com.luxoft.training.lab2.payform.*;
import com.luxoft.training.utils.Date;


import java.io.IOException;


public class Staff implements Comparable {
    String firstName;
    String lastName;
    Date birthDate;
    String position;
    String paymentType;
    PayForm payForm;


    public static class Director extends Staff {
        public Director(String firstName, String lastName, Date birthDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.position = "director in department IT Department";
            this.paymentType = "commission";
            this.payForm = new Commission();
        }
    }

    public static class Tester extends Staff {
        public Tester(String firstName, String lastName, Date birthDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.position = "tester in department IT Department";
            this.paymentType = "hourly rate";
            this.payForm = new HourlyRate();
        }
    }

    public static class Manager extends Staff {
        public Manager(String firstName, String lastName, Date birthDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.position = "manager in department Finance Department";
            this.paymentType = "commission and base salary";
            this.payForm = new CommissionAndSalary();
        }
    }


    public static class Bookkeeper extends Staff {
        public Bookkeeper(String firstName, String lastName, Date birthDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.position = "bookkeeper in department Finance Department";
            this.paymentType = "monthly salary";
            this.payForm = new MonthlySalary();
        }
    }


    public static void paymentEntry (Staff[] employeesList) throws IOException {
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i] instanceof Director) {
                System.out.println("Payment of director " + employeesList[i].firstName + " " + employeesList[i].lastName);
                employeesList[i].payForm.paymentCalc();
                System.out.println();
            } else if (employeesList[i] instanceof Tester) {
                System.out.println("Payment of tester " + employeesList[i].firstName + " " + employeesList[i].lastName);
                employeesList[i].payForm.paymentCalc();
                System.out.println();
            } else if (employeesList[i] instanceof Manager) {
                System.out.println("Payment of manager " + employeesList[i].firstName + " " + employeesList[i].lastName);
                employeesList[i].payForm.paymentCalc();
                System.out.println();
            } else if (employeesList[i] instanceof Bookkeeper) {
                System.out.println("Payment of bookkeeper " + employeesList[i].firstName + " " + employeesList[i].lastName);
                employeesList[i].payForm.paymentCalc();
                System.out.println();
            }
        }
    }


    public int compareTo(Object obj) {
        Staff entry = (Staff) obj;

        int result = lastName.compareTo(entry.lastName);
        if (result != 0) {
            return result;
        }

        return 0;
    }
}