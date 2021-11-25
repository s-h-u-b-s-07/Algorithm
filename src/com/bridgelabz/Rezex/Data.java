package com.bridgelabz.Rezex;

public class Data {

    private String firstName;
    private String LastName;
    private String phoneNumber;

    public static Data Instance;

    private Data(){
    }
    public static Data getInstance() {
        if (instance == null){
            instance = new Data();
        }
        return instance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "UserData [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
    }
}
