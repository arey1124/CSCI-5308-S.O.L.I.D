package solid.bad.l;

public class Main {
    public static void main(String args[]) {
        Tree oakTree = new Tree("Oak", 10);

        oakTree.growLeaves();
        oakTree.shedLeaves();
        oakTree.bearFruit();
        oakTree.photosynthesis();
        oakTree.absorbWater();
        oakTree.produceSeeds();
        oakTree.provideShade();
        oakTree.undergoSeasonalChanges();
        oakTree.provideWood();
        oakTree.supportNesting();
        oakTree.preventSoilErosion();

        System.out.println("Tree name: " + oakTree.getName());
        System.out.println("Tree age: " + oakTree.getAge());

        System.out.println("--------------------------------");

        Cactus pricklyPear = new Cactus("Prickly Pear", 5);

        pricklyPear.growLeaves();
        pricklyPear.shedLeaves();
        pricklyPear.bearFruit();
        pricklyPear.photosynthesis();
        pricklyPear.absorbWater();
        pricklyPear.produceSeeds();
        pricklyPear.undergoSeasonalChanges();
        pricklyPear.preventSoilErosion();

        System.out.println("Cactus name: " + pricklyPear.getName());
        System.out.println("Cactus age: " + pricklyPear.getAge());
    }
}
