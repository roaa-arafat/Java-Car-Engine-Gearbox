
package w11;

public class Test_Car {
    public static void main(String[] args) {
        
         Engine e1= new Engine();
        e1.setCylenders(3);
        e1.setHorsePower(250);
        e1.setCapacity(2000);
        
        Gear_Box g1 = new Gear_Box();
        g1.setShift(7);
        g1.setAutomatic(true);
        
        
        Car c= new Car();
        c.setType("Ferrari");
        c.setYear(2022);
        c.setColor("Black");
        c.setEngine(e1);
        c.setGerbox(g1);
        
        System.out.println(c);
        
    }
}
