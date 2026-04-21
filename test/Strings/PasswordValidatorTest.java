package Strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {


    @Test
    @DisplayName(
            """
            Given:
            I have a PasswordValidator
            I have a password
            When:
            I call isPasswordValid with password as argument
            Assert:
            isPasswordValid
            """
    )
    public void testIsPasswordValid(){
        String  password = "password";
        boolean isPasswordValid = PasswordValidator.isPasswordValid(password);
        assertTrue(isPasswordValid);
    }

    @Test
    public void testisValidPasswordHas_8_to_26_Characters(){
        String password = "password";
        boolean isPasswordValid = PasswordValidator.isPasswordValid(password);
        assertTrue(isPasswordValid);
    }

    @Test
    public void testIsValidPasswordContainsDigits(){
        String password = "Password@1234";
        boolean isPasswordValid = PasswordValidator.isPasswordValid(password);
        assertTrue(isPasswordValid);
    }

    @Test
    public void testIsInValidPasswordWithoutDigits(){
        String password = "pass1234";
        boolean isPasswordValid = PasswordValidator.isPasswordValid(password);
        assertFalse(isPasswordValid);
    }

}
