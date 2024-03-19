package Enumirator;

public enum Spell { // Заклинание
    FireRain(4, 8, "Amazing!"),
    FireBolt(3, 2, "Ok"),
    FireStrike(2, 1, "So so");
    private int damage, size;
    private String name;

    Spell(int damage, int size, String name) {
        this.damage = damage;
        this.size = size;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
