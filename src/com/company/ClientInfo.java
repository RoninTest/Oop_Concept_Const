package com.company;


import java.util.Scanner;

public class ClientInfo {


        public static String takeClientName(){
            System.out.println("Please, enter your name : ");
            Scanner inputName=new Scanner(System.in);

            return inputName.next();
        }

        public static String takeClientSurname(){
            System.out.println("Please, enter your surname : ");
            Scanner inputSurname=new Scanner(System.in);


            return inputSurname.next();
        }

        public static int takeClientAge(){
            System.out.println("Please, enter your Birth Date Year : ");
            Scanner inputAge=new Scanner(System.in);

            return inputAge.nextInt();
        }



    }

