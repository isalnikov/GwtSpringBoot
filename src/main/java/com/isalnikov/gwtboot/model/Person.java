package com.isalnikov.gwtboot.model;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;



public class Person {

   public Person(String nameArg, LocalDate birthdayArg,
            Sex genderArg, String emailArg) {
        name = nameArg;
        birthday = birthdayArg;
        gender = genderArg;
        email = emailArg;
    } 

    public enum Sex {

        MALE, FEMALE
    }
    LocalDate birthday;
    Sex gender;
    String email;

    private String name;

    public int getAge() {
        return birthday
                .until(IsoChronology.INSTANCE.dateNow())
                .getYears();
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
