package com.company;

public class Mother extends Grandma {


     public Mother(int age, String name,
                  Birthplace birthplace, Nationality nationality) {
        super(age, name, birthplace, nationality);
    }
    void toDo(String make ,int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(make);
        }
    }
    final void toDo (String make ){
        System.out.println(make);
    }

    public String getInfo() {
        return super.getInfo();
    }
}

