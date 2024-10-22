package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void oneIsOne() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String actual = fizzBuzz.convert(1);

        // Assert
        assertEquals("1", actual);
    }
}
