package com.example.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void testUserCreationWithParameters() {
        String login = "ivanIvanov";
        String email = "ivan@google.com";

        User user = new User(email, login);

        Assertions.assertEquals(login, user.getLogin());
        Assertions.assertEquals(email, user.getEmail());
    }

    @Test
    public void testUserCreationWithoutParameters() {
        User user = new User();

        Assertions.assertNull(user.getLogin());
        Assertions.assertNull(user.getEmail());
    }

    @Test
    public void testUserEmailValidation() {
        String validEmail = Constants.CORRECT_EMAIL;
        String invalidEmail = Constants.ILLEGAL_CHARACTERS_EMAIL;

        User user = new User();

        Assertions.assertNotEquals(invalidEmail, user.getEmail());
        Assertions.assertEquals(validEmail, user.getEmail());
    }

    @Test
    public void testLoginEmailInequality() {
        String login = "ivanIvanov";
        String email = "ivan@google.com";

        User user = new User(email, login);

        Assertions.assertNotEquals(user.getLogin(), user.getEmail());
    }
}
