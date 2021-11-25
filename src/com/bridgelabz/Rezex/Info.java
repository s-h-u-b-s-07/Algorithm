package com.bridgelabz.Rezex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Info {
    public static Info instance;

    private Info(){

    }
    public static Info getInstance(){
        if (instance == null) {
            instance == new Info();
        }
        return instance;
    }
    public  void input(){
        Data user = Data.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name :");
        String fname = sc.next();
        user.setFirstName(fname);
        System.out.println("Enter last name :");
        String lname = sc.next();
        user.setlastName(lname);

        addPhoneNumber();
    }

    public void addPhoneNumber(){
        Data user = Data.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Phone Number : ");
        String phoneNumber = sc.nextLine();
        boolean check = phoneNumber.matches("^([0-9]{1,2})-([0-9]{10})$");
        if (check == true) {
            user.setPhoneNumber(phoneNumber);

        } else {
            System.out.println("Invalid Phone Number format \nAdd again (Eg:91-9919819801)");
            addPhoneNumber();
        }
    }
    public String date() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formattedDate = date.format(dateFormat);
        return formattedDate;
}
    public void display(){
    Data user = Data.getInstance();
        System.out.println("Hello " + user.getLastName() + ", We have your full name " + user.getFirstName() + " "
                + user.getLastName() + " in our system. your contact number is " + user.getPhoneNumber() + ".\n"
                + "Please,let us know in case of any clarification Thank you BridgeLabz.\tDate  : " + date());
    }
}
