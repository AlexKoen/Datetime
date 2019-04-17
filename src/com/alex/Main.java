package com.alex;

public class Main {

    public static void main(String[] args) {

        Account alexAccount = new Account("4235924501", 0.00, "alexkoen@zxx.com",
                "Alex Koen", " (082)384-6446");
        System.out.println("Account number " + alexAccount.getNumber());

        alexAccount.deposit(50.00);
        alexAccount.withdrawal(100.00);

        alexAccount.deposit(51.50);
        alexAccount.withdrawal(100);

        System.out.println("*************************");

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson();
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson();
        System.out.println(person3.getCreditLimit()+ person3.getEmailaddress() + person3.getName());


    }
}
