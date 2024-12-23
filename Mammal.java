
public class Mammal {
    protected int energy;

    // Constructor
    public Mammal() {
        this.energy = 100;
    }

    public int displayEnergy() {
        System.out.println("Energy level: " + energy);
        return energy;
    }
}
