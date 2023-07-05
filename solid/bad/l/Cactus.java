package solid.bad.l;

public class Cactus extends Plant {

    public Cactus(String name, int age) {
        super(name, age);
    }

    @Override
    public void growLeaves() {
        // Cactus plant does not have leaves
        System.out.println("Error: Cactus does not grow leaves...");
    }

    @Override
    public void shedLeaves() {
        // Cactus plant does not have leaves
        System.out.println("Error: Cactus does not shed leaves...");
    }

    @Override
    public void bearFruit() {
        // Cactus plant does not bear fruits
        System.out.println("Error: Cactus does not bear fruits...");
    }
}
