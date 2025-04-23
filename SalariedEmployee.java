package xyzsports;


class SalariedEmployee extends Employee {
    private double basicSalary;

    public SalariedEmployee(String name, String mobileNo, String emailId, String department, String designation, String dateOfJoining, double basicSalary) {
        super(name, mobileNo, emailId, department, designation, dateOfJoining);
        this.basicSalary = basicSalary;
    }
}
