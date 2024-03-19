package Cats;

public class Tiger extends Cat {
    public float speed;
    public boolean dangerous;

    public Tiger(String name, float speed, boolean dangerous) {
        super(name); // super - публичный конструктор Cat (super class), который принимает только 1 параметр (name)
        this.speed = speed;
        this.dangerous = dangerous;
    }

    public Tiger(String name) {
        super(name); // super - конструктор Cat (super class)
    }
    public Tiger(String name, int age) {
        super(name); // super - конструктор Cat (super class) - публичный конструктор принимает только
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public String toString() {
        return super.toString() + "; "
                + "Speed = " + speed
                + "; Dangerous? : " + dangerous;
    }

//    @Override
//    public String toString() {
//        return "Tiger{" +
//                "speed=" + speed +
//                ", dangerous=" + dangerous +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
