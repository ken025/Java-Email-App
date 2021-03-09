package emailapp;

import java.util.Scanner;

public class  Email {
//    properties
    private String firstName;
    private String lastName;
    private String password;
    private String department;
//    private int defaultPasswordLength = 9;
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

        this.password = randomPassword(10);
        System.out.println("Your password is: " + this.password);
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
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKMNOPQRSTUVWXYZ0123456789!*&@";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
//    set the mailbox capacity

//    set the alternate email

//    change password
}