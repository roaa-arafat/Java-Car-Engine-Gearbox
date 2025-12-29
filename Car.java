package w11;

public class Car {

    private String Type;
    private int year;
    private String color;
    private Engine engine;
    private Gear_Box gerbox;

    public Car() {
    }

    public Car(Engine engine, Gear_Box gerbox) {
        this.engine = engine;
        this.gerbox = gerbox;
    }

    public Car(String Type, int year, String color) {
        this.Type = Type;
        this.year = year;
        this.color = color;
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

    public Gear_Box getGerbox() {
        return gerbox;
    }

    public void setGerbox(Gear_Box gerbox) {
        this.gerbox = gerbox;
    }

    @Override
    public String toString() {
        return "Car{" + "Type=" + Type + ", year=" + year + ", color=" + color + ", engine=" + engine + ", gerbox=" + gerbox + '}';
    }

}
