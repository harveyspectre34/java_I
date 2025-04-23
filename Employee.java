package xyzsports;


import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private static int empIdCounter = 1000;
    protected int id;
    protected String name, mobileNo, emailId, department, designation;
    protected String dateOfJoining;

    public Employee(String name, String mobileNo, String emailId, String department, String designation, String dateOfJoining) {
        this.id = empIdCounter++;
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name +" mobileno: " +mobileNo+ " emailId: " +emailId+ " department: " +department);
    }
}


class ContractEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(String name, String mobileNo, String emailId, String department, String designation, String dateOfJoining, int hoursWorked, double hourlyRate) {
        super(name, mobileNo, emailId, department, designation, dateOfJoining);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
}
    


