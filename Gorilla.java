
public class Gorilla extends Mammal {

    public void throwSomething() {
        energy -= 5;
        System.out.println("The gorilla has thrown something and Energy decreases by ---- 5");
        displayEnergy();
    }

    public void eatBananas() {
        energy += 10;
        System.out.println("The gorilla is satisfaction after eating bananas and Energy increases by ---- 10");
        displayEnergy();
    }

    public void climb() {
        energy -= 10;
        System.out.println("The gorilla has climbed a tree And Energy decreases by ---- 10");
        displayEnergy();
    }
}
