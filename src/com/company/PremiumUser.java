package com.company;

class PremiumUser extends User {


    public PremiumUser(String name, String surname, int age) {
        super(name, surname, age);
        System.out.println(" 11 - Premium User class const works" + " " +
                name + " " +
                surname + " " +
                age);
    }

}
