package com.company;

public class GoldUser extends User{

    public GoldUser(String name, String surname, int age) {
        super(name, surname, age);

    }


    @Override
    public void Address(String country, String city, String street, int doorNo) {
        super.Address(country, city, street, doorNo);
        System.out.println("I am Address in GoldUser");
        System.out.println(country + city + street + doorNo +getClass());
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
