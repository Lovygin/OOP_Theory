package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat persik = new Cat("Persik");
        Cat barsik = new Cat("Barsik"); // Смотри приватный конструктор
        barsik.setAge(12);
        persik.setAge(4);
        Cat sharchan = new Tiger("Sharchan",55.0f, true);

        //System.out.println(Cat.getPaws());

        //System.out.println(barsik.getPaws()); // нельзя обращаться к статическому параметру/методу через экземпляр класса. Только через сам класс

        Cat.paws = 5; // устанавливаем статическое поле 1 раз
                      // все наследники класса получают это значение

        //System.out.println(Integer.toBinaryString(1235)); - classic static method

        persik.setAge(4);
        System.out.println(barsik);
        System.out.println(persik);
        System.out.println(sharchan);
        sharchan.price = 40000.0f;
        Pet pet = new Tiger("Scar");

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Tiger("Striped", 35.4f,false )); // Striped = полосатый

        ((Cat)pets.get(0)).setAge(12); // Используем поведение класса Cat в классе Tiger через прямую кастомизацию.
        System.out.println(pets.get(0)); // Обращаемся к тигру через get ArrayList-a

        ((Tiger) pet).price = 450000.0f;
        System.out.println(pet);

        persik = null;
        System.out.println(persik); // null

        ArrayList<Pet> list = new ArrayList<>(); // Добавляем в список всех наследников класса Pet
        list.add(new Tiger("Tiger"));

        Pet pet2 = new Cat("Gav"); ((Cat) pet2).setAge(2);
        pet2.setPrice(1000.0f);

        System.out.println(pet2);


    }
}