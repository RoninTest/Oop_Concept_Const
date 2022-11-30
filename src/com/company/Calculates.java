package com.company;

import java.time.Year;

public class Calculates extends ClientInfo{

    public static int calculateBirthDay(){

        int clientAge=takeClientAge();
        int year= Year.now().getValue();

        return year - clientAge;

    }
}
