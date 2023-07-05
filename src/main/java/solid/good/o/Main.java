package src.main.java.solid.good.o;

public class Main {
    public static void main(String args[]) {
        Car hatchback = new Hatchback();

        System.out.println("Car Model: " + hatchback.getModel());
        System.out.println("Color: " + hatchback.getColor());
        System.out.println("Wash Type: " + hatchback.getWashType());
        System.out.println("Seating Capacity: " + hatchback.getSeating());
        System.out.println("Mileage: " + hatchback.getMileage() + " km/l");
        System.out.println("Price: $" + hatchback.getPrice());
        System.out.println("Electric: " + hatchback.isElectric());
        System.out.println("Convertible: " + hatchback.isConvertible());
        System.out.println("Sunroof: " + hatchback.hasSunroof());
        System.out.println("Fuel Type: " + hatchback.getFuelType());
    }
}
