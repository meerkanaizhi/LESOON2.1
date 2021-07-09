package com.company;

import com.company.Color;
import com.company.Dog;
import com.company.Shelter;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Shelter romashka = new Shelter("Romashka", "Lermontova 18");

        Dog layka = new Dog("layka", "овчарка", Color.BLACK, romashka);

        Dog Sharik = new Dog("Sharik", "хакисо", Color.BROWN, romashka, new String[]{"Сидеть","Лежать","Кусать"});

        System.out.println(layka.getInfo());
        System.out.println("______________");
        System.out.println(Sharik.getInfo());


    }
}
