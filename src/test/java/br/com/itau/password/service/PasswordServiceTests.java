package br.com.itau.password.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordServiceTests {

    private PasswordService passwordService = new PasswordService();

    @Test
    void testPasswordOk() {
        assertTrue(passwordService.validate("Degar1234!"));
        assertTrue(passwordService.validate("AbTp9!fok"));
    }

    @Test
    void testPasswordNotOK() {
        assertFalse(passwordService.validate(""));
        assertFalse(passwordService.validate("aa"));
        assertFalse(passwordService.validate("ab"));
        assertFalse(passwordService.validate("AAAbbbCc"));
        assertFalse(passwordService.validate("AbTp9!foo"));
        assertFalse(passwordService.validate("AbTp9!foA"));
        assertFalse(passwordService.validate("AbTp9 fok"));

    }
}
