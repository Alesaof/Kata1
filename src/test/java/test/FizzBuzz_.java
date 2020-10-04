package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {
    @Test
    public void name(){
        String s = new FizzBuzz().get(1);
        assertEquals("1", s);
    }

    private class FizzBuzz {
        public String get(int number){
            return "1";
        }
    }
}
