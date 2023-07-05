package src.main.java.solid.bad.s;

public class Main {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(1, 150);
        calculator.logOperation("Sum is : " + sum);

        int lcm = calculator.calculateLCM(4, 100);
        calculator.logOperation("LCM is : " + lcm);

        int average = calculator.calculateAverage(new int[] {1,2,3,4,5});
        calculator.logOperation("Average is : " + average);

        boolean isPalindrome = calculator.isPalindrome("12321");
        if(isPalindrome) {
            calculator.logOperation("The given string is a palindrome");
        } else {
            calculator.logError("The given string is not a palindrome");
        }

        boolean isOdd = calculator.isOdd(122);
        if(isOdd) {
            calculator.logOperation("The given number is Odd");
        } else {
            calculator.logError("The given number is not an odd number");
        }

        boolean isEven = calculator.isEven(122);
        if(isEven) {
            calculator.logOperation("The given number is even");
        } else {
            calculator.logError("The given number is not an even number");
        }
    }
}