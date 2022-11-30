package com.company;

class NormalUser extends User {

    public NormalUser(String name, String surname, int age) {

        super(name, surname, age);

        System.out.println(" 12 - Normal User Const works" + " " +
                name + " " +
                surname + " " +
                age);

    }


}
