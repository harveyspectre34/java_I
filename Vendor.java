package xyzsports;


class Vendor extends Employee {
    private int numEmployees;
    private double amount;

    public Vendor(String name, String mobileNo, String emailId, String department, String designation, String dateOfJoining, int numEmployees, double amount) {
        super(name, mobileNo, emailId, department, designation, dateOfJoining);
        this.numEmployees = numEmployees;
        this.amount = amount;
    }
}