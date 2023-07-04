package solid.good.s;

/**
 * handles number-related calculations like finding the greatest common divisor,
 * calculating the least common multiple, and determining whether a number is even or odd.
 */
public class NumberCalculator {
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
}
