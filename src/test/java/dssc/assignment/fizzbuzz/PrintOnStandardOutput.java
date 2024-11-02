package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintOnStandardOutput {
    private static final String FIZZBUZZES_1_TO_100 = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz";

    @Test
    void numbers_from_1_to_100() {
        ByteArrayOutputStream fakeStandardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStandardOutput));

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.print();

        assertEquals(FIZZBUZZES_1_TO_100, fakeStandardOutput.toString());
    }
}
