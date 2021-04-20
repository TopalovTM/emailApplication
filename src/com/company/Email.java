package com.company;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCap;
    private String alternateMail;

    public Email(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //setting the department and showing it
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner s = new Scanner(System.in);
        int depChoice = s.nextInt();
        if (depChoice == 1){ return "sales";}
        else if (depChoice == 2){return "dev";}
        else if (depChoice == 3){return "acct";}
        else { return "";}
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
