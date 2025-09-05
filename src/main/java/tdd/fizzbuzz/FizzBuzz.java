package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countOff(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return ""+number;
    }
}
