package src.main.java.solid.good.s;
public class Main {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        NumberCalculator numberCalculator = new NumberCalculator();
        CalculatorLogger calculatorLogger = new CalculatorLogger();

        int sum = calculator.add(1, 150);
        calculatorLogger.logOperation("Sum is : " + sum);

        int average = statisticsCalculator.calculateAverage(new int[] {1,2,3,4,5});
        calculatorLogger.logOperation("Average is : " + average);

        boolean isPalindrome = numberCalculator.isPalindrome("12321");
        if(isPalindrome) {
            calculatorLogger.logOperation("The given string is a palindrome");
        } else {
            calculatorLogger.logError("The given string is not a palindrome");
        }
    }
}
