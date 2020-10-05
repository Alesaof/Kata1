package test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {

    private FizzBuzz fizzBuzz = new FizzBuzz();
    @Before
    public void setUp() throws Exception{
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void should_return_number_when_it_is_not_fizz_and_not_buzz(){
        assertEquals("1", fizzBuzz.get(1));
    }

    private class FizzBuzz {
        public String get(int number){
            return "1";
        }
    }
}
