package src.main.java.solid.good.s;

/**
 * handle error logging, along with other potential logging-related methods.
 */
public class CalculatorLogger {
    public void logOperation(String operation) {
        System.out.println(operation);
    }

    public void logError(String errorMessage) {
        System.out.println(errorMessage);
    }
}
