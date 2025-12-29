
package w11;

public class Gear_Box{
    
     private int shift;
    private boolean automatic;

    public Gear_Box() {
    }

    public Gear_Box(int shift, boolean automatic) {
        this.shift = shift;
        this.automatic = automatic;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "Ger_Box{" + "shift=" + shift + ", automatic=" + automatic + '}';
    }
    
    
    
    }
