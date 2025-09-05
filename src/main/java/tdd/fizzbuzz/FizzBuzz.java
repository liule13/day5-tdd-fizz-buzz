package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countOff(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            return "Fizz";
        }
        if (number % 5 == 0 && number % 3 != 0) {
            return "Buzz";
        }

        return "" + number;
    }
}
