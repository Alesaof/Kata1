package test;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FizzBuzz_ {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Before
    public void setUp() throws Exception{
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number_when_it_is_not_fizz_and_not_buzz(){
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_3(){
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_5(){
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_15(){
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.of(30)).isEqualTo("FizzBuzz");
    }

    public class FizzBuzz {
        public String of(int number){
            if(isMultipleOfFifteen(number)) return "FizzBuzz";
            if(isMultipleOfFive(number)) return "Buzz";
            if (isMultipleOfThree(number)) return "Fizz";
            return String.valueOf(number);

        }

        private boolean isMultipleOfThree(int number) {
            return number % 3 == 0;
        }

        private boolean isMultipleOfFive(int number) {
            return number % 5 == 0;
        }

        private boolean isMultipleOfFifteen(int number) {
            return number % 15 == 0;
        }
    }
}
