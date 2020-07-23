package junit5.tdd;

public class FizzBuzz {

    String play(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if(number%7==0){
            return "Whizz";
        }
        return String.valueOf(number);
    }
}
