package xyzsports;


class Member {
    private static int memberIdCounter = 2000;
    private int id;
    private String name, mobileNo, emailId, membershipType;
    private double amountPaid;

    public Member(String name, String mobileNo, String emailId, String membershipType, double amountPaid) {
        this.id = memberIdCounter++;
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.membershipType = membershipType;
        this.amountPaid = amountPaid;
    }
    public void displayInfo() {
        System.out.println("Member ID: " + id + ", Name: " + name +" mobileno:" +mobileNo+ " emailId: " +emailId+ " membershipType:" + membershipType+ " amountPaid:"+amountPaid);
    }
}