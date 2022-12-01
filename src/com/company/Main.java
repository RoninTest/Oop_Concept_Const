package com.company;

public class Main {

    public static void main(String[] args) {

       ClientInfo clientInfo= new ClientInfo();
       PaymentInfo paymentInfo=new PaymentInfo();
       Calculates calculates=new Calculates();




       String name = clientInfo.takeClientName();
       String surname = clientInfo.takeClientSurname();
       int age = calculates.calculateBirthDay();


       String paymentType = paymentInfo.takePaymentInfo();

        PremiumUser premiumUser=new PremiumUser(name, surname, age);
        NormalUser normalUser=new NormalUser(name,surname,age);
        FirstUser firstUser=new FirstUser(paymentType);

        GoldUser goldUser1=new GoldUser(name,surname,age);
        goldUser1.setCountry("Turkey");
        System.out.println("Gold User - 1 Country "+ name + " " + surname + " : " + goldUser1.getCountry());

        goldUser1.Address("Turkey","Istanbul","Ataturk",32);


    }

    }






