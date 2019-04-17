package com.alex;

public class VipPerson {

    private String name;
    private double creditLimit;
    private String emailaddress;

    public VipPerson() {
        this("Default name", 50_000.00, "default@email.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipPerson(String name, double creditLimit, String emailaddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailaddress = emailaddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}

