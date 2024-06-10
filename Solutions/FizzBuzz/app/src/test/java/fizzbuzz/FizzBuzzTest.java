package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testFizz(){
        var fizzbuzz = new FizzBuzz();
        assertEquals("Fizz", fizzbuzz.play(3));
        assertEquals("Fizz", fizzbuzz.play(6));
        assertEquals("Fizz", fizzbuzz.play(9));
    }

    @Test
    void testBuzz(){
        var fizzbuzz = new FizzBuzz();
        assertEquals("Buzz", fizzbuzz.play(5));
        assertEquals("Buzz", fizzbuzz.play(10));
        assertEquals("Buzz", fizzbuzz.play(20));
    }
}
