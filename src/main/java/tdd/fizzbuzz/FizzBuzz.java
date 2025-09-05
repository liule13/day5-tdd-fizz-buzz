package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countOff(int order) {
        if (order % 3 == 0 && order % 5 != 0) {
            return "Fizz";
        }
        if (order % 5 == 0 && order % 3 != 0) {
            return "Buzz";
        }
        if (order % 15 == 0) {
            return "FizzBuzz";
        }

        return "" + order;
    }
}
