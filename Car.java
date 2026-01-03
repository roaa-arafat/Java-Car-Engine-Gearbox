package w11;

import java.util.ArrayList;

public class Car {

    private String Type;
    private int year;
    private String color;
    private Engine engine;
    private Gear_Box gearbox;
    private ArrayList<Wheel> wheels;

    public Car() {
    }

    public Car(String Type, int year, String color, Engine engine, Gear_Box gearbox, ArrayList<Wheel> wheels) {
        this.Type = Type;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.gearbox = gearbox;
        this.wheels = wheels;
    }

    public void turnOn(){
        System.out.println("Turning on car");
        engine.tunrOn();
        gearbox.turnOn();
    }
    
    public void turnOff(){
        System.out.println("Turning off car");
        engine.turnOff();
        gearbox.turnOff();
    }
    
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gear_Box getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gear_Box gearbox) {
        this.gearbox = gearbox;
    }

     public ArrayList<Wheel> getWheel() {
        return wheels;
    }

    public void setWheel(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" + "Type=" + Type + ", year=" + year + ", color=" + color + ", engine=" + engine + ", gearbox=" + gearbox + ", wheels=" + wheels + '}';
    }

    
    
}
