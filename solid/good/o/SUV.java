package solid.good.o;

public class SUV implements Car {
    @Override
    public String getModel() {
        return "SUV";
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public String getWashType() {
        return "Pressure Wash";
    }

    @Override
    public int getSeating() {
        return 7;
    }

    @Override
    public double getMileage() {
        return 9.8;
    }

    @Override
    public double getPrice() {
        return 40000.0;
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
        return "Diesel";
    }
}
