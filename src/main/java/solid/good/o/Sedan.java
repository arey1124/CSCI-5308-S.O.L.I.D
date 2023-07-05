package src.main.java.solid.good.o;

public class Sedan implements Car {
    @Override
    public String getModel() {
        return "Sedan";
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getWashType() {
        return "Foam Wash";
    }

    @Override
    public int getSeating() {
        return 5;
    }

    @Override
    public double getMileage() {
        return 12.5;
    }

    @Override
    public double getPrice() {
        return 25000.0;
    }

    @Override
    public boolean isElectric() {
        return false;
    }

    @Override
    public boolean isConvertible() {
        return false;
    }

    @Override
    public boolean hasSunroof() {
        return true;
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }
}
