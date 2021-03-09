package emailapp;

import java.util.Scanner;

public class  Email {
//    properties
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

//    constructor to receive first and last name
    public Email(String firstName, String lastName){
//  'this' refers to the class level variable
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + firstName + " " + lastName );

        this.department = setDept();
        System.out.println("Department: " + this.department);
    }

//    ask for department
    private String setDept(){
        System.out.print("\n1 for Sales\n2 for Developmnet\n3 for Accounting\n0 for none\n Enter the Department Number: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){
            return "Sales";
        } else if (deptChoice == 2){
            return "Dev";
        } else if (deptChoice == 3){
            return "Accounting";
        } else {
            return "";
        }
    }
//    generate random password

//    set the mailbox capacity

//    set the alternate email

//    change password
}