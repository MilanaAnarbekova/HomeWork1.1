package com.company;

public class Grandma {
    private int age;
    private String name;
    private Birthplace birthplace;
    private Nationality nationality;

    public Grandma(int age, String name,
                   Birthplace birthplace, Nationality nationality) {
        this.age = age;
        this.name = name;
        this.birthplace = birthplace;
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Birthplace getBirthplace() {
        return birthplace;
    }

    public Nationality nationality() {
        return nationality;
    }

    public String getInfo() {
        return "Age: " + age +
                "\nname " + name +
                "\nnationality: " + nationality +
                "\nbirthplace (city): " + birthplace.getCity() +
                "\nbirthplace (hospital): " + birthplace.getHospital();
    }
}
