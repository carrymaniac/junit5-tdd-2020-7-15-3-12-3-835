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
        assertEquals(number,actual);
    }
}
