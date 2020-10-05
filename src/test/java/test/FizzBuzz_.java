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
    public void should_return_fizz_when_it_is_3(){
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
    }

    public class FizzBuzz {
        public String of(int number){
            return number == 3 ? "Fizz" : String.valueOf(number);
        }
    }
}
