/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lab5tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author natas
 */

public class AuthenticatorTest {

    @Test
    public void testMutableReturnCorruptsCachedValue() {

        Authenticator auth = new Authenticator();

        char[] id = auth.getMitId("Alice");

        for (int i = 0; i < 5; i++) {
            id[i] = '*';
        }

        char[] cachedId = auth.getMitId("Alice");

        assertEquals("*****6789", new String(cachedId));
    }

    @Test
    public void testSecureMethodReturnsString() {

        Authenticator auth = new Authenticator();

        String id = auth.getMitIdSecure("Bob");

        assertEquals("123456789", id);
    }
}