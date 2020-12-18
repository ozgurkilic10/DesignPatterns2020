package week9;

public class CeilingFan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    private int speed = OFF;

    public void off(){
        speed = OFF;
        System.out.println("CF Off");
    }

    public void low(){
        speed = LOW;
    }


    public void medium(){
        speed = MEDIUM;
    }

    public void high(){
        speed = HIGH;
        System.out.println("CF High");
    }

    public int getSpeed() {
        return speed;
    }
}
