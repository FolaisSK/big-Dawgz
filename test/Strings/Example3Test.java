package Strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Example3Test {
    private  Example3 ex;

    @BeforeEach
    public void setUp(){
         ex = new Example3();

    }

    @Test
    public void testOne(){
        String password = "1234dfssS@";
        assertTrue(ex.isValid(password));
    }
}
