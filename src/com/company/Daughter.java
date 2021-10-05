package com.company;

public final class Daughter extends Mother {

    public Daughter(int age, String name,
                    Birthplace birthplace, Nationality nationality) {
        super(age, name, birthplace, nationality);
    }

    @Override
    void toDo(String make, int num) {
        super.toDo(make, num);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
