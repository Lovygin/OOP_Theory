package org.example;

import java.util.Random;

public class Cat extends Pet{
    public String name; // dynamic field public - поле, которое видно за пределами класса
    private int age; // Загружаются при вызове new Cat
    public static int paws; // статическое количество лап = paw
                            // загружается при загрузке (импорте) класса Cat

    /**
     * Public constructor
     */
//    public Cat(String name, int age) { // Начальное состояние класса
//        this.name = name;              // Для контроля содержимого полей
//        this.age = age;                // this - the link to current class (Cat)
//    }

    /**
     * @return the number of paws (лап) in string format
     */
    public static String getPaws() {
        return String.valueOf(paws);
    }

///////// Внутренний конструктор со всеми полями //////
    /**
     * @param name
     * @apiNote Удобно, если в классе много полей, но только небольшое количество их будут уникальными,
     * остальные можно прописать hardCod-ом во внутреннем конструкторе
     */
    private Cat(String name, int age) { // Начальное состояние класса // this - the link to current class (Cat)
       super(14000); //super - the link to parent (Pet)
        this.name = name;
        setAge(age); // Передает значение возраста в метод проверяющий (тестирующий) его на логику.
        paws = 4;
    }

    /**
     * public constructor
     * @param name
     * @apiNote Удобно, если в классе много полей, но только небольшое количество их будут уникальными,
     * остальные можно прописать hardCode-ом во внутреннем конструкторе
     */
    public Cat(String name) { // Внешний конструктор принимает только одно поле
        this(name, new Random().nextInt(-10, 40)); // Ссылается на внутренний конструктор
                                                                // Используется Random, но может быть значение по умолчанию
    }

    public int getAge() {
        return age;
    }

    /**
     * Проверяет достоверность (логическую возможность) данного значения.
     * Если значение правильно (логично), то присваивает его параметру класса.
     * Если нет, то параметру класса присваивает 0.
     * @param age
     * @return
     */
    public boolean setAge(int age) {
        if (age < 0 || age > 30) {
            this.age = 0;
            return false;
        } else {
            this.age = age;
            return true;
        }
    }

    @Override // Полиморфизм - это возможность переопределить поведение (методы) уже определенное поведение класса
    public String toString() {
        return "name is " + name
                + "; age=" + age + "; "
                + "the number of paws is " + paws + "; "
                + super.toString();
    }
}