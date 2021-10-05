package com.company;

public class Main {
    public static void main(String[] args) {
        Birthplace birthplace = new Birthplace("California","№4");
        Grandma sasha = new Grandma(70,"Sasha", birthplace,Nationality.USA);
        System.out.println(sasha.getInfo());


        System.out.println("--------------------");
        birthplace = new Birthplace("California", "№3");
        Mother tomiris = new Mother(35,"Tomiris",birthplace,Nationality.KZ);
        System.out.println(tomiris.getInfo());
        tomiris.toDo("make cake");

        System.out.println("--------------------");
        birthplace = new Birthplace("KZ", "№3");
        Daughter masha = new Daughter(14,"Masha",birthplace,Nationality.RU);
        System.out.println(masha.getInfo());
        masha.toDo("play football",5);



    }
}
