package com.company;

class User {

     String name;
     int age;
     String surname;
     String paymentType;
     String country;
     String city;
     String street;
     int doorNo;


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

    public void Address (String country,String city, String street, int doorNo){
        this.country=country;
        this.city=city;
        this.street=street;
        this.doorNo=doorNo;

        System.out.println("I am Address in User" + getClass());
    }

}
