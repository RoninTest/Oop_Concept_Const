package com.company;

class FirstUser extends User {

    PaymentInfo paymentInfo=new PaymentInfo();

    public FirstUser(String paymentType) {
        super(paymentType);
        System.out.println(" 13 - First User class const works" + " " + paymentType);
        String clientCreditCardNumber = paymentInfo.takeCreditNumber();
        if (clientCreditCardNumber.length() == 16 ){
            System.out.println("Thank you");
        }
        else System.out.println(" Credit Card Number have to be 16 digit ... ");
    }
}
