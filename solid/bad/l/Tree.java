package solid.bad.l;

public class Tree extends Plant {

    public Tree(String name, int age) {
        super(name, age);
    }

    @Override
    public void growLeaves() {
        System.out.println("Growing Leaves...");
    }

    @Override
    public void shedLeaves() {
        System.out.println("Sheding leaves...");
    }

    @Override
    public void bearFruit() {
        System.out.println("Bearing fruits...");
    }
}
