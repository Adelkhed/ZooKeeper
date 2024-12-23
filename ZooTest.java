public class ZooTest {
    public static void main(String[] args) {
        // Test du gorille
        System.out.println("Testing Gorilla:");
        Gorilla gorilla = new Gorilla();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb();
        gorilla.displayEnergy();

        // Test de la chauve-souris
        System.out.println("\nTesting Bat:");
        Bat bat = new Bat();
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
        bat.displayEnergy();
    }
}
