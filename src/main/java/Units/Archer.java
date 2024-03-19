package Units;

public class Archer extends Unit{
    public Archer(String name) {
        super(12, 2, 1, new int[]{-1, -3}, name);
    }

    //public void reArm(){}
    private void reArm(){}
    //public void fire(){}
    private void fire(){}
    @Override
    public void step() {
        reArm();
        fire();
        System.out.println(getInfo());
    }
    @Override
    public String getInfo(){
        return "Archer " + name;
    }
}
