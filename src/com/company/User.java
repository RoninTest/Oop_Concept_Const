package com.company;

class User {

     String name;
     int age;
     String surname;
     String paymentType;


    public User(String name, String surname, int age) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        System.out.println(" 10 - Parent User Const works -1 const");

    }

    public User(String paymentType) {
        this.paymentType = paymentType;
        System.out.println(" 10 - Parent User Const works - 2 const");
    }



}
