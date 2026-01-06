interface Bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle {

    int speed = 7;

    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }
}

public class Interfaces{
    public static void main(String[] args) {
        Bicycle c = new AvonCycle();
        c.applyBrake(4);
        c.speedUp(4);
    }
}

