package dssc.assignment.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public static void main(String... args) {
        
    }

    public String convert(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        else if (number % 3 == 0){
            return "Fizz";
        }
        else if (number % 5 == 0){
            return "Buzz";
        }
        else {
            return Integer.toString(number);
        }
    }

    public void print() {
        Stream<String> fizzBuzzes =  IntStream.range(1, 16).mapToObj(this::convert);
        System.out.print(fizzBuzzes.collect(Collectors.joining(", ")));
    }
}
