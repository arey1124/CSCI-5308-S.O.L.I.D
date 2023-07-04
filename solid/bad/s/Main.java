package solid.bad.s;

public class Main {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        int average = calculator.calculateAverage(new int[] {1,2,3,4,5});
        calculator.logOperation("Average is : " + average);

        boolean isPalindrome = calculator.isPalindrome("12321");
        if(isPalindrome) {
            calculator.logOperation("The given string is a palindrome");
        } else {
            calculator.logError("The given string is not a palindrome");
        }
    }
}