package xyzsports;

import java.util.ArrayList;
import java.util.Scanner;

public class Testsports {
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully.");
    }

    public void displayEmployees() {
        for (Employee e : employees) {
            e.displayInfo();
        }
    }

    public void displayMembers() {
        for (Member m : members) {
            m.displayInfo();
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\nXYZ Sports Club Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Add Member");
            System.out.println("3. View Employees");
            System.out.println("4. View Members");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter mobile no:");
                    String mobileNo = scanner.nextLine();
                    System.out.println("Enter email ID:");
                    String emailId = scanner.nextLine();
                    System.out.println("Enter department:");
                    String department = scanner.nextLine();
                    System.out.println("Enter designation:");
                    String designation = scanner.nextLine();
                    System.out.println("Enter date of joining:");
                    String dateOfJoining = scanner.nextLine();
                    System.out.println("Enter salary:");
                    double basicSalary = scanner.nextDouble();
                    addEmployee(new SalariedEmployee(name, mobileNo, emailId, department, designation, dateOfJoining, basicSalary));
                    break;
                case 2:
                    System.out.println("Enter member name:");
                    String memberName = scanner.nextLine();
                    System.out.println("Enter mobile no:");
                    String memberMobile = scanner.nextLine();
                    System.out.println("Enter email ID:");
                    String memberEmail = scanner.nextLine();
                    System.out.println("Enter membership type:");
                    String membershipType = scanner.nextLine();
                    System.out.println("Enter amount paid:");
                    double amountPaid = scanner.nextDouble();
                    addMember(new Member(memberName, memberMobile, memberEmail, membershipType, amountPaid));
                    break;
                case 3:
                    displayEmployees();
                    break;
                case 4:
                    displayMembers();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    public static void main(String[] args) {
        Testsports club = new Testsports();
        club.menu();
    }
}

