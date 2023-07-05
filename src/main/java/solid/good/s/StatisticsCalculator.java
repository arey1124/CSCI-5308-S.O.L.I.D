package src.main.java.solid.good.s;

/**
 *  responsible for statistical calculations,
 *  such as calculating the average and standard deviation of a set of numbers.
 */
public class StatisticsCalculator {
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
}
