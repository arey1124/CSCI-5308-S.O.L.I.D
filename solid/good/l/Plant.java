package solid.good.l;

public abstract class Plant {

    private String name;
    private int age;

    public Plant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void photosynthesis() {
        System.out.println("Performing photosynthesis...");
    }

    public void absorbWater() {
        System.out.println("Absorbing water...");
    }

    public void produceSeeds() {
        System.out.println("Produces seeds...");
    }

    public void provideShade() {
        System.out.println("Provides shade...");
    }

    public void undergoSeasonalChanges() {
        System.out.println("Undergoes seasonal changes...");
    }

    public void provideWood() {
        System.out.println("Provides wood...");
    }

    public void supportNesting() {
        System.out.println("Supports Nesting...");
    }

    public void preventSoilErosion() {
        System.out.println("Prevents soil erosion...");
    }

    // Getters and setters for name and age

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
