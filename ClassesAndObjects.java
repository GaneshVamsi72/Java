class Lamp {
    // Stores the value for the light
    // true if light is on
    // false if light is off
    boolean isOn;

    // method to turn on the light
    void turnon() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    // method to turn off the light
    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {
        // creates objects led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // turn on the light by calling method turnOn()
        led.turnon();

        // turn off the light by calling method turnOff()
        halogen.turnOff();
    }
}