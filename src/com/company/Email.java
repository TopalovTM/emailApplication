package com.company;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCap;
    private int passwordLength;
    private String alternateMail;

    //creating the password length input
    public int getPasswordLength(){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose password length between 8-16 characters");
        this.passwordLength = s.nextInt();
        boolean isMeetingDemands = true;
        while(isMeetingDemands) {
            if (this.passwordLength < 8 || this.passwordLength > 16) {
                System.out.println("Password does not meet requirements (8-16 characters). Try again!");
                this.passwordLength = s.nextInt();
            }
            else{
                isMeetingDemands = false;
            }
        }
        return  this.passwordLength;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Email(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //setting the department and showing it
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //generating random password
        this.passwordLength = getPasswordLength();
        this.password = randomPassword();
        System.out.println("Your password is: " + this.password);
    }

    //Reading the input and department parameters
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner s = new Scanner(System.in);
        int depChoice = s.nextInt();
        if (depChoice == 1){ return "sales";}
        else if (depChoice == 2){return "dev";}
        else if (depChoice == 3){return "acct";}
        else { return "";}
    }

    //Generating a random password with user inputted length
    private String randomPassword(){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXQZ0123456789!@#%$.";
        char[] password = new char[this.passwordLength];
        for (int i = 0; i < this.passwordLength; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
