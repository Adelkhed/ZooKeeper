public class Bat extends Mammal {

    public Bat() {
        this.energy = 300;
    }

    public void fly() {
        energy -= 50;
        System.out.println("The bat takes off and fly  And energy decreases by ---- 50");
        displayEnergy();
    }

    public void eatHumans() {
        energy += 25;
        System.out.println("The bat eat a human And  Energy increases by ---- 25");
        displayEnergy();
    }

    public void attackTown() {
        energy -= 100;
        System.out.println("The bat attacks a town   Energy decreases by ---- 100");
        displayEnergy();
    }
}
