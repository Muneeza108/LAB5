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


public class MathUtilsTest {

    @Test
    public void testNegativeAltitudeThrowsException() {

        assertThrows(
                IllegalArgumentException.class,
                () -> MathUtils.calculateGravitationalPotentialEnergy(-10)
        );
    }

    @Test
    public void testValidAltitude() {

        double result =
                MathUtils.calculateGravitationalPotentialEnergy(100);

        assertEquals(981.0, result);
    }
}