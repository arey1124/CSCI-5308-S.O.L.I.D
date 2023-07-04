package solid.bad.o;

public class CarManager {
    /**
     * Gets the available car colours based on the model
     * @param model
     * @return
     */
    public String getColor(String model) {
        if (model.equals("Sedan")) {
            return "Red";
        } else if (model.equals("SUV")) {
            return "Blue";
        } else if (model.equals("Hatchback")) {
            return "Yellow";
        }
        return "Unknown";
    }

    /**
     * Gets the wash type based on the model
     * @param model
     * @return
     */
    public String getWashType(String model) {
        if (model.equals("Sedan")) {
            return "Foam Wash";
        } else if (model.equals("SUV")) {
            return "Pressure Wash";
        } else if (model.equals("Hatchback")) {
            return "Hand Wash";
        }
        return "Unknown";
    }

    /**
     * Gets the available car seating based on the model
     * @param model
     * @return
     */
    public int getSeating(String model) {
        if (model.equals("Sedan")) {
            return 5;
        } else if (model.equals("SUV")) {
            return 7;
        } else if (model.equals("Hatchback")) {
            return 4;
        }
        return 0;
    }

    /**
     * Gets the mileage based on the model
     * @param model
     * @return
     */
    public double getMileage(String model) {
        if (model.equals("Sedan")) {
            return 12.5;
        } else if (model.equals("SUV")) {
            return 9.8;
        } else if (model.equals("Hatchback")) {
            return 15.2;
        }
        return 0.0;
    }

    /**
     * Gets the car price based on the model
     * @param model
     * @return
     */
    public double getPrice(String model) {
        if (model.equals("Sedan")) {
            return 25000.0;
        } else if (model.equals("SUV")) {
            return 40000.0;
        } else if (model.equals("Hatchback")) {
            return 18000.0;
        }
        return 0.0;
    }

    /**
     * Gets the is the car is electric based on the model
     * @param model
     * @return
     */
    public boolean isElectric(String model) {
        if (model.equals("Sedan")) {
            return false;
        } else if (model.equals("SUV")) {
            return false;
        } else if (model.equals("Hatchback")) {
            return true;
        }
        return false;
    }

    /**
     * Gets the car is convertible based on the model
     * @param model
     * @return
     */
    public boolean isConvertible(String model) {
        if (model.equals("Sedan")) {
            return false;
        } else if (model.equals("SUV")) {
            return false;
        } else if (model.equals("Hatchback")) {
            return false;
        }
        return false;
    }

    /**
     * Gets the car has sunroof based on the model
     * @param model
     * @return
     */
    public boolean hasSunroof(String model) {
        if (model.equals("Sedan")) {
            return true;
        } else if (model.equals("SUV")) {
            return true;
        } else if (model.equals("Hatchback")) {
            return false;
        }
        return false;
    }

    /**
     * Gets the car's fuel type based on the model
     * @param model
     * @return
     */
    public String getFuelType(String model) {
        if (model.equals("Sedan")) {
            return "Petrol";
        } else if (model.equals("SUV")) {
            return "Diesel";
        } else if (model.equals("Hatchback")) {
            return "Electric";
        }
        return "Unknown";
    }
}
