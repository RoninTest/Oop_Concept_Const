package com.company;

import java.util.Scanner;

public class PaymentInfo {


    public String takePaymentInfo(){
        System.out.println("Please, enter your Payment Type: ");
        Scanner inputPaymentType=new Scanner(System.in);

        return inputPaymentType.nextLine();
    }

    public String takeCreditNumber(){

        System.out.println("Please, enter your Credit Card Number: ");
        Scanner inputCreditCardNumber=new Scanner(System.in);

        return inputCreditCardNumber.nextLine();


    }
}
