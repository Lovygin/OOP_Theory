package org.example;

import java.util.Random;

public class Cat extends Pet{
    public String name; // dynamic field
    public int age; // Загружаются при вызове new Cat
    public static int paws; // статическое количество лап = paw
                            // загружается при загрузке (импорте) класса Cat

    public static String getPaws() {
        return String.valueOf(paws);
    }



// Поведение класса - это набор всех публичных полей, которые у него есть. Все что он умеет делать.
///////// Внутренний конструктор со всеми полями //////

    /**
     * @param name
     * @apiNote Удобно, если в классе много полей, но только небольшое количество их будут уникальными,
     * остальные можно прописать hardCod-ом во внутреннем конструкторе
     */
    private Cat(String name, int age) { // Начальное состояние класса // this - the link to current class (Cat)
       super(14000);
        this.name = name;
        setAge(age);
        paws = 4;
    }
/////// Публичный конструктор ///////
//    public Cat(String name, int age) { // Начальное состояние класса
//        this.name = name;              // Для контроля содержимого полей
//        this.age = age;                // this - the link to current class (Cat)
//    }

    /**
     * @param name
     * @apiNote Удобно, если в классе много полей, но только небольшое количество их будут уникальными,
     * остальные можно прописать hardCod-ом во внутреннем конструкторе
     */
    public Cat(String name) { // Внешний конструктор принимает только одно поле
        this(name, new Random().nextInt(-10, 30)); // Ссылается на внутренний конструктор
//        this.name = name;
//        this.age = 0;
    }

    public int getAge() {
        return age;
    } //Защитить возраст от некорректно введенных данных

    public boolean setAge(int age) {
        if (age < 0 || age > 30) {
            this.age = 0;
            return false;
        } else {
            this.age = age;
            return true;
        }
    }

    @Override
    public String toString() {
        return "name is " + name
                + "; age=" + age + "; "
                + "number of paws is " + paws + "; "
                + super.toString();
    }
}