package src.main.java.solid.good.o;

public class Hatchback implements Car {
    @Override
    public String getModel() {
        return "Hatchback";
    }

    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public String getWashType() {
        return "Hand Wash";
    }

    @Override
    public int getSeating() {
        return 4;
    }

    @Override
    public double getMileage() {
        return 15.2;
    }

    @Override
    public double getPrice() {
        return 18000.0;
    }

    @Override
    public boolean isElectric() {
        return true;
    }

    @Override
    public boolean isConvertible() {
        return false;
    }

    @Override
    public boolean hasSunroof() {
        return false;
    }

    @Override
    public String getFuelType() {
        return "Electric";
    }
}
