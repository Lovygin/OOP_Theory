package Units;

public class Monk extends Unit {
    public Monk(String name) {
        super(12, 2, 1, new int[]{-1, -3}, name);
        getInfo();
    }

    //public void cast(){}
    private void cast() {
    }

    @Override
    public void step() {
        cast();
        System.out.println(getInfo());
    }

    @Override
    public String getInfo() {
        return "Monk " + name;
    }

}
