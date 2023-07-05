package solid.good.l;

public abstract class PlantWithFruitsAndLeaves extends Plant {

    public PlantWithFruitsAndLeaves(String name, int age) {
        super(name, age);
    }

    public abstract void growLeaves();

    public abstract void shedLeaves();

    public abstract void bearFruit();

}
