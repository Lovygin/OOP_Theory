import Enumirator.Names;
import Enumirator.Spell;
import Units.Archer;
import Units.Monk;
import Units.Unit;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Cat persik = new Cat("Persik");
//        Cat barsik = new Cat("Barsik"); // Смотри приватный конструктор
//        barsik.setAge(12);
//        persik.setAge(4);
//        Cat sharchan = new Tiger("Sharchan",55.0f, true);
//
//        //System.out.println(Cat.getPaws());
//
//        //System.out.println(barsik.getPaws()); // нельзя обращаться к статическому параметру/методу через экземпляр класса. Только через сам класс
//
//        Cat.paws = 5; // устанавливаем статическое поле 1 раз
//                      // все наследники класса получают это значение
//
//        //System.out.println(Integer.toBinaryString(1235)); - classic static method
//
//        persik.setAge(4);
//        System.out.println(barsik);
//        System.out.println(persik);
//        System.out.println(sharchan);
//        sharchan.price = 40000.0f;
//        Pet pet = new Tiger("Scar");
//
//        ArrayList<Pet> pets = new ArrayList<>();
//        pets.add(new Tiger("Striped", 35.4f,false )); // Striped = полосатый
//
//        ((Cat)pets.get(0)).setAge(12); // Используем поведение класса Cat в классе Tiger через прямую кастомизацию.
//        System.out.println(pets.get(0)); // Обращаемся к тигру через get ArrayList-a
//
//        ((Tiger) pet).price = 450000.0f;
//        System.out.println(pet);
//
//        persik = null;
//        System.out.println(persik); // null
//
//        ArrayList<Pet> list = new ArrayList<>(); // Добавляем в список всех наследников класса Pet
//        list.add(new Tiger("Tiger"));
//
//        Pet pet2 = new Cat("Gav"); ((Cat) pet2).setAge(2);
//        pet2.setPrice(1000.0f);
//
//        System.out.println(pet2);

        Archer archer = new Archer("Robin");
        archer.curHp = 13;
        Monk monk = new Monk("Kirill");

        //archer.reArm(); // Методы приватные, их нет в интерфейсе, не можем использовать напрямую
        //monk.cast(); // Методы приватные, их нет в интерфейсе, не можем использовать напрямую


        ArrayList<Unit> list1 = new ArrayList<>();
        list1.add(new Archer("Hood"));
        list1.add(new Monk("Patriarch"));

        //list1.get(0).объект списка имеет только методы (поведение) Unit, так как список содержит Unit, а не наследников (Archer/Monk)
        //if (list1.get(0) instanceof Archer) ((Archer)list1.get(0)).reArm(); // Явная кастомизация

        list1.get(0).step(); // Эти методы предусмотрены интерфейсом и могут быть использованы в рамках абстрактного класса Unit
        list1.get(1).step(); // Эти методы включают поведение конкретного наследника
        System.out.println("==".repeat(20));
        list1.forEach(n -> n.step()); // итерация списка и вызов метода каждого наследника


        /**
         * Работа с энумератором
         */
        System.out.println("==".repeat(20));
        System.out.println(
                list1.get(1).getInfo() + " casted the magic and it happened is " +
                        Spell.FireStrike.getName());
    }

    /*
     * Работа с энумератором
     */

    /**
     * Метод возвращаюищий из энумератора случайное имя.
     *
     * @return
     */
    private String getName() {
        String s = Names.Sergey.toString(); // Обращаемся к конкретному имени в энумераторе
        String m = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]); //Берем из всех имен в энумераторе(Names.values()[по индексу]
        // Индекс выбираем случайно (Random) в периоде от 0 до послденего имени.
        return m;
    }

}