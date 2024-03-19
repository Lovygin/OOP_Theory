package Units;

public abstract class Unit implements InGameInterface {
    public float maxHp, curHp; // если класс в пакете (Units), то они по умолчанию private not public
                        // package "изолирует" данные
                        // нужно писать public
    private int atack, defence; // защита (protection)
    protected int[] damage; // protected - защищает данные в рамках пакета, т.е. видны только в рамках пакета
                            // то есть Main должен находиться в пакете Units для взаимодействия с полями
    protected String name;

    public Unit(float maxHp, int atack, int defence, int[] damage, String name) {
        this.maxHp = this.curHp = maxHp;
        this.atack = atack;
        this.defence = defence;
        this.damage = damage;
        this.name = name;
    }

    @Override
    public String getInfo() {
        return null;
    }

    protected boolean isDead(){ return false;} // Абстрактный класс, все юниты могут умереть
    protected void getDamage(){} // Абстрактный класс, все юниты могут получить урон
                                 // Логично данные методы вынести в абстрактный класс

}
