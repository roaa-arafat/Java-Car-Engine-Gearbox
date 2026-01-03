
package w11;

public class Engine {
 
    private int Cylenders;
    private int horsePower;
    private int Capacity;

    public Engine() {
    }

    public Engine(int Cylenders, int horsePower, int Capacity) {
        this.Cylenders = Cylenders;
        this.horsePower = horsePower;
        this.Capacity = Capacity;
    }

    public void tunrOn(){
        System.out.println("Turning on engine...");
    }
    
    public void turnOff(){
        System.out.println("Turning off engine...");
    }
    
    public int getCylenders() {
        return Cylenders;
    }

    public void setCylenders(int Cylenders) {
        this.Cylenders = Cylenders;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    @Override
    public String toString() {
        return "Engine{" + "Cylenders=" + Cylenders + ", horsePower=" + horsePower + ", Capacity=" + Capacity + '}';
    }
    
    
    
}
