package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "41, 41"})
    void numbers_not_divisible_by_3_or_5_to_strings(int number, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints =  {3, 6, 24} )
    void multiples_of_3_to_Fizz(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints =  {5, 10, 100} )
    void multiples_of_5_to_Buzz(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints =  {15, 45, 75} )
    void multiples_of_3_and_5_to_FizzBuzz(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.convert(number));
    }
}
