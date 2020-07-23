package junit5.tdd;

import javafx.animation.Animation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_number_when_FizzBuzz_play_given_number(){
        int number = 2;
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.play(number);
        assertEquals(String.valueOf(number),actual);
    }


    @Test
    public void should_return_Fizz_when_FizzBuzz_play_given_3(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 3;
        String actual = fizzbuzz.play(number);
        assertEquals("Fizz",actual);
    }

    @Test
    void should_return_Buzz_when_FizzBuzz_play_given_5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 5;
        String actual = fizzbuzz.play(number);
        assertEquals("Buzz",actual);
    }
}
