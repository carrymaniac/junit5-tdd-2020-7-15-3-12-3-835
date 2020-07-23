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

    @Test
    void should_return_Whizz_when_FizzBuzz_play_given_7() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 7;
        String actual = fizzbuzz.play(number);
        assertEquals("Whizz",actual);
    }

    @Test
    void should_return_FizzBuzz_when_FizzBuzz_play_given_15() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 15;
        String actual = fizzbuzz.play(number);
        assertEquals("FizzBuzz",actual);
    }

    @Test
    void should_return_FizzWhizz_when_FizzBuzz_play_given_21() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 21;
        String actual = fizzbuzz.play(number);
        assertEquals("FizzWhizz",actual);
    }

    @Test
    void should_return_FizzWhizz_when_FizzBuzz_play_given_35() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 35;
        String actual = fizzbuzz.play(number);
        assertEquals("BuzzWhizz",actual);
    }

    @Test
    void should_return_FizzWhizz_when_FizzBuzz_play_given_105() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int number = 105;
        String actual = fizzbuzz.play(number);
        assertEquals("FizzBuzzWhizz",actual);
    }

    @Test
    void should_return_all_result_when_FizzBuzz_playAll_given_15() {
        String expected = "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "Whizz\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "Whizz\n" +
                "FizzBuzz";
        Integer number = 15;
        FizzBuzz fizzbuzz = new FizzBuzz();
        String actual = fizzbuzz.playAll(number);
        assertEquals(expected,actual);
    }

}
