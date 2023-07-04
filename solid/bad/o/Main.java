package solid.bad.o;

public class Main {
    public static void main(String args[]) {
        String carType = "Sedan";
        CarManager carManager = new CarManager();
        System.out.println("Requested details for : " + carType);
        System.out.println("Color: " + carManager.getColor(carType));
        System.out.println("Wash Type: " + carManager.getWashType(carType));
        System.out.println("Seating Capacity: " + carManager.getSeating(carType));
        System.out.println("Mileage: " + carManager.getMileage(carType) + " km/l");
        System.out.println("Price: $" + carManager.getPrice(carType));
        System.out.println("Electric: " + carManager.isElectric(carType));
        System.out.println("Convertible: " + carManager.isConvertible(carType));
        System.out.println("Sunroof: " + carManager.hasSunroof(carType));
        System.out.println("Fuel Type: " + carManager.getFuelType(carType));
    }
}
