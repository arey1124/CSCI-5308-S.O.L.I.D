package solid.bad.s;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public int powerOfTwo(int exponent) {
        return (int) Math.pow(2, exponent);
    }

    public int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public int[] generateFibonacciSequence(int length) {
        int[] fibonacci = new int[length];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public boolean isPalindrome(String text) {
        StringBuilder builder = new StringBuilder(text);
        String reversed = builder.reverse().toString();
        return text.equals(reversed);
    }

    public double calculateStandardDeviation(int[] numbers) {
        double sum = 0.0;
        double average = calculateAverage(numbers);

        for (double number : numbers) {
            sum += Math.pow(number - average, 2);
        }

        return Math.sqrt(sum / numbers.length);
    }

    public int calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public int calculateGreatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGreatestCommonDivisor(b, a % b);
    }

    public int calculateLCM(int a, int b) {
        return (a * b) / calculateGreatestCommonDivisor(a, b);
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public void logOperation(String operation) {
        // Logging code here
        System.out.println(operation);
    }

    public void logError(String errorMessage) {
        // Error logging code here
        System.out.println(errorMessage);
    }
}